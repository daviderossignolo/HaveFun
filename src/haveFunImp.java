import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import value.*;
import java.util.*;
import antlr.*;

public class haveFunImp extends HaveFunBaseVisitor<Value> {

    private final LinkedList<Conf> conf;        // stack di env
    private final Set<FunValue> funzioni;       // funzioni

    private final Conf arnold;                  // memoria arnoldC

    public haveFunImp(Conf conf) {
        this.conf = new LinkedList<>();
        this.conf.add(conf);
        this.funzioni = new HashSet<>();
        this.arnold = new Conf();
    }

    @Override
    public Value visitErrorNode(ErrorNode node) {
        System.err.println("Error! Your program doesn't respect the grammar!");
        System.exit(1);

        return null;
    }

    private ComValue visitCom(HaveFunParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(HaveFunParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(HaveFunParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(HaveFunParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitProg(HaveFunParser.ProgContext ctx) {
        visitFun(ctx.fun());

        for (HaveFunParser.GlobContext glob : ctx.glob()) {
            visitGlob(glob);
        }

        return visitCom(ctx.com());
    }

    private FunValue visitFun(HaveFunParser.FunContext fun) {
        return (FunValue) visit(fun);
    }

    @Override
    public ComValue visitIf(HaveFunParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(HaveFunParser.AssignContext ctx) {
        try {
            if (ctx.GLOBAL().getText().equals("global")) {
                System.err.println("Type mismatch exception!");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
                System.err.println("> Global not expected.");
                System.exit(1);
            }
        } catch (Exception e) {
        }

        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        conf.getLast().update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlob(HaveFunParser.GlobContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        conf.getFirst().updateGlobal(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlobAssign(HaveFunParser.GlobAssignContext ctx) {
        try {
            if (ctx.GLOBAL().getText().equals("global")) {
                System.err.println("Type mismatch exception!");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
                System.err.println("> Global not expected.");
                System.exit(1);
            }
        } catch (Exception e) {
        }

        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        // aggiorno var globale nell'env
        conf.getFirst().updateGlobal(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(HaveFunParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(HaveFunParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(HaveFunParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(HaveFunParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(HaveFunParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(HaveFunParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(HaveFunParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(HaveFunParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(HaveFunParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(HaveFunParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.DIV -> new NatValue(left / right);
            case HaveFunParser.MUL -> new NatValue(left * right);
            case HaveFunParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(HaveFunParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.PLUS -> new NatValue(left + right);
            case HaveFunParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(HaveFunParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.EQQ -> new BoolValue(left.equals(right));
            case HaveFunParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(HaveFunParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!conf.getLast().contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return conf.getLast().get(id);
    }

    @Override
    public BoolValue visitCmpExp(HaveFunParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.GEQ -> new BoolValue(left >= right);
            case HaveFunParser.LEQ -> new BoolValue(left <= right);
            case HaveFunParser.LT  -> new BoolValue(left < right);
            case HaveFunParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(HaveFunParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.AND -> new BoolValue(left && right);
            case HaveFunParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitFunAccess(HaveFunParser.FunAccessContext ctx) {
        // Recupero id funzione e parametri
        String funId = ctx.ID().getText();
        List<HaveFunParser.ExpContext> parametri = ctx.exp();

        for(FunValue fun : funzioni){
            if(fun.getFun().equals(funId)){
                // controllo il numero di parametri
                if(parametri.size() != fun.getParams().size()){
                    System.err.println("Function " + ctx.ID().getText() + " called with the wrong number of parameters");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }

                // env locale della funzione
                Conf localMem = new Conf();
                int index = 0;

                // inserisco i parametri nell'env della funzione
                for(String id: fun.getParams()){
                    localMem.update(id, visitExp(parametri.get(index)));
                    index++;
                }

                // aggiungo a conf l'env della funzione
                conf.add(localMem);

                // recupero il corpo
                HaveFunParser.ComContext c = fun.getCorpo();
                if(c != null) {
                    visitCom(c);
                }

                // salvo la variabile di ritorno prima di eliminare l'env
                ExpValue<?> ritorno = visitExp(fun.getRitorno());

                // elimino dalla configurazione l'ambiente della funzione
                conf.removeLast();

                return ritorno;
            }
        }

        System.err.println("Function " + ctx.ID().getText() + " used but never declared");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);

        return null;
    }

    @Override
    public Value visitFunDecl(HaveFunParser.FunDeclContext ctx) {
        // recupero id e parametri
        String funId = ctx.ID(0).getText();
        List<TerminalNode> variable = ctx.ID();

        // rimuovo il nome della funzione
        variable.remove(0);
        ArrayList<String> params = new ArrayList<>();

        if(!variable.isEmpty()){
            for(TerminalNode x : variable){
                // controllo parametri
                if(params.contains(x.getText())){
                    System.err.println("Param " + x.getText() + " clashes with previous parameters");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
                else{
                    // aggiungo il parametro alla lista
                    params.add(x.getText());
                }
            }
        }
        FunValue newFunction = new FunValue(funId, params, ctx.com(), ctx.exp());

        for(FunValue f : funzioni){
            // controllo se la funzione è già definita
            if(f.getFun().equals(funId)){
                System.err.println("Function " + newFunction.getFun() + " already defined");
                System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                System.exit(1);
            }
        }

        funzioni.add(newFunction);

        return visitFun(ctx.fun());
    }

    @Override
    public ExpValue<?> visitGlobalAccess(HaveFunParser.GlobalAccessContext ctx) {
        String id = ctx.ID().getText();

        if (!conf.getFirst().containsGlobal(id)) {
            System.err.println("Global variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }

        return conf.getFirst().getGlobal(id);
    }

    @Override
    public ComValue visitGlobalVar(HaveFunParser.GlobalVarContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> val = visitExp(ctx.exp());

        // aggiorno la var globale nell'env
        if (!conf.getFirst().containsGlobal(id)) {
            conf.getFirst().updateGlobal(id, val);
        }

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitNonDet(HaveFunParser.NonDetContext ctx) {
        int choice = (int) Math.round( Math.random() );

        return visitCom(ctx.com(choice));
    }
    public ExpValue<?> visitArnExp(HaveFunParser.ArnExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private double visitArnDoubleExp(HaveFunParser.ArnExpContext ctx) {
        try {
            return ((DoubleValue) visitArnExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Double expression expected.");
            System.exit(1);
        }

        return 0.0;
    }

    private boolean visitArnBoolExp(HaveFunParser.ArnExpContext ctx) {
        try {
            return ((BoolValue) visitArnExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Bool expression expected.");
            System.exit(1);
        }

        return false;
    }

    @Override
    public Value visitArnold(HaveFunParser.ArnoldContext ctx) {
        return visitArnCom(ctx.arnCom());
    }

    private ComValue visitArnCom(HaveFunParser.ArnComContext ctx) {
        return (ComValue) visit(ctx);
    }

    @Override
    public Value visitArnBool(HaveFunParser.ArnBoolContext ctx) {
        if(ctx.BOOLC().getText().equals("@NO PROBLEMO"))
            return new BoolValue(true);
        else{
            return new BoolValue(false);
        }
    }

    @Override
    public Value visitArnDuble(HaveFunParser.ArnDubleContext ctx) {
        return new DoubleValue(Double.parseDouble(ctx.DOUBLE().getText()));
    }

    @Override
    public Value visitArnComp(HaveFunParser.ArnCompContext ctx) {
        double left = visitArnDoubleExp(ctx.arnExp(0));
        double right = visitArnDoubleExp(ctx.arnExp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.ARNGT -> new BoolValue(left > right);
            case HaveFunParser.ARNEQQ -> new BoolValue(left == right);
            default -> null;
        };
    }

    @Override
    public Value visitArnOrAnd(HaveFunParser.ArnOrAndContext ctx) {
        boolean left = visitArnBoolExp(ctx.arnExp(0));
        boolean right = visitArnBoolExp(ctx.arnExp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.ARNAND -> new BoolValue(left && right);
            case HaveFunParser.ARNOR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitArnComSeq(HaveFunParser.ArnComSeqContext ctx) {
        visitArnCom(ctx.arnCom(0));
        return visitArnCom(ctx.arnCom(1));
    }

    @Override
    public Value visitArnOut(HaveFunParser.ArnOutContext ctx) {
        System.out.println(visitArnExp(ctx.arnExp()));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitArnId(HaveFunParser.ArnIdContext ctx) {
        String arnId = ctx.ID().getText();

        if (!arnold.contains(arnId)) {
            System.err.println("Variable " + arnId + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return arnold.get(arnId);
    }

    @Override
    public Value visitArnVarAssign(HaveFunParser.ArnVarAssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitArnExp(ctx.arnExp());

        arnold.update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public Value visitArnIf(HaveFunParser.ArnIfContext ctx) {
        return visitArnBoolExp(ctx.arnExp())
                ? visitArnCom(ctx.arnCom(0))
                : visitArnCom(ctx.arnCom(1));
    }

    @Override
    public Value visitArnOp(HaveFunParser.ArnOpContext ctx) {
        double left = visitArnDoubleExp(ctx.arnExp(0));
        double right = visitArnDoubleExp(ctx.arnExp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.ARNDIV -> new DoubleValue(left / right);
            case HaveFunParser.ARNMUL -> new DoubleValue(left * right);
            case HaveFunParser.ARNPLUS -> new DoubleValue(left + right);
            case HaveFunParser.ARNMINUS -> new DoubleValue(left - right);
            default -> null;
        };
    }

    @Override
    public Value visitArnString(HaveFunParser.ArnStringContext ctx) {
        String txt = ctx.STRING().getText();
        return new StringValue(txt.substring(1,txt.length()-1));
    }

    @Override
    public Value visitArnWhile(HaveFunParser.ArnWhileContext ctx) {
        if (!visitArnBoolExp(ctx.arnExp()))
            return ComValue.INSTANCE;

        visitArnCom(ctx.arnCom());

        return visitArnWhile(ctx);
    }

    @Override
    public Value visitArnVarDecl(HaveFunParser.ArnVarDeclContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitArnExp(ctx.arnExp());

        arnold.update(id, v);

        return ComValue.INSTANCE;
    }
}
