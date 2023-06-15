package antlr;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaveFunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaveFunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaveFunParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HaveFunParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDecl}
	 * labeled alternative in {@link HaveFunParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(HaveFunParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link HaveFunParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(HaveFunParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaveFunParser#glob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlob(HaveFunParser.GlobContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globAssign}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobAssign(HaveFunParser.GlobAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDet}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDet(HaveFunParser.NonDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(HaveFunParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnold}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnold(HaveFunParser.ArnoldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalVar}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVar(HaveFunParser.GlobalVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(HaveFunParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(HaveFunParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(HaveFunParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HaveFunParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(HaveFunParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(HaveFunParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(HaveFunParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HaveFunParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funAccess}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunAccess(HaveFunParser.FunAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(HaveFunParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HaveFunParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(HaveFunParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(HaveFunParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(HaveFunParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(HaveFunParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAccess}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAccess(HaveFunParser.GlobalAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(HaveFunParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HaveFunParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnIf}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnIf(HaveFunParser.ArnIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnVarDecl}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnVarDecl(HaveFunParser.ArnVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnVarAssign}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnVarAssign(HaveFunParser.ArnVarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnWhile}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnWhile(HaveFunParser.ArnWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnOut}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnOut(HaveFunParser.ArnOutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnComSeq}
	 * labeled alternative in {@link HaveFunParser#arnCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnComSeq(HaveFunParser.ArnComSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnOp}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnOp(HaveFunParser.ArnOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnId}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnId(HaveFunParser.ArnIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnBool}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnBool(HaveFunParser.ArnBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnString}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnString(HaveFunParser.ArnStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnOrAnd}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnOrAnd(HaveFunParser.ArnOrAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnDuble}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnDuble(HaveFunParser.ArnDubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnComp}
	 * labeled alternative in {@link HaveFunParser#arnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnComp(HaveFunParser.ArnCompContext ctx);
}