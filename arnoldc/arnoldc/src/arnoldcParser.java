// Generated from D:/scuola/uni/ANNO III/Linguaggi/arnoldc2/arnoldc/src/arnoldc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class arnoldcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FALSE=1, TRUE=2, IF=3, ELSE=4, ENDIF=5, WHILE=6, ENDWHILE=7, PLUSOPERATOR=8, 
		MINUSOPERATOR=9, MULTIPLICATIONOPERATOR=10, DIVISIONOPERATOR=11, MODULOOPERATOR=12, 
		EQUALTO=13, GREATERTHAN=14, OR=15, AND=16, DECLAREMETHOD=17, NONVOIDMETHOD=18, 
		METHODARGUMENTS=19, RETURN=20, ENDMETHODDECLARATION=21, CALLMETHOD=22, 
		ASSIGNVARIABLEFROMMETHODCALL=23, DECLAREINT=24, SETINITIALVALUE=25, BEGINMAIN=26, 
		ENDMAIN=27, PRINT=28, ASSIGNVARIABLE=29, SETVALUE=30, ENDASSIGNVARIABLE=31, 
		NAT=32, BOOL=33, ID=34, STRING=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_method = 1, RULE_main = 2, RULE_com = 3, RULE_exp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "method", "main", "com", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'I LIED'", "'NO PROBLEMO'", "'BECAUSE I'M GOING TO SAY PLEASE'", 
			"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'", 
			"'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", "'I LET HIM GO'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'LISTEN TO ME VERY CAREFULLY'", "'GIVE THESE PEOPLE AIR'", 
			"'I NEED YOUR CLOTHES YOUR BOOTS AND YOUR MOTORCYCLE'", "'I'LL BE BACK'", 
			"'HASTA LA VISTA, BABY'", "'DO IT NOW'", "'GET YOUR ASS TO MARS'", "'HEY CHRISTMAS TREE'", 
			"'YOU SET US UP'", "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'TALK TO THE HAND'", 
			"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'ENOUGH TALK'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FALSE", "TRUE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "PLUSOPERATOR", 
			"MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "MODULOOPERATOR", 
			"EQUALTO", "GREATERTHAN", "OR", "AND", "DECLAREMETHOD", "NONVOIDMETHOD", 
			"METHODARGUMENTS", "RETURN", "ENDMETHODDECLARATION", "CALLMETHOD", "ASSIGNVARIABLEFROMMETHODCALL", 
			"DECLAREINT", "SETINITIALVALUE", "BEGINMAIN", "ENDMAIN", "PRINT", "ASSIGNVARIABLE", 
			"SETVALUE", "ENDASSIGNVARIABLE", "NAT", "BOOL", "ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "arnoldc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public arnoldcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(arnoldcParser.EOF, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLAREMETHOD) {
				{
				{
				setState(10);
				method();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			main();
			setState(17);
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
	public static class MethodContext extends ParserRuleContext {
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	 
		public MethodContext() { }
		public void copyFrom(MethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidMethodDeclarationContext extends MethodContext {
		public TerminalNode DECLAREMETHOD() { return getToken(arnoldcParser.DECLAREMETHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(arnoldcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(arnoldcParser.ID, i);
		}
		public TerminalNode NONVOIDMETHOD() { return getToken(arnoldcParser.NONVOIDMETHOD, 0); }
		public TerminalNode RETURN() { return getToken(arnoldcParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENDMETHODDECLARATION() { return getToken(arnoldcParser.ENDMETHODDECLARATION, 0); }
		public List<TerminalNode> METHODARGUMENTS() { return getTokens(arnoldcParser.METHODARGUMENTS); }
		public TerminalNode METHODARGUMENTS(int i) {
			return getToken(arnoldcParser.METHODARGUMENTS, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public NonVoidMethodDeclarationContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitNonVoidMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodDeclarationContext extends MethodContext {
		public TerminalNode DECLAREMETHOD() { return getToken(arnoldcParser.DECLAREMETHOD, 0); }
		public List<TerminalNode> ID() { return getTokens(arnoldcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(arnoldcParser.ID, i);
		}
		public TerminalNode ENDMETHODDECLARATION() { return getToken(arnoldcParser.ENDMETHODDECLARATION, 0); }
		public List<TerminalNode> METHODARGUMENTS() { return getTokens(arnoldcParser.METHODARGUMENTS); }
		public TerminalNode METHODARGUMENTS(int i) {
			return getToken(arnoldcParser.METHODARGUMENTS, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public VoidMethodDeclarationContext(MethodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitVoidMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VoidMethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(DECLAREMETHOD);
				setState(20);
				match(ID);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==METHODARGUMENTS) {
					{
					{
					setState(21);
					match(METHODARGUMENTS);
					setState(22);
					match(ID);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
					{
					{
					setState(28);
					com();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(ENDMETHODDECLARATION);
				}
				break;
			case 2:
				_localctx = new NonVoidMethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(DECLAREMETHOD);
				setState(36);
				match(ID);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==METHODARGUMENTS) {
					{
					{
					setState(37);
					match(METHODARGUMENTS);
					setState(38);
					match(ID);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(NONVOIDMETHOD);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
					{
					{
					setState(45);
					com();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(RETURN);
				setState(52);
				exp(0);
				setState(53);
				match(ENDMETHODDECLARATION);
				}
				break;
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode BEGINMAIN() { return getToken(arnoldcParser.BEGINMAIN, 0); }
		public TerminalNode ENDMAIN() { return getToken(arnoldcParser.ENDMAIN, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(BEGINMAIN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
				{
				{
				setState(58);
				com();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(ENDMAIN);
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
	public static class PrintContext extends ComContext {
		public TerminalNode PRINT() { return getToken(arnoldcParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareIntContext extends ComContext {
		public TerminalNode DECLAREINT() { return getToken(arnoldcParser.DECLAREINT, 0); }
		public TerminalNode ID() { return getToken(arnoldcParser.ID, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(arnoldcParser.SETINITIALVALUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclareIntContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitDeclareInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidMethodCallContext extends ComContext {
		public TerminalNode ASSIGNVARIABLEFROMMETHODCALL() { return getToken(arnoldcParser.ASSIGNVARIABLEFROMMETHODCALL, 0); }
		public List<TerminalNode> ID() { return getTokens(arnoldcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(arnoldcParser.ID, i);
		}
		public TerminalNode CALLMETHOD() { return getToken(arnoldcParser.CALLMETHOD, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NonVoidMethodCallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitNonVoidMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(arnoldcParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(arnoldcParser.ENDWHILE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodCallContext extends ComContext {
		public TerminalNode CALLMETHOD() { return getToken(arnoldcParser.CALLMETHOD, 0); }
		public TerminalNode ID() { return getToken(arnoldcParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public VoidMethodCallContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitVoidMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(arnoldcParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(arnoldcParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(arnoldcParser.ENDIF, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(arnoldcParser.ASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(arnoldcParser.ID, 0); }
		public TerminalNode SETVALUE() { return getToken(arnoldcParser.SETVALUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(arnoldcParser.ENDASSIGNVARIABLE, 0); }
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_com);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(IF);
				setState(67);
				exp(0);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
					{
					{
					setState(68);
					com();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(ELSE);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
					{
					{
					setState(75);
					com();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(ENDIF);
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(WHILE);
				setState(84);
				exp(0);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 834666568L) != 0)) {
					{
					{
					setState(85);
					com();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(ENDWHILE);
				}
				break;
			case CALLMETHOD:
				_localctx = new VoidMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(CALLMETHOD);
				setState(94);
				match(ID);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) {
					{
					{
					setState(95);
					exp(0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASSIGNVARIABLEFROMMETHODCALL:
				_localctx = new NonVoidMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(ASSIGNVARIABLEFROMMETHODCALL);
				setState(102);
				match(ID);
				setState(103);
				match(CALLMETHOD);
				setState(104);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) {
					{
					{
					setState(105);
					exp(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DECLAREINT:
				_localctx = new DeclareIntContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(DECLAREINT);
				setState(112);
				match(ID);
				setState(113);
				match(SETINITIALVALUE);
				setState(114);
				exp(0);
				}
				break;
			case ASSIGNVARIABLE:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(ASSIGNVARIABLE);
				setState(116);
				match(ID);
				setState(117);
				match(SETVALUE);
				setState(118);
				exp(0);
				setState(119);
				match(ENDASSIGNVARIABLE);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(PRINT);
				setState(122);
				exp(0);
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
		public TerminalNode NAT() { return getToken(arnoldcParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(arnoldcParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(arnoldcParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(arnoldcParser.AND, 0); }
		public TerminalNode OR() { return getToken(arnoldcParser.OR, 0); }
		public LogicOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchOpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUALTO() { return getToken(arnoldcParser.EQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(arnoldcParser.GREATERTHAN, 0); }
		public MatchOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitMatchOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmOpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIVISIONOPERATOR() { return getToken(arnoldcParser.DIVISIONOPERATOR, 0); }
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(arnoldcParser.MULTIPLICATIONOPERATOR, 0); }
		public TerminalNode MODULOOPERATOR() { return getToken(arnoldcParser.MODULOOPERATOR, 0); }
		public TerminalNode PLUSOPERATOR() { return getToken(arnoldcParser.PLUSOPERATOR, 0); }
		public TerminalNode MINUSOPERATOR() { return getToken(arnoldcParser.MINUSOPERATOR, 0); }
		public ArithmOpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitArithmOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(arnoldcParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arnoldcVisitor ) return ((arnoldcVisitor<? extends T>)visitor).visitId(this);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAT:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(NAT);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(BOOL);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmOpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						((ArithmOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
							((ArithmOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						exp(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicOpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(136);
						((LogicOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((LogicOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						exp(3);
						}
						break;
					case 3:
						{
						_localctx = new MatchOpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(139);
						((MatchOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUALTO || _la==GREATERTHAN) ) {
							((MatchOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001\u0005"+
		"\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001"+
		"+\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u0001"+
		"2\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002"+
		"?\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003"+
		"Z\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003k\b\u0003\n\u0003\f\u0003"+
		"n\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003|\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u008e\b\u0004\n\u0004\f\u0004\u0091\t\u0004\u0001"+
		"\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001"+
		"\u0000\b\f\u0001\u0000\u000f\u0010\u0001\u0000\r\u000e\u00a5\u0000\r\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006{\u0001\u0000\u0000\u0000\b\u0082\u0001\u0000\u0000\u0000"+
		"\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012\u0005\u0000\u0000"+
		"\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0011\u0000"+
		"\u0000\u0014\u0019\u0005\"\u0000\u0000\u0015\u0016\u0005\u0013\u0000\u0000"+
		"\u0016\u0018\u0005\"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"8\u0005\u0015\u0000\u0000"+
		"#$\u0005\u0011\u0000\u0000$)\u0005\"\u0000\u0000%&\u0005\u0013\u0000\u0000"+
		"&(\u0005\"\u0000\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,0\u0005\u0012\u0000\u0000-/\u0003"+
		"\u0006\u0003\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000034\u0005\u0014\u0000\u000045\u0003\b\u0004"+
		"\u000056\u0005\u0015\u0000\u000068\u0001\u0000\u0000\u00007\u0013\u0001"+
		"\u0000\u0000\u00007#\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009=\u0005\u001a\u0000\u0000:<\u0003\u0006\u0003\u0000;:\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@A\u0005\u001b\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0003"+
		"\u0000\u0000CG\u0003\b\u0004\u0000DF\u0003\u0006\u0003\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JN\u0005\u0004\u0000\u0000KM\u0003\u0006\u0003\u0000LK\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0005\u0000\u0000R|\u0001\u0000\u0000\u0000ST\u0005\u0006\u0000\u0000"+
		"TX\u0003\b\u0004\u0000UW\u0003\u0006\u0003\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0007"+
		"\u0000\u0000\\|\u0001\u0000\u0000\u0000]^\u0005\u0016\u0000\u0000^b\u0005"+
		"\"\u0000\u0000_a\u0003\b\u0004\u0000`_\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"c|\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0017\u0000"+
		"\u0000fg\u0005\"\u0000\u0000gh\u0005\u0016\u0000\u0000hl\u0005\"\u0000"+
		"\u0000ik\u0003\b\u0004\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m|\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\u0018\u0000\u0000pq\u0005"+
		"\"\u0000\u0000qr\u0005\u0019\u0000\u0000r|\u0003\b\u0004\u0000st\u0005"+
		"\u001d\u0000\u0000tu\u0005\"\u0000\u0000uv\u0005\u001e\u0000\u0000vw\u0003"+
		"\b\u0004\u0000wx\u0005\u001f\u0000\u0000x|\u0001\u0000\u0000\u0000yz\u0005"+
		"\u001c\u0000\u0000z|\u0003\b\u0004\u0000{B\u0001\u0000\u0000\u0000{S\u0001"+
		"\u0000\u0000\u0000{]\u0001\u0000\u0000\u0000{e\u0001\u0000\u0000\u0000"+
		"{o\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u0007\u0001\u0000\u0000\u0000}~\u0006\u0004\uffff\uffff\u0000"+
		"~\u0083\u0005 \u0000\u0000\u007f\u0083\u0005!\u0000\u0000\u0080\u0083"+
		"\u0005\"\u0000\u0000\u0081\u0083\u0005#\u0000\u0000\u0082}\u0001\u0000"+
		"\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u008f\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\n\u0003\u0000\u0000\u0085\u0086\u0007\u0000\u0000"+
		"\u0000\u0086\u008e\u0003\b\u0004\u0004\u0087\u0088\n\u0002\u0000\u0000"+
		"\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u008e\u0003\b\u0004\u0003\u008a"+
		"\u008b\n\u0001\u0000\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c\u008e"+
		"\u0003\b\u0004\u0002\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u0087\u0001"+
		"\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0010\r\u0019\u001f)07=GNXbl{\u0082\u008d\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}