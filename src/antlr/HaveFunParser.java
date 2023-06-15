package antlr;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HaveFunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FUN=8, RETURN=9, 
		ND=10, NAT=11, BOOL=12, STRING=13, PLUS=14, MINUS=15, MUL=16, DIV=17, 
		MOD=18, POW=19, AND=20, OR=21, EQQ=22, NEQ=23, LEQ=24, GEQ=25, LT=26, 
		GT=27, NOT=28, IF=29, THEN=30, ELSE=31, WHILE=32, SKIPP=33, ASSIGN=34, 
		OUT=35, LPAR=36, RPAR=37, LBRACE=38, RBRACE=39, SEMICOLON=40, GLOBAL=41, 
		MAINSTART=42, MAINEND=43, ARNOUT=44, DOLLAR=45, DOUBLE=46, ARNIF=47, ARNELSE=48, 
		ARNIFEND=49, ARNWHILE=50, ARNWHILEND=51, BOOLC=52, ARNGT=53, ARNEQQ=54, 
		ARNOR=55, ARNAND=56, ARNMUL=57, ARNDIV=58, ARNPLUS=59, ARNMINUS=60, ID=61, 
		WS=62;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_glob = 2, RULE_com = 3, RULE_exp = 4, 
		RULE_arnCom = 5, RULE_arnExp = 6;
	private static String[] makeRuleNames() {
		return new String[] {
                "prog", "fun", "glob", "com", "exp", "arnCom", "arnExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.g'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", "'GET TO THE CHOPPER'", 
			"'HERE IS MY INVITATION'", "'ENOUGH TALK'", "'fun'", "'return'", "'nd'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'('", "')'", "'{'", "'}'", 
			"';'", "'global'", "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'TALK TO THE HAND'", 
			"'$'", null, "'BECAUSE I'M GOING TO SAY PLEASE'", "'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", 
			"'STICK AROUND'", "'CHILL'", null, "'LET OFF SOME STEAM BENNET'", "'YOU ARE NOT YOU YOU ARE ME'", 
			"'CONSIDER THAT A DIVORCE'", "'KNOCK KNOCK'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
			"'GET UP'", "'GET DOWN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FUN", "RETURN", "ND", 
			"NAT", "BOOL", "STRING", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", 
			"AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", 
			"ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SEMICOLON", "GLOBAL", "MAINSTART", "MAINEND", "ARNOUT", "DOLLAR", 
			"DOUBLE", "ARNIF", "ARNELSE", "ARNIFEND", "ARNWHILE", "ARNWHILEND", "BOOLC", 
			"ARNGT", "ARNEQQ", "ARNOR", "ARNAND", "ARNMUL", "ARNDIV", "ARNPLUS", 
			"ARNMINUS", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaveFunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaveFunParser.EOF, 0); }
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public List<GlobContext> glob() {
			return getRuleContexts(GlobContext.class);
		}
		public GlobContext glob(int i) {
			return getRuleContext(GlobContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(14);
				fun();
				}
				break;
			}
			setState(20);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17);
					glob();
					}
					} 
				}
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(23);
			com(0);
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	 
		public FunContext() { }
		public void copyFrom(FunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclContext extends FunContext {
		public TerminalNode FUN() { return getToken(HaveFunParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(HaveFunParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HaveFunParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(HaveFunParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunParser.RBRACE, 0); }
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunParser.SEMICOLON, 0); }
		public FunDeclContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends FunContext {
		public EmptyContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				_localctx = new FunDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(FUN);
				setState(27);
				match(ID);
				setState(28);
				match(LPAR);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(29);
					match(ID);
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(30);
						match(T__0);
						setState(31);
						match(ID);
						}
						}
						setState(36);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(39);
				match(RPAR);
				setState(40);
				match(LBRACE);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305880715268456448L) != 0) {
					{
					setState(41);
					com(0);
					setState(42);
					match(SEMICOLON);
					}
				}

				setState(46);
				match(RETURN);
				setState(47);
				exp(0);
				setState(48);
				match(RBRACE);
				setState(49);
				fun();
				}
				break;
			case IF:
			case WHILE:
			case SKIPP:
			case OUT:
			case LBRACE:
			case GLOBAL:
			case DOLLAR:
			case ID:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(HaveFunParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunParser.SEMICOLON, 0); }
		public GlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glob; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitGlob(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobContext glob() throws RecognitionException {
		GlobContext _localctx = new GlobContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_glob);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(GLOBAL);
			setState(55);
			match(ID);
			setState(56);
			match(ASSIGN);
			setState(57);
			exp(0);
			setState(58);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(HaveFunParser.GLOBAL, 0); }
		public GlobAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitGlobAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonDetContext extends ComContext {
		public List<TerminalNode> LBRACE() { return getTokens(HaveFunParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HaveFunParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HaveFunParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HaveFunParser.RBRACE, i);
		}
		public TerminalNode ND() { return getToken(HaveFunParser.ND, 0); }
		public NonDetContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitNonDet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(HaveFunParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldContext extends ComContext {
		public List<TerminalNode> DOLLAR() { return getTokens(HaveFunParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(HaveFunParser.DOLLAR, i);
		}
		public TerminalNode LBRACE() { return getToken(HaveFunParser.LBRACE, 0); }
		public TerminalNode MAINSTART() { return getToken(HaveFunParser.MAINSTART, 0); }
		public ArnComContext arnCom() {
			return getRuleContext(ArnComContext.class,0);
		}
		public TerminalNode MAINEND() { return getToken(HaveFunParser.MAINEND, 0); }
		public TerminalNode RBRACE() { return getToken(HaveFunParser.RBRACE, 0); }
		public ArnoldContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnold(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVarContext extends ComContext {
		public TerminalNode GLOBAL() { return getToken(HaveFunParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalVarContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(HaveFunParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(HaveFunParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(HaveFunParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HaveFunParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HaveFunParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HaveFunParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HaveFunParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(HaveFunParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(HaveFunParser.GLOBAL, 0); }
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(HaveFunParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_com, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(IF);
				setState(62);
				match(LPAR);
				setState(63);
				exp(0);
				setState(64);
				match(RPAR);
				setState(65);
				match(THEN);
				setState(66);
				match(LBRACE);
				setState(67);
				com(0);
				setState(68);
				match(RBRACE);
				setState(69);
				match(ELSE);
				setState(70);
				match(LBRACE);
				setState(71);
				com(0);
				setState(72);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(74);
					match(GLOBAL);
					}
				}

				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN);
				setState(79);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new GlobAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(80);
					match(GLOBAL);
					}
				}

				setState(83);
				match(ID);
				setState(84);
				match(T__1);
				setState(85);
				match(ASSIGN);
				setState(86);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new GlobalVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(GLOBAL);
				setState(88);
				match(ID);
				setState(89);
				match(ASSIGN);
				setState(90);
				exp(0);
				}
				break;
			case 5:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(SKIPP);
				}
				break;
			case 6:
				{
				_localctx = new NonDetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(LBRACE);
				setState(93);
				com(0);
				setState(94);
				match(RBRACE);
				setState(95);
				match(ND);
				setState(96);
				match(LBRACE);
				setState(97);
				com(0);
				setState(98);
				match(RBRACE);
				}
				break;
			case 7:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(WHILE);
				setState(101);
				match(LPAR);
				setState(102);
				exp(0);
				setState(103);
				match(RPAR);
				setState(104);
				match(LBRACE);
				setState(105);
				com(0);
				setState(106);
				match(RBRACE);
				}
				break;
			case 8:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(OUT);
				setState(109);
				match(LPAR);
				setState(110);
				exp(0);
				setState(111);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new ArnoldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(DOLLAR);
				setState(114);
				match(LBRACE);
				setState(115);
				match(MAINSTART);
				setState(116);
				arnCom(0);
				setState(117);
				match(MAINEND);
				setState(118);
				match(RBRACE);
				setState(119);
				match(DOLLAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(123);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(124);
					match(SEMICOLON);
					setState(125);
					com(6);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(HaveFunParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(HaveFunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HaveFunParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(HaveFunParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunAccessContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunAccessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitFunAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HaveFunParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(HaveFunParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(HaveFunParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(HaveFunParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(HaveFunParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(HaveFunParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(HaveFunParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(HaveFunParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(HaveFunParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(HaveFunParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(HaveFunParser.AND, 0); }
		public TerminalNode OR() { return getToken(HaveFunParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAccessContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public GlobalAccessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitGlobalAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(HaveFunParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new FunAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(ID);
				setState(135);
				match(LPAR);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843078201612288L) != 0) {
					{
					setState(136);
					exp(0);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(137);
						match(T__0);
						setState(138);
						exp(0);
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(146);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(LPAR);
				setState(148);
				exp(0);
				setState(149);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(NOT);
				setState(152);
				exp(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(ID);
				setState(155);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(159);
						match(POW);
						setState(160);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(161);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(167);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(168);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(169);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnComContext extends ParserRuleContext {
		public ArnComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnCom; }
	 
		public ArnComContext() { }
		public void copyFrom(ArnComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnIfContext extends ArnComContext {
		public TerminalNode ARNIF() { return getToken(HaveFunParser.ARNIF, 0); }
		public ArnExpContext arnExp() {
			return getRuleContext(ArnExpContext.class,0);
		}
		public List<ArnComContext> arnCom() {
			return getRuleContexts(ArnComContext.class);
		}
		public ArnComContext arnCom(int i) {
			return getRuleContext(ArnComContext.class,i);
		}
		public TerminalNode ARNELSE() { return getToken(HaveFunParser.ARNELSE, 0); }
		public TerminalNode ARNIFEND() { return getToken(HaveFunParser.ARNIFEND, 0); }
		public ArnIfContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnVarDeclContext extends ArnComContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public ArnExpContext arnExp() {
			return getRuleContext(ArnExpContext.class,0);
		}
		public ArnVarDeclContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnVarAssignContext extends ArnComContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public ArnExpContext arnExp() {
			return getRuleContext(ArnExpContext.class,0);
		}
		public ArnVarAssignContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnWhileContext extends ArnComContext {
		public TerminalNode ARNWHILE() { return getToken(HaveFunParser.ARNWHILE, 0); }
		public ArnExpContext arnExp() {
			return getRuleContext(ArnExpContext.class,0);
		}
		public ArnComContext arnCom() {
			return getRuleContext(ArnComContext.class,0);
		}
		public TerminalNode ARNWHILEND() { return getToken(HaveFunParser.ARNWHILEND, 0); }
		public ArnWhileContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnOutContext extends ArnComContext {
		public TerminalNode ARNOUT() { return getToken(HaveFunParser.ARNOUT, 0); }
		public ArnExpContext arnExp() {
			return getRuleContext(ArnExpContext.class,0);
		}
		public ArnOutContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnOut(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnComSeqContext extends ArnComContext {
		public List<ArnComContext> arnCom() {
			return getRuleContexts(ArnComContext.class);
		}
		public ArnComContext arnCom(int i) {
			return getRuleContext(ArnComContext.class,i);
		}
		public ArnComSeqContext(ArnComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnComSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnComContext arnCom() throws RecognitionException {
		return arnCom(0);
	}

	private ArnComContext arnCom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArnComContext _localctx = new ArnComContext(_ctx, _parentState);
		ArnComContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_arnCom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNIF:
				{
				_localctx = new ArnIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				match(ARNIF);
				setState(183);
				arnExp(0);
				setState(184);
				arnCom(0);
				setState(185);
				match(ARNELSE);
				setState(186);
				arnCom(0);
				setState(187);
				match(ARNIFEND);
				}
				break;
			case T__2:
				{
				_localctx = new ArnVarDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(T__2);
				setState(190);
				match(ID);
				setState(191);
				match(T__3);
				setState(192);
				arnExp(0);
				}
				break;
			case T__4:
				{
				_localctx = new ArnVarAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__4);
				setState(194);
				match(ID);
				setState(195);
				match(T__5);
				setState(196);
				arnExp(0);
				setState(197);
				match(T__6);
				}
				break;
			case ARNWHILE:
				{
				_localctx = new ArnWhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ARNWHILE);
				setState(200);
				arnExp(0);
				setState(201);
				arnCom(0);
				setState(202);
				match(ARNWHILEND);
				}
				break;
			case ARNOUT:
				{
				_localctx = new ArnOutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(ARNOUT);
				setState(205);
				arnExp(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArnComSeqContext(new ArnComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_arnCom);
					setState(208);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(209);
					arnCom(4);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnExpContext extends ParserRuleContext {
		public ArnExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnExp; }
	 
		public ArnExpContext() { }
		public void copyFrom(ArnExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnOpContext extends ArnExpContext {
		public Token op;
		public List<ArnExpContext> arnExp() {
			return getRuleContexts(ArnExpContext.class);
		}
		public ArnExpContext arnExp(int i) {
			return getRuleContext(ArnExpContext.class,i);
		}
		public TerminalNode ARNMUL() { return getToken(HaveFunParser.ARNMUL, 0); }
		public TerminalNode ARNDIV() { return getToken(HaveFunParser.ARNDIV, 0); }
		public TerminalNode ARNPLUS() { return getToken(HaveFunParser.ARNPLUS, 0); }
		public TerminalNode ARNMINUS() { return getToken(HaveFunParser.ARNMINUS, 0); }
		public ArnOpContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnIdContext extends ArnExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public ArnIdContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnBoolContext extends ArnExpContext {
		public TerminalNode BOOLC() { return getToken(HaveFunParser.BOOLC, 0); }
		public ArnBoolContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnStringContext extends ArnExpContext {
		public TerminalNode STRING() { return getToken(HaveFunParser.STRING, 0); }
		public ArnStringContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnOrAndContext extends ArnExpContext {
		public Token op;
		public List<ArnExpContext> arnExp() {
			return getRuleContexts(ArnExpContext.class);
		}
		public ArnExpContext arnExp(int i) {
			return getRuleContext(ArnExpContext.class,i);
		}
		public TerminalNode ARNAND() { return getToken(HaveFunParser.ARNAND, 0); }
		public TerminalNode ARNOR() { return getToken(HaveFunParser.ARNOR, 0); }
		public ArnOrAndContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnOrAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnDubleContext extends ArnExpContext {
		public TerminalNode DOUBLE() { return getToken(HaveFunParser.DOUBLE, 0); }
		public ArnDubleContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnDuble(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnCompContext extends ArnExpContext {
		public Token op;
		public List<ArnExpContext> arnExp() {
			return getRuleContexts(ArnExpContext.class);
		}
		public ArnExpContext arnExp(int i) {
			return getRuleContext(ArnExpContext.class,i);
		}
		public TerminalNode ARNGT() { return getToken(HaveFunParser.ARNGT, 0); }
		public TerminalNode ARNEQQ() { return getToken(HaveFunParser.ARNEQQ, 0); }
		public ArnCompContext(ArnExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitArnComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnExpContext arnExp() throws RecognitionException {
		return arnExp(0);
	}

	private ArnExpContext arnExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArnExpContext _localctx = new ArnExpContext(_ctx, _parentState);
		ArnExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arnExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ArnIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				match(ID);
				}
				break;
			case BOOLC:
				{
				_localctx = new ArnBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(BOOLC);
				}
				break;
			case DOUBLE:
				{
				_localctx = new ArnDubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(DOUBLE);
				}
				break;
			case STRING:
				{
				_localctx = new ArnStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ArnOpContext(new ArnExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnExp);
						setState(222);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(223);
						((ArnOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2161727821137838080L) != 0) ) {
							((ArnOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						arnExp(4);
						}
						break;
					case 2:
						{
						_localctx = new ArnOrAndContext(new ArnExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnExp);
						setState(225);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(226);
						((ArnOrAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ARNOR || _la==ARNAND) ) {
							((ArnOrAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						arnExp(3);
						}
						break;
					case 3:
						{
						_localctx = new ArnCompContext(new ArnExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arnExp);
						setState(228);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(229);
						((ArnCompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ARNGT || _la==ARNEQQ) ) {
							((ArnCompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						arnExp(2);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return com_sempred((ComContext)_localctx, predIndex);
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 5:
			return arnCom_sempred((ArnComContext)_localctx, predIndex);
		case 6:
			return arnExp_sempred((ArnExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arnCom_sempred(ArnComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean arnExp_sempred(ArnExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001"+
		"\f\u0001$\t\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003z\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u007f\b\u0003\n\u0003\f\u0003\u0082\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u008c\b\u0004\n\u0004\f\u0004\u008f\t\u0004\u0003\u0004"+
		"\u0091\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004\f\u0004\u00b4\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00cf\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00d3"+
		"\b\u0005\n\u0005\f\u0005\u00d6\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00e8\b\u0006\n\u0006\f\u0006\u00eb\t\u0006\u0001"+
		"\u0006\u0000\u0004\u0006\b\n\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000"+
		"\b\u0001\u0000\u0010\u0012\u0001\u0000\u000e\u000f\u0001\u0000\u0018\u001b"+
		"\u0001\u0000\u0016\u0017\u0001\u0000\u0014\u0015\u0001\u00009<\u0001\u0000"+
		"78\u0001\u000056\u010f\u0000\u000f\u0001\u0000\u0000\u0000\u00024\u0001"+
		"\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006y\u0001\u0000\u0000"+
		"\u0000\b\u009c\u0001\u0000\u0000\u0000\n\u00ce\u0001\u0000\u0000\u0000"+
		"\f\u00dc\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f"+
		"\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0014\u0001\u0000\u0000\u0000\u0011\u0013\u0003\u0004\u0002\u0000\u0012"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0003\u0006\u0003\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b\u001c"+
		"\u0005=\u0000\u0000\u001c%\u0005$\u0000\u0000\u001d\"\u0005=\u0000\u0000"+
		"\u001e\u001f\u0005\u0001\u0000\u0000\u001f!\u0005=\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000"+
		"\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0005%\u0000\u0000(,\u0005&\u0000\u0000"+
		")*\u0003\u0006\u0003\u0000*+\u0005(\u0000\u0000+-\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0005\t\u0000\u0000/0\u0003\b\u0004\u000001\u0005\'\u0000\u0000"+
		"12\u0003\u0002\u0001\u000025\u0001\u0000\u0000\u000035\u0001\u0000\u0000"+
		"\u00004\u001a\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0003"+
		"\u0001\u0000\u0000\u000067\u0005)\u0000\u000078\u0005=\u0000\u000089\u0005"+
		"\"\u0000\u00009:\u0003\b\u0004\u0000:;\u0005(\u0000\u0000;\u0005\u0001"+
		"\u0000\u0000\u0000<=\u0006\u0003\uffff\uffff\u0000=>\u0005\u001d\u0000"+
		"\u0000>?\u0005$\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005%\u0000\u0000"+
		"AB\u0005\u001e\u0000\u0000BC\u0005&\u0000\u0000CD\u0003\u0006\u0003\u0000"+
		"DE\u0005\'\u0000\u0000EF\u0005\u001f\u0000\u0000FG\u0005&\u0000\u0000"+
		"GH\u0003\u0006\u0003\u0000HI\u0005\'\u0000\u0000Iz\u0001\u0000\u0000\u0000"+
		"JL\u0005)\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0005=\u0000\u0000NO\u0005\"\u0000\u0000"+
		"Oz\u0003\b\u0004\u0000PR\u0005)\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005=\u0000\u0000"+
		"TU\u0005\u0002\u0000\u0000UV\u0005\"\u0000\u0000Vz\u0003\b\u0004\u0000"+
		"WX\u0005)\u0000\u0000XY\u0005=\u0000\u0000YZ\u0005\"\u0000\u0000Zz\u0003"+
		"\b\u0004\u0000[z\u0005!\u0000\u0000\\]\u0005&\u0000\u0000]^\u0003\u0006"+
		"\u0003\u0000^_\u0005\'\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005&\u0000"+
		"\u0000ab\u0003\u0006\u0003\u0000bc\u0005\'\u0000\u0000cz\u0001\u0000\u0000"+
		"\u0000de\u0005 \u0000\u0000ef\u0005$\u0000\u0000fg\u0003\b\u0004\u0000"+
		"gh\u0005%\u0000\u0000hi\u0005&\u0000\u0000ij\u0003\u0006\u0003\u0000j"+
		"k\u0005\'\u0000\u0000kz\u0001\u0000\u0000\u0000lm\u0005#\u0000\u0000m"+
		"n\u0005$\u0000\u0000no\u0003\b\u0004\u0000op\u0005%\u0000\u0000pz\u0001"+
		"\u0000\u0000\u0000qr\u0005-\u0000\u0000rs\u0005&\u0000\u0000st\u0005*"+
		"\u0000\u0000tu\u0003\n\u0005\u0000uv\u0005+\u0000\u0000vw\u0005\'\u0000"+
		"\u0000wx\u0005-\u0000\u0000xz\u0001\u0000\u0000\u0000y<\u0001\u0000\u0000"+
		"\u0000yK\u0001\u0000\u0000\u0000yQ\u0001\u0000\u0000\u0000yW\u0001\u0000"+
		"\u0000\u0000y[\u0001\u0000\u0000\u0000y\\\u0001\u0000\u0000\u0000yd\u0001"+
		"\u0000\u0000\u0000yl\u0001\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000"+
		"z\u0080\u0001\u0000\u0000\u0000{|\n\u0005\u0000\u0000|}\u0005(\u0000\u0000"+
		"}\u007f\u0003\u0006\u0003\u0006~{\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0006\u0004\uffff\uffff\u0000\u0084\u009d"+
		"\u0005\u000b\u0000\u0000\u0085\u009d\u0005\f\u0000\u0000\u0086\u0087\u0005"+
		"=\u0000\u0000\u0087\u0090\u0005$\u0000\u0000\u0088\u008d\u0003\b\u0004"+
		"\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008c\u0003\b\u0004\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0088\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u009d\u0005%\u0000\u0000\u0093"+
		"\u0094\u0005$\u0000\u0000\u0094\u0095\u0003\b\u0004\u0000\u0095\u0096"+
		"\u0005%\u0000\u0000\u0096\u009d\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\u001c\u0000\u0000\u0098\u009d\u0003\b\u0004\b\u0099\u009d\u0005=\u0000"+
		"\u0000\u009a\u009b\u0005=\u0000\u0000\u009b\u009d\u0005\u0002\u0000\u0000"+
		"\u009c\u0083\u0001\u0000\u0000\u0000\u009c\u0085\u0001\u0000\u0000\u0000"+
		"\u009c\u0086\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000\u0000"+
		"\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00b2\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\n\t\u0000\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0"+
		"\u00b1\u0003\b\u0004\t\u00a1\u00a2\n\u0007\u0000\u0000\u00a2\u00a3\u0007"+
		"\u0000\u0000\u0000\u00a3\u00b1\u0003\b\u0004\b\u00a4\u00a5\n\u0006\u0000"+
		"\u0000\u00a5\u00a6\u0007\u0001\u0000\u0000\u00a6\u00b1\u0003\b\u0004\u0007"+
		"\u00a7\u00a8\n\u0005\u0000\u0000\u00a8\u00a9\u0007\u0002\u0000\u0000\u00a9"+
		"\u00b1\u0003\b\u0004\u0006\u00aa\u00ab\n\u0004\u0000\u0000\u00ab\u00ac"+
		"\u0007\u0003\u0000\u0000\u00ac\u00b1\u0003\b\u0004\u0005\u00ad\u00ae\n"+
		"\u0003\u0000\u0000\u00ae\u00af\u0007\u0004\u0000\u0000\u00af\u00b1\u0003"+
		"\b\u0004\u0004\u00b0\u009e\u0001\u0000\u0000\u0000\u00b0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a4\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\t\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0006\u0005\uffff"+
		"\uffff\u0000\u00b6\u00b7\u0005/\u0000\u0000\u00b7\u00b8\u0003\f\u0006"+
		"\u0000\u00b8\u00b9\u0003\n\u0005\u0000\u00b9\u00ba\u00050\u0000\u0000"+
		"\u00ba\u00bb\u0003\n\u0005\u0000\u00bb\u00bc\u00051\u0000\u0000\u00bc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0003\u0000\u0000\u00be"+
		"\u00bf\u0005=\u0000\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00cf"+
		"\u0003\f\u0006\u0000\u00c1\u00c2\u0005\u0005\u0000\u0000\u00c2\u00c3\u0005"+
		"=\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0003\f"+
		"\u0006\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00cf\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u00052\u0000\u0000\u00c8\u00c9\u0003\f\u0006"+
		"\u0000\u00c9\u00ca\u0003\n\u0005\u0000\u00ca\u00cb\u00053\u0000\u0000"+
		"\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005,\u0000\u0000\u00cd"+
		"\u00cf\u0003\f\u0006\u0000\u00ce\u00b5\u0001\u0000\u0000\u0000\u00ce\u00bd"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c1\u0001\u0000\u0000\u0000\u00ce\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\n\u0003\u0000\u0000\u00d1\u00d3\u0003"+
		"\n\u0005\u0004\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0006\u0006\uffff\uffff\u0000\u00d8\u00dd\u0005"+
		"=\u0000\u0000\u00d9\u00dd\u00054\u0000\u0000\u00da\u00dd\u0005.\u0000"+
		"\u0000\u00db\u00dd\u0005\r\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e9\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\n\u0003\u0000\u0000\u00df\u00e0\u0007\u0005\u0000\u0000\u00e0"+
		"\u00e8\u0003\f\u0006\u0004\u00e1\u00e2\n\u0002\u0000\u0000\u00e2\u00e3"+
		"\u0007\u0006\u0000\u0000\u00e3\u00e8\u0003\f\u0006\u0003\u00e4\u00e5\n"+
		"\u0001\u0000\u0000\u00e5\u00e6\u0007\u0007\u0000\u0000\u00e6\u00e8\u0003"+
		"\f\u0006\u0002\u00e7\u00de\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\r\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u0014\u000f\u0014\"%,4KQy\u0080\u008d\u0090\u009c\u00b0\u00b2\u00ce"+
		"\u00d4\u00dc\u00e7\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}