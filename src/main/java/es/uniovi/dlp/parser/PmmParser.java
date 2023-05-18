// Generated from C:/Users/adria/IdeaProjects/DLP/src/main/java/es/uniovi/dlp/parser\Pmm.g4 by ANTLR 4.12.0
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, TRASH=48, INT_CONSTANT=49, REAL_CONSTANT=50, CHAR_CONSTANT=51, 
		BOOL_CONSTANT=52, IDENT=53;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_var_definition = 2, RULE_func_definition = 3, 
		RULE_type = 4, RULE_expStmt = 5, RULE_statement = 6, RULE_func_call = 7, 
		RULE_expressions = 8, RULE_expression = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "var_definition", "func_definition", "type", 
			"expStmt", "statement", "func_call", "expressions", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "'{'", "'}'", "','", "':'", "';'", 
			"'int'", "'double'", "'char'", "'boolean'", "'['", "']'", "'struct'", 
			"'='", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'%='", "'print'", 
			"'input'", "'if'", "'else'", "'while'", "'for'", "'return'", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'&&'", "'||'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TRASH", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "BOOL_CONSTANT", 
			"IDENT"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> defs = new ArrayList<>();;
		public List<VarDefinition> mainDefs = new ArrayList<>();;
		public List<Statement> mainStmts = new ArrayList<>();;
		public DefinitionContext definition;
		public Token MAIN;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.defs.addAll( ((ProgramContext)_localctx).definition.list ); 
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			((ProgramContext)_localctx).MAIN = match(T__0);
			setState(29);
			match(T__1);
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
			setState(32);
			match(T__4);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					((ProgramContext)_localctx).var_definition = var_definition();
					 _localctx.mainDefs.addAll( ((ProgramContext)_localctx).var_definition.list ); 
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
				{
				{
				setState(41);
				((ProgramContext)_localctx).statement = statement();
				 _localctx.mainStmts.addAll( ((ProgramContext)_localctx).statement.list ); 
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__5);
			setState(50);
			match(EOF);
			 _localctx.defs.add( new FuncDefinition( "main", new FunctionType( new ArrayList<>(), VoidType.get() ), _localctx.mainDefs, _localctx.mainStmts, ((ProgramContext)_localctx).MAIN.getLine(), ((ProgramContext)_localctx).MAIN.getCharPositionInLine()+1 ) ); ((ProgramContext)_localctx).ast =  new Program( _localctx.defs ); 
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
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> list = new ArrayList<>();;
		public Var_definitionContext var_definition;
		public Func_definitionContext func_definition;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.list.addAll( ((DefinitionContext)_localctx).var_definition.list ); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				((DefinitionContext)_localctx).func_definition = func_definition();
				 _localctx.list.add( ((DefinitionContext)_localctx).func_definition.ast ); 
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
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VarDefinition> list = new ArrayList<>();;
		public List<Token> ids = new ArrayList<>();;
		public Token ID1;
		public Token ID2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(PmmParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PmmParser.IDENT, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((Var_definitionContext)_localctx).ID1 = match(IDENT);
			 _localctx.ids.add(((Var_definitionContext)_localctx).ID1); 
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(63);
				match(T__6);
				setState(64);
				((Var_definitionContext)_localctx).ID2 = match(IDENT);
				 if (_localctx.ids.stream().anyMatch( id -> id.getText().equals((((Var_definitionContext)_localctx).ID2!=null?((Var_definitionContext)_localctx).ID2.getText():null)) )) new ErrorType("duplicated variable", ((Var_definitionContext)_localctx).ID2.getLine(), ((Var_definitionContext)_localctx).ID2.getCharPositionInLine()+1); _localctx.ids.add(((Var_definitionContext)_localctx).ID2); 
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__7);
			setState(72);
			((Var_definitionContext)_localctx).type = type();
			setState(73);
			match(T__8);
			 for (Token id : _localctx.ids) { _localctx.list.add(new VarDefinition( id.getText(), ((Var_definitionContext)_localctx).type.t, id.getLine(), id.getCharPositionInLine()+1 )); } 
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
	public static class Func_definitionContext extends ParserRuleContext {
		public Definition ast;
		public List<VarDefinition> args = new ArrayList<>();;
		public List<VarDefinition> defs = new ArrayList<>();;
		public List<Statement> stmts = new ArrayList<>();;
		public Type retType = VoidType.get();;
		public Token ID;
		public Token ID1;
		public TypeContext T1;
		public Token ID2;
		public TypeContext T2;
		public TypeContext rt;
		public Var_definitionContext vdefs;
		public StatementContext stmt;
		public List<TerminalNode> IDENT() { return getTokens(PmmParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PmmParser.IDENT, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			((Func_definitionContext)_localctx).ID = match(IDENT);
			setState(78);
			match(T__2);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(79);
				((Func_definitionContext)_localctx).ID1 = match(IDENT);
				setState(80);
				match(T__7);
				setState(81);
				((Func_definitionContext)_localctx).T1 = type();
				 _localctx.args.add( new VarDefinition( (((Func_definitionContext)_localctx).ID1!=null?((Func_definitionContext)_localctx).ID1.getText():null), ((Func_definitionContext)_localctx).T1.t, ((Func_definitionContext)_localctx).ID1.getLine(), ((Func_definitionContext)_localctx).ID1.getCharPositionInLine()+1 ) ); 
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(83);
					match(T__6);
					setState(84);
					((Func_definitionContext)_localctx).ID2 = match(IDENT);
					setState(85);
					match(T__7);
					setState(86);
					((Func_definitionContext)_localctx).T2 = type();
					 _localctx.args.add( new VarDefinition( (((Func_definitionContext)_localctx).ID2!=null?((Func_definitionContext)_localctx).ID2.getText():null), ((Func_definitionContext)_localctx).T2.t, ((Func_definitionContext)_localctx).ID2.getLine(), ((Func_definitionContext)_localctx).ID2.getCharPositionInLine()+1 ) ); 
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(96);
			match(T__3);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(97);
				match(T__7);
				setState(98);
				((Func_definitionContext)_localctx).rt = type();
				 ((Func_definitionContext)_localctx).retType =  ((Func_definitionContext)_localctx).rt.t; 
				}
			}

			setState(103);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					((Func_definitionContext)_localctx).vdefs = var_definition();
					 _localctx.defs.addAll( ((Func_definitionContext)_localctx).vdefs.list ); 
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
				{
				{
				setState(112);
				((Func_definitionContext)_localctx).stmt = statement();
				 _localctx.stmts.addAll( ((Func_definitionContext)_localctx).stmt.list ); 
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__5);
			 ((Func_definitionContext)_localctx).ast =  new FuncDefinition( (((Func_definitionContext)_localctx).ID!=null?((Func_definitionContext)_localctx).ID.getText():null), new FunctionType( _localctx.args, _localctx.retType ), _localctx.defs, _localctx.stmts, ((Func_definitionContext)_localctx).ID.getLine(), ((Func_definitionContext)_localctx).ID.getCharPositionInLine()+1 ); 
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
	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public List<RecordField> defs = new ArrayList<>();;
		public Token INT_CONSTANT;
		public TypeContext type;
		public Var_definitionContext var_definition;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__9);
				 ((TypeContext)_localctx).t =  IntType.get(); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__10);
				 ((TypeContext)_localctx).t =  DoubleType.get(); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__11);
				 ((TypeContext)_localctx).t =  CharType.get(); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__12);
				 ((TypeContext)_localctx).t =  BoolType.get(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(T__13);
				setState(132);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(133);
				match(T__14);
				setState(134);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).t =  new ArrayType(((TypeContext)_localctx).type.t, LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				match(T__15);
				setState(138);
				match(T__4);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(139);
					((TypeContext)_localctx).var_definition = var_definition();
					 for (Definition def : ((TypeContext)_localctx).var_definition.list) { if (_localctx.defs.stream().anyMatch( d -> d.name.equals(def.getName()) )) new ErrorType("duplicated field", def.getLine(), def.getColumn()); _localctx.defs.add( new RecordField(def.getName(), def.getType(), def.getLine(), def.getColumn() ) ); } 
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__5);
				 ((TypeContext)_localctx).t =  new RecordType( _localctx.defs ); 
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
	public static class ExpStmtContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public Token OP;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpStmtContext expStmt() throws RecognitionException {
		ExpStmtContext _localctx = new ExpStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expStmt);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((ExpStmtContext)_localctx).left = expression(0);
				setState(152);
				match(T__16);
				setState(153);
				((ExpStmtContext)_localctx).right = expression(0);
				 ((ExpStmtContext)_localctx).ast =  new Assignment( ((ExpStmtContext)_localctx).left.ast, ((ExpStmtContext)_localctx).right.ast, ((ExpStmtContext)_localctx).left.ast.getLine(), ((ExpStmtContext)_localctx).left.ast.getColumn() ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((ExpStmtContext)_localctx).expression = expression(0);
				setState(157);
				((ExpStmtContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ExpStmtContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((ExpStmtContext)_localctx).ast =  new UnaryOperator( ((ExpStmtContext)_localctx).expression.ast, (((ExpStmtContext)_localctx).OP!=null?((ExpStmtContext)_localctx).OP.getText():null), ((ExpStmtContext)_localctx).expression.ast.getLine(), ((ExpStmtContext)_localctx).expression.ast.getColumn() ); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				((ExpStmtContext)_localctx).left = ((ExpStmtContext)_localctx).expression = expression(0);
				setState(161);
				((ExpStmtContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
					((ExpStmtContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				((ExpStmtContext)_localctx).right = ((ExpStmtContext)_localctx).expression = expression(0);
				 ((ExpStmtContext)_localctx).ast =  new AssignmentOperator( ((ExpStmtContext)_localctx).left.ast, (((ExpStmtContext)_localctx).OP!=null?((ExpStmtContext)_localctx).OP.getText():null), ((ExpStmtContext)_localctx).right.ast, ((ExpStmtContext)_localctx).expression.ast.getLine(), ((ExpStmtContext)_localctx).expression.ast.getColumn() ); 
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
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> list = new ArrayList();;
		public List<Statement> stmts = new ArrayList<>();;
		public List<Statement> elseStmts = new ArrayList<>();;
		public ExpressionsContext exps;
		public ExpressionContext expression;
		public StatementContext stm;
		public StatementContext stm2;
		public StatementContext stm3;
		public StatementContext stm4;
		public ExpStmtContext initialization;
		public ExpressionContext condition;
		public ExpStmtContext increment;
		public ExpressionContext exp;
		public Func_callContext func_call;
		public ExpStmtContext expStmt;
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpStmtContext> expStmt() {
			return getRuleContexts(ExpStmtContext.class);
		}
		public ExpStmtContext expStmt(int i) {
			return getRuleContext(ExpStmtContext.class,i);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__24);
				setState(168);
				((StatementContext)_localctx).exps = expressions();
				setState(169);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Print( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__25);
				setState(173);
				((StatementContext)_localctx).exps = expressions();
				setState(174);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Input( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__26);
				setState(178);
				match(T__2);
				setState(179);
				((StatementContext)_localctx).expression = expression(0);
				setState(180);
				match(T__3);
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(181);
					match(T__4);
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
						{
						{
						setState(182);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(190);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__24:
				case T__25:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__32:
				case T__33:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					{
					setState(191);
					((StatementContext)_localctx).stm2 = statement();
					 _localctx.stmts.addAll( ((StatementContext)_localctx).stm2.list ); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(196);
					match(T__27);
					setState(210);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						{
						setState(197);
						match(T__4);
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
							{
							{
							setState(198);
							((StatementContext)_localctx).stm3 = statement();
							 _localctx.elseStmts.addAll( ((StatementContext)_localctx).stm3.list ); 
							}
							}
							setState(205);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(206);
						match(T__5);
						}
						}
						break;
					case T__2:
					case T__24:
					case T__25:
					case T__26:
					case T__28:
					case T__29:
					case T__30:
					case T__32:
					case T__33:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case BOOL_CONSTANT:
					case IDENT:
						{
						{
						setState(207);
						((StatementContext)_localctx).stm4 = statement();
						 _localctx.elseStmts.addAll( ((StatementContext)_localctx).stm4.list ); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				 _localctx.list.add( new IfElse( ((StatementContext)_localctx).expression.ast, _localctx.stmts, _localctx.elseStmts, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn() ) ); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(T__28);
				setState(217);
				match(T__2);
				setState(218);
				((StatementContext)_localctx).expression = expression(0);
				setState(219);
				match(T__3);
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(220);
					match(T__4);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
						{
						{
						setState(221);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(229);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__24:
				case T__25:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__32:
				case T__33:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					setState(230);
					((StatementContext)_localctx).stm = statement();
					 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 _localctx.list.add( new While( ((StatementContext)_localctx).expression.ast, _localctx.stmts, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn() ) ); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__29);
				setState(238);
				match(T__2);
				setState(239);
				((StatementContext)_localctx).initialization = expStmt();
				setState(240);
				match(T__8);
				setState(241);
				((StatementContext)_localctx).condition = ((StatementContext)_localctx).expression = expression(0);
				setState(242);
				match(T__8);
				setState(243);
				((StatementContext)_localctx).increment = expStmt();
				setState(244);
				match(T__3);
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(245);
					match(T__4);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451478318841864L) != 0)) {
						{
						{
						setState(246);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(254);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__24:
				case T__25:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__32:
				case T__33:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					setState(255);
					((StatementContext)_localctx).stm = statement();
					 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 _localctx.list.add( new For( ((StatementContext)_localctx).initialization.ast, ((StatementContext)_localctx).condition.ast, ((StatementContext)_localctx).increment.ast, _localctx.stmts, ((StatementContext)_localctx).expression.ast.getLine(), ((StatementContext)_localctx).expression.ast.getColumn() ) ); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(T__30);
				setState(263);
				((StatementContext)_localctx).exp = expression(0);
				setState(264);
				match(T__8);
				 _localctx.list.add( new Return( ((StatementContext)_localctx).exp.ast, ((StatementContext)_localctx).exp.ast.getLine(), ((StatementContext)_localctx).exp.ast.getColumn() ) ); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				((StatementContext)_localctx).func_call = func_call();
				setState(268);
				match(T__8);
				 _localctx.list.add( ((StatementContext)_localctx).func_call.ast ); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				((StatementContext)_localctx).expStmt = expStmt();
				setState(272);
				match(T__8);
				 _localctx.list.add( ((StatementContext)_localctx).expStmt.ast ); 
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
	public static class Func_callContext extends ParserRuleContext {
		public Function ast;
		public List<Expression> exps = new ArrayList<>();;
		public Token IDENT;
		public ExpressionsContext expressions;
		public TerminalNode IDENT() { return getToken(PmmParser.IDENT, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((Func_callContext)_localctx).IDENT = match(IDENT);
			setState(278);
			match(T__2);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451474325864456L) != 0)) {
				{
				setState(279);
				((Func_callContext)_localctx).expressions = expressions();
				 _localctx.exps.addAll( ((Func_callContext)_localctx).expressions.list ); 
				}
			}

			setState(284);
			match(T__3);
			 ((Func_callContext)_localctx).ast =  new Function( new Variable( (((Func_callContext)_localctx).IDENT!=null?((Func_callContext)_localctx).IDENT.getText():null), ((Func_callContext)_localctx).IDENT.getLine(), ((Func_callContext)_localctx).IDENT.getCharPositionInLine()+1 ), _localctx.exps, ((Func_callContext)_localctx).IDENT.getLine(), ((Func_callContext)_localctx).IDENT.getCharPositionInLine()+1 ); 
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
	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> list = new ArrayList<>();;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((ExpressionsContext)_localctx).exp1 = expression(0);
			 _localctx.list.add(((ExpressionsContext)_localctx).exp1.ast); 
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(289);
				match(T__6);
				setState(290);
				((ExpressionsContext)_localctx).exp2 = expression(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).exp2.ast); 
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext var;
		public ExpressionContext exp;
		public ExpressionContext left;
		public ExpressionContext condition;
		public Func_callContext func_call;
		public TypeContext type;
		public ExpressionContext target;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token IDENT;
		public Token OP;
		public ExpressionContext right;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public ExpressionContext index;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode BOOL_CONSTANT() { return getToken(PmmParser.BOOL_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(PmmParser.IDENT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(299);
				((ExpressionContext)_localctx).func_call = func_call();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_call.ast; 
				}
				break;
			case 2:
				{
				setState(302);
				match(T__2);
				setState(303);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(304);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast; 
				}
				break;
			case 3:
				{
				setState(307);
				match(T__2);
				setState(308);
				((ExpressionContext)_localctx).type = type();
				setState(309);
				match(T__3);
				setState(310);
				((ExpressionContext)_localctx).target = expression(13);
				 ((ExpressionContext)_localctx).ast =  new Cast( ((ExpressionContext)_localctx).target.ast, ((ExpressionContext)_localctx).type.t, ((ExpressionContext)_localctx).target.ast.getLine(), ((ExpressionContext)_localctx).target.ast.getColumn()); 
				}
				break;
			case 4:
				{
				setState(313);
				match(T__32);
				setState(314);
				((ExpressionContext)_localctx).exp = expression(12);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 5:
				{
				setState(317);
				match(T__33);
				setState(318);
				((ExpressionContext)_localctx).exp = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Not( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 6:
				{
				setState(321);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral( LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)), ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 7:
				{
				setState(323);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral( LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)), ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 8:
				{
				setState(325);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral( LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)), ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 9:
				{
				setState(327);
				match(BOOL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new BoolLiteral( LexerHelper.lexemeToBool((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)), ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 10:
				{
				setState(329);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable( (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).IDENT.getLine(), ((ExpressionContext)_localctx).IDENT.getCharPositionInLine()+1 ); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(334);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						((ExpressionContext)_localctx).right = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(339);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__37) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(340);
						((ExpressionContext)_localctx).right = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(343);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(344);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						((ExpressionContext)_localctx).right = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Comparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(349);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__45) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						((ExpressionContext)_localctx).right = expression(8);
						 ((ExpressionContext)_localctx).ast =  new LogicComparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(354);
						match(T__46);
						setState(355);
						((ExpressionContext)_localctx).exp1 = expression(0);
						setState(356);
						match(T__7);
						setState(357);
						((ExpressionContext)_localctx).exp2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Ternary( ((ExpressionContext)_localctx).condition.ast, ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast, ((ExpressionContext)_localctx).condition.ast.getLine(), ((ExpressionContext)_localctx).condition.ast.getColumn() ); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.var = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(361);
						match(T__13);
						setState(362);
						((ExpressionContext)_localctx).index = expression(0);
						setState(363);
						match(T__14);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess( ((ExpressionContext)_localctx).var.ast, ((ExpressionContext)_localctx).index.ast, ((ExpressionContext)_localctx).var.ast.getLine(), ((ExpressionContext)_localctx).var.ast.getColumn()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(367);
						match(T__31);
						setState(368);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess( ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
						}
						break;
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0178\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000%\b\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002C\b\u0002\n\u0002"+
		"\f\u0002F\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003Z\b\u0003\n\u0003\f\u0003]\t\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003t\b\u0003\n\u0003\f\u0003w\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008f\b\u0004\n"+
		"\u0004\f\u0004\u0092\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ba"+
		"\b\u0006\n\u0006\f\u0006\u00bd\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c3\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00ca\b\u0006\n\u0006\f\u0006\u00cd"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d3"+
		"\b\u0006\u0003\u0006\u00d5\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00e1\b\u0006\n\u0006\f\u0006\u00e4\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ea\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00fa\b\u0006\n\u0006\f\u0006\u00fd\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0103\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0114\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u011b\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0126\b\b\n\b\f\b\u0129\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u014c\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0173\b\t\n"+
		"\t\f\t\u0176\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0000\u0006\u0001\u0000\u0012\u0013\u0001\u0000"+
		"\u0014\u0018\u0001\u0000#%\u0002\u0000!!&&\u0001\u0000\',\u0001\u0000"+
		"-.\u01a1\u0000\u0019\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000"+
		"\u0000\u0004=\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b"+
		"\u0095\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u0113"+
		"\u0001\u0000\u0000\u0000\u000e\u0115\u0001\u0000\u0000\u0000\u0010\u011f"+
		"\u0001\u0000\u0000\u0000\u0012\u014b\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0003\u0002\u0001\u0000\u0015\u0016\u0006\u0000\uffff\uffff\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d"+
		"\u001e\u0005\u0002\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f"+
		" \u0005\u0004\u0000\u0000 &\u0005\u0005\u0000\u0000!\"\u0003\u0004\u0002"+
		"\u0000\"#\u0006\u0000\uffff\uffff\u0000#%\u0001\u0000\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'.\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)*\u0003\f\u0006\u0000*+\u0006\u0000\uffff\uffff\u0000+-\u0001\u0000"+
		"\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000023\u0005\u0000\u0000"+
		"\u000134\u0006\u0000\uffff\uffff\u00004\u0001\u0001\u0000\u0000\u0000"+
		"56\u0003\u0004\u0002\u000067\u0006\u0001\uffff\uffff\u00007<\u0001\u0000"+
		"\u0000\u000089\u0003\u0006\u0003\u00009:\u0006\u0001\uffff\uffff\u0000"+
		":<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000"+
		"\u0000<\u0003\u0001\u0000\u0000\u0000=>\u00055\u0000\u0000>D\u0006\u0002"+
		"\uffff\uffff\u0000?@\u0005\u0007\u0000\u0000@A\u00055\u0000\u0000AC\u0006"+
		"\u0002\uffff\uffff\u0000B?\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000HI\u0003\b"+
		"\u0004\u0000IJ\u0005\t\u0000\u0000JK\u0006\u0002\uffff\uffff\u0000K\u0005"+
		"\u0001\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u00055\u0000\u0000"+
		"N^\u0005\u0003\u0000\u0000OP\u00055\u0000\u0000PQ\u0005\b\u0000\u0000"+
		"QR\u0003\b\u0004\u0000R[\u0006\u0003\uffff\uffff\u0000ST\u0005\u0007\u0000"+
		"\u0000TU\u00055\u0000\u0000UV\u0005\b\u0000\u0000VW\u0003\b\u0004\u0000"+
		"WX\u0006\u0003\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000YS\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^O\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`e\u0005\u0004\u0000\u0000ab\u0005\b\u0000\u0000bc\u0003\b\u0004"+
		"\u0000cd\u0006\u0003\uffff\uffff\u0000df\u0001\u0000\u0000\u0000ea\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gm\u0005\u0005\u0000\u0000hi\u0003\u0004\u0002\u0000ij\u0006\u0003\uffff"+
		"\uffff\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nu\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003\f\u0006\u0000"+
		"qr\u0006\u0003\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sp\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0006\u0000\u0000yz\u0006\u0003\uffff\uffff\u0000z\u0007\u0001"+
		"\u0000\u0000\u0000{|\u0005\n\u0000\u0000|\u0096\u0006\u0004\uffff\uffff"+
		"\u0000}~\u0005\u000b\u0000\u0000~\u0096\u0006\u0004\uffff\uffff\u0000"+
		"\u007f\u0080\u0005\f\u0000\u0000\u0080\u0096\u0006\u0004\uffff\uffff\u0000"+
		"\u0081\u0082\u0005\r\u0000\u0000\u0082\u0096\u0006\u0004\uffff\uffff\u0000"+
		"\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0085\u00051\u0000\u0000\u0085"+
		"\u0086\u0005\u000f\u0000\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088"+
		"\u0006\u0004\uffff\uffff\u0000\u0088\u0096\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0010\u0000\u0000\u008a\u0090\u0005\u0005\u0000\u0000\u008b"+
		"\u008c\u0003\u0004\u0002\u0000\u008c\u008d\u0006\u0004\uffff\uffff\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000"+
		"\u0094\u0096\u0006\u0004\uffff\uffff\u0000\u0095{\u0001\u0000\u0000\u0000"+
		"\u0095}\u0001\u0000\u0000\u0000\u0095\u007f\u0001\u0000\u0000\u0000\u0095"+
		"\u0081\u0001\u0000\u0000\u0000\u0095\u0083\u0001\u0000\u0000\u0000\u0095"+
		"\u0089\u0001\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0003\u0012\t\u0000\u0098\u0099\u0005\u0011\u0000\u0000\u0099\u009a\u0003"+
		"\u0012\t\u0000\u009a\u009b\u0006\u0005\uffff\uffff\u0000\u009b\u00a6\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0003\u0012\t\u0000\u009d\u009e\u0007\u0000"+
		"\u0000\u0000\u009e\u009f\u0006\u0005\uffff\uffff\u0000\u009f\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0003\u0012\t\u0000\u00a1\u00a2\u0007\u0001"+
		"\u0000\u0000\u00a2\u00a3\u0003\u0012\t\u0000\u00a3\u00a4\u0006\u0005\uffff"+
		"\uffff\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u0097\u0001\u0000"+
		"\u0000\u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0019"+
		"\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9\u00aa\u0005\t\u0000"+
		"\u0000\u00aa\u00ab\u0006\u0006\uffff\uffff\u0000\u00ab\u0114\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u001a\u0000\u0000\u00ad\u00ae\u0003\u0010"+
		"\b\u0000\u00ae\u00af\u0005\t\u0000\u0000\u00af\u00b0\u0006\u0006\uffff"+
		"\uffff\u0000\u00b0\u0114\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001b"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0003\u0000\u0000\u00b3\u00b4\u0003\u0012"+
		"\t\u0000\u00b4\u00c2\u0005\u0004\u0000\u0000\u00b5\u00bb\u0005\u0005\u0000"+
		"\u0000\u00b6\u00b7\u0003\f\u0006\u0000\u00b7\u00b8\u0006\u0006\uffff\uffff"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c3\u0005\u0006\u0000"+
		"\u0000\u00bf\u00c0\u0003\f\u0006\u0000\u00c0\u00c1\u0006\u0006\uffff\uffff"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00d2\u0005\u001c\u0000\u0000\u00c5\u00cb\u0005\u0005\u0000"+
		"\u0000\u00c6\u00c7\u0003\f\u0006\u0000\u00c7\u00c8\u0006\u0006\uffff\uffff"+
		"\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d3\u0005\u0006\u0000"+
		"\u0000\u00cf\u00d0\u0003\f\u0006\u0000\u00d0\u00d1\u0006\u0006\uffff\uffff"+
		"\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00c4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0006\uffff"+
		"\uffff\u0000\u00d7\u0114\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u001d"+
		"\u0000\u0000\u00d9\u00da\u0005\u0003\u0000\u0000\u00da\u00db\u0003\u0012"+
		"\t\u0000\u00db\u00e9\u0005\u0004\u0000\u0000\u00dc\u00e2\u0005\u0005\u0000"+
		"\u0000\u00dd\u00de\u0003\f\u0006\u0000\u00de\u00df\u0006\u0006\uffff\uffff"+
		"\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00ea\u0005\u0006\u0000"+
		"\u0000\u00e6\u00e7\u0003\f\u0006\u0000\u00e7\u00e8\u0006\u0006\uffff\uffff"+
		"\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0006\u0006\uffff\uffff\u0000\u00ec\u0114\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000\u0000\u00ee\u00ef\u0005\u0003"+
		"\u0000\u0000\u00ef\u00f0\u0003\n\u0005\u0000\u00f0\u00f1\u0005\t\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0012\t\u0000\u00f2\u00f3\u0005\t\u0000\u0000"+
		"\u00f3\u00f4\u0003\n\u0005\u0000\u00f4\u0102\u0005\u0004\u0000\u0000\u00f5"+
		"\u00fb\u0005\u0005\u0000\u0000\u00f6\u00f7\u0003\f\u0006\u0000\u00f7\u00f8"+
		"\u0006\u0006\uffff\uffff\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe"+
		"\u0103\u0005\u0006\u0000\u0000\u00ff\u0100\u0003\f\u0006\u0000\u0100\u0101"+
		"\u0006\u0006\uffff\uffff\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102"+
		"\u00f5\u0001\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0006\u0006\uffff\uffff\u0000"+
		"\u0105\u0114\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u001f\u0000\u0000"+
		"\u0107\u0108\u0003\u0012\t\u0000\u0108\u0109\u0005\t\u0000\u0000\u0109"+
		"\u010a\u0006\u0006\uffff\uffff\u0000\u010a\u0114\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0003\u000e\u0007\u0000\u010c\u010d\u0005\t\u0000\u0000\u010d"+
		"\u010e\u0006\u0006\uffff\uffff\u0000\u010e\u0114\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0003\n\u0005\u0000\u0110\u0111\u0005\t\u0000\u0000\u0111"+
		"\u0112\u0006\u0006\uffff\uffff\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u00a7\u0001\u0000\u0000\u0000\u0113\u00ac\u0001\u0000\u0000\u0000"+
		"\u0113\u00b1\u0001\u0000\u0000\u0000\u0113\u00d8\u0001\u0000\u0000\u0000"+
		"\u0113\u00ed\u0001\u0000\u0000\u0000\u0113\u0106\u0001\u0000\u0000\u0000"+
		"\u0113\u010b\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000"+
		"\u0114\r\u0001\u0000\u0000\u0000\u0115\u0116\u00055\u0000\u0000\u0116"+
		"\u011a\u0005\u0003\u0000\u0000\u0117\u0118\u0003\u0010\b\u0000\u0118\u0119"+
		"\u0006\u0007\uffff\uffff\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a"+
		"\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0004\u0000\u0000\u011d"+
		"\u011e\u0006\u0007\uffff\uffff\u0000\u011e\u000f\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0003\u0012\t\u0000\u0120\u0127\u0006\b\uffff\uffff\u0000"+
		"\u0121\u0122\u0005\u0007\u0000\u0000\u0122\u0123\u0003\u0012\t\u0000\u0123"+
		"\u0124\u0006\b\uffff\uffff\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125"+
		"\u0121\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0011\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0006\t\uffff\uffff\u0000\u012b\u012c\u0003\u000e\u0007\u0000\u012c"+
		"\u012d\u0006\t\uffff\uffff\u0000\u012d\u014c\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005\u0003\u0000\u0000\u012f\u0130\u0003\u0012\t\u0000\u0130\u0131"+
		"\u0005\u0004\u0000\u0000\u0131\u0132\u0006\t\uffff\uffff\u0000\u0132\u014c"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0003\u0000\u0000\u0134\u0135"+
		"\u0003\b\u0004\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136\u0137\u0003"+
		"\u0012\t\r\u0137\u0138\u0006\t\uffff\uffff\u0000\u0138\u014c\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005!\u0000\u0000\u013a\u013b\u0003\u0012\t"+
		"\f\u013b\u013c\u0006\t\uffff\uffff\u0000\u013c\u014c\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\"\u0000\u0000\u013e\u013f\u0003\u0012\t\u000b"+
		"\u013f\u0140\u0006\t\uffff\uffff\u0000\u0140\u014c\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u00051\u0000\u0000\u0142\u014c\u0006\t\uffff\uffff\u0000"+
		"\u0143\u0144\u00052\u0000\u0000\u0144\u014c\u0006\t\uffff\uffff\u0000"+
		"\u0145\u0146\u00053\u0000\u0000\u0146\u014c\u0006\t\uffff\uffff\u0000"+
		"\u0147\u0148\u00054\u0000\u0000\u0148\u014c\u0006\t\uffff\uffff\u0000"+
		"\u0149\u014a\u00055\u0000\u0000\u014a\u014c\u0006\t\uffff\uffff\u0000"+
		"\u014b\u012a\u0001\u0000\u0000\u0000\u014b\u012e\u0001\u0000\u0000\u0000"+
		"\u014b\u0133\u0001\u0000\u0000\u0000\u014b\u0139\u0001\u0000\u0000\u0000"+
		"\u014b\u013d\u0001\u0000\u0000\u0000\u014b\u0141\u0001\u0000\u0000\u0000"+
		"\u014b\u0143\u0001\u0000\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000"+
		"\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u0174\u0001\u0000\u0000\u0000\u014d\u014e\n\n\u0000\u0000\u014e"+
		"\u014f\u0007\u0002\u0000\u0000\u014f\u0150\u0003\u0012\t\u000b\u0150\u0151"+
		"\u0006\t\uffff\uffff\u0000\u0151\u0173\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\n\t\u0000\u0000\u0153\u0154\u0007\u0003\u0000\u0000\u0154\u0155\u0003"+
		"\u0012\t\n\u0155\u0156\u0006\t\uffff\uffff\u0000\u0156\u0173\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\n\b\u0000\u0000\u0158\u0159\u0007\u0004\u0000"+
		"\u0000\u0159\u015a\u0003\u0012\t\t\u015a\u015b\u0006\t\uffff\uffff\u0000"+
		"\u015b\u0173\u0001\u0000\u0000\u0000\u015c\u015d\n\u0007\u0000\u0000\u015d"+
		"\u015e\u0007\u0005\u0000\u0000\u015e\u015f\u0003\u0012\t\b\u015f\u0160"+
		"\u0006\t\uffff\uffff\u0000\u0160\u0173\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\n\u0006\u0000\u0000\u0162\u0163\u0005/\u0000\u0000\u0163\u0164\u0003"+
		"\u0012\t\u0000\u0164\u0165\u0005\b\u0000\u0000\u0165\u0166\u0003\u0012"+
		"\t\u0007\u0166\u0167\u0006\t\uffff\uffff\u0000\u0167\u0173\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\n\u000f\u0000\u0000\u0169\u016a\u0005\u000e\u0000"+
		"\u0000\u016a\u016b\u0003\u0012\t\u0000\u016b\u016c\u0005\u000f\u0000\u0000"+
		"\u016c\u016d\u0006\t\uffff\uffff\u0000\u016d\u0173\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\n\u000e\u0000\u0000\u016f\u0170\u0005 \u0000\u0000\u0170"+
		"\u0171\u00055\u0000\u0000\u0171\u0173\u0006\t\uffff\uffff\u0000\u0172"+
		"\u014d\u0001\u0000\u0000\u0000\u0172\u0152\u0001\u0000\u0000\u0000\u0172"+
		"\u0157\u0001\u0000\u0000\u0000\u0172\u015c\u0001\u0000\u0000\u0000\u0172"+
		"\u0161\u0001\u0000\u0000\u0000\u0172\u0168\u0001\u0000\u0000\u0000\u0172"+
		"\u016e\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0013\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u001c"+
		"\u0019&.;D[^emu\u0090\u0095\u00a5\u00bb\u00c2\u00cb\u00d2\u00d4\u00e2"+
		"\u00e9\u00fb\u0102\u0113\u011a\u0127\u014b\u0172\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}