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
		T__38=39, TRASH=40, INT_CONSTANT=41, REAL_CONSTANT=42, CHAR_CONSTANT=43, 
		IDENT=44;
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
			"'int'", "'double'", "'char'", "'['", "']'", "'struct'", "'='", "'print'", 
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
			null, null, null, null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
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
			setState(147);
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
				setState(130);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(131);
				match(T__13);
				setState(132);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).t =  new ArrayType(((TypeContext)_localctx).type.t, LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__14);
				setState(136);
				match(T__4);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(137);
					((TypeContext)_localctx).var_definition = var_definition();
					 for (Definition def : ((TypeContext)_localctx).var_definition.list) { if (_localctx.defs.stream().anyMatch( d -> d.name.equals(def.getName()) )) new ErrorType("duplicated field", def.getLine(), def.getColumn()); _localctx.defs.add( new RecordField(def.getName(), def.getType(), def.getLine(), def.getColumn() ) ); } 
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((ExpStmtContext)_localctx).left = expression(0);
			setState(150);
			match(T__15);
			setState(151);
			((ExpStmtContext)_localctx).right = expression(0);
			 ((ExpStmtContext)_localctx).ast =  new Assignment( ((ExpStmtContext)_localctx).left.ast, ((ExpStmtContext)_localctx).right.ast, ((ExpStmtContext)_localctx).left.ast.getLine(), ((ExpStmtContext)_localctx).left.ast.getColumn() ); 
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__16);
				setState(155);
				((StatementContext)_localctx).exps = expressions();
				setState(156);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Print( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__17);
				setState(160);
				((StatementContext)_localctx).exps = expressions();
				setState(161);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Input( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(T__18);
				setState(165);
				match(T__2);
				setState(166);
				((StatementContext)_localctx).expression = expression(0);
				setState(167);
				match(T__3);
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(168);
					match(T__4);
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
						{
						{
						setState(169);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(177);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__16:
				case T__17:
				case T__18:
				case T__20:
				case T__21:
				case T__22:
				case T__24:
				case T__25:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case IDENT:
					{
					{
					setState(178);
					((StatementContext)_localctx).stm2 = statement();
					 _localctx.stmts.addAll( ((StatementContext)_localctx).stm2.list ); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__19);
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						{
						setState(184);
						match(T__4);
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
							{
							{
							setState(185);
							((StatementContext)_localctx).stm3 = statement();
							 _localctx.elseStmts.addAll( ((StatementContext)_localctx).stm3.list ); 
							}
							}
							setState(192);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(193);
						match(T__5);
						}
						}
						break;
					case T__2:
					case T__16:
					case T__17:
					case T__18:
					case T__20:
					case T__21:
					case T__22:
					case T__24:
					case T__25:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case IDENT:
						{
						{
						setState(194);
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
				setState(203);
				match(T__20);
				setState(204);
				match(T__2);
				setState(205);
				((StatementContext)_localctx).expression = expression(0);
				setState(206);
				match(T__3);
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(207);
					match(T__4);
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
						{
						{
						setState(208);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(215);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(216);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__16:
				case T__17:
				case T__18:
				case T__20:
				case T__21:
				case T__22:
				case T__24:
				case T__25:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case IDENT:
					{
					setState(217);
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
				setState(224);
				match(T__21);
				setState(225);
				match(T__2);
				setState(226);
				((StatementContext)_localctx).initialization = expStmt();
				setState(227);
				match(T__8);
				setState(228);
				((StatementContext)_localctx).condition = ((StatementContext)_localctx).expression = expression(0);
				setState(229);
				match(T__8);
				setState(230);
				((StatementContext)_localctx).increment = expStmt();
				setState(231);
				match(T__3);
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(232);
					match(T__4);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985465094152L) != 0)) {
						{
						{
						setState(233);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(241);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__16:
				case T__17:
				case T__18:
				case T__20:
				case T__21:
				case T__22:
				case T__24:
				case T__25:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case IDENT:
					{
					setState(242);
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
				setState(249);
				match(T__22);
				setState(250);
				((StatementContext)_localctx).exp = expression(0);
				setState(251);
				match(T__8);
				 _localctx.list.add( new Return( ((StatementContext)_localctx).exp.ast, ((StatementContext)_localctx).exp.ast.getLine(), ((StatementContext)_localctx).exp.ast.getColumn() ) ); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				((StatementContext)_localctx).func_call = func_call();
				setState(255);
				match(T__8);
				 _localctx.list.add( ((StatementContext)_localctx).func_call.ast ); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				((StatementContext)_localctx).expStmt = expStmt();
				setState(259);
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
			setState(264);
			((Func_callContext)_localctx).IDENT = match(IDENT);
			setState(265);
			match(T__2);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32985449496584L) != 0)) {
				{
				setState(266);
				((Func_callContext)_localctx).expressions = expressions();
				 _localctx.exps.addAll( ((Func_callContext)_localctx).expressions.list ); 
				}
			}

			setState(271);
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
			setState(274);
			((ExpressionsContext)_localctx).exp1 = expression(0);
			 _localctx.list.add(((ExpressionsContext)_localctx).exp1.ast); 
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(276);
				match(T__6);
				setState(277);
				((ExpressionsContext)_localctx).exp2 = expression(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).exp2.ast); 
				}
				}
				setState(284);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(286);
				((ExpressionContext)_localctx).func_call = func_call();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_call.ast; 
				}
				break;
			case 2:
				{
				setState(289);
				match(T__2);
				setState(290);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(291);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast; 
				}
				break;
			case 3:
				{
				setState(294);
				match(T__2);
				setState(295);
				((ExpressionContext)_localctx).type = type();
				setState(296);
				match(T__3);
				setState(297);
				((ExpressionContext)_localctx).target = expression(12);
				 ((ExpressionContext)_localctx).ast =  new Cast( ((ExpressionContext)_localctx).target.ast, ((ExpressionContext)_localctx).type.t, ((ExpressionContext)_localctx).target.ast.getLine(), ((ExpressionContext)_localctx).target.ast.getColumn()); 
				}
				break;
			case 4:
				{
				setState(300);
				match(T__24);
				setState(301);
				((ExpressionContext)_localctx).exp = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 5:
				{
				setState(304);
				match(T__25);
				setState(305);
				((ExpressionContext)_localctx).exp = expression(10);
				 ((ExpressionContext)_localctx).ast =  new Not( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 6:
				{
				setState(308);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral( LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)), ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 7:
				{
				setState(310);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral( LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)), ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 8:
				{
				setState(312);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral( LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)), ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 9:
				{
				setState(314);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable( (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).IDENT.getLine(), ((ExpressionContext)_localctx).IDENT.getCharPositionInLine()+1 ); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(319);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						((ExpressionContext)_localctx).right = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(324);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__29) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(325);
						((ExpressionContext)_localctx).right = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(329);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 135291469824L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(330);
						((ExpressionContext)_localctx).right = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Comparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(334);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						((ExpressionContext)_localctx).right = expression(7);
						 ((ExpressionContext)_localctx).ast =  new LogicComparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(339);
						match(T__38);
						setState(340);
						((ExpressionContext)_localctx).exp1 = expression(0);
						setState(341);
						match(T__7);
						setState(342);
						((ExpressionContext)_localctx).exp2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Ternary( ((ExpressionContext)_localctx).condition.ast, ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast, ((ExpressionContext)_localctx).condition.ast.getLine(), ((ExpressionContext)_localctx).condition.ast.getColumn() ); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.var = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(346);
						match(T__12);
						setState(347);
						((ExpressionContext)_localctx).index = expression(0);
						setState(348);
						match(T__13);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess( ((ExpressionContext)_localctx).var.ast, ((ExpressionContext)_localctx).index.ast, ((ExpressionContext)_localctx).var.ast.getLine(), ((ExpressionContext)_localctx).var.ast.getColumn()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(352);
						match(T__23);
						setState(353);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess( ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
						}
						break;
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0169\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004\u0090\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ad\b\u0006\n\u0006"+
		"\f\u0006\u00b0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00bd\b\u0006\n\u0006\f\u0006\u00c0\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c6\b\u0006\u0003"+
		"\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d4\b\u0006\n\u0006\f\u0006\u00d7\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00ed\b\u0006\n\u0006\f\u0006\u00f0\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f6\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0107\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0119\b\b\n\b\f\b\u011c\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u013d\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0164\b\t\n\t\f\t\u0167\t\t\u0001\t\u0000\u0001"+
		"\u0012\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0004\u0001"+
		"\u0000\u001b\u001d\u0002\u0000\u0019\u0019\u001e\u001e\u0001\u0000\u001f"+
		"$\u0001\u0000%&\u018e\u0000\u0019\u0001\u0000\u0000\u0000\u0002;\u0001"+
		"\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000"+
		"\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000"+
		"\f\u0106\u0001\u0000\u0000\u0000\u000e\u0108\u0001\u0000\u0000\u0000\u0010"+
		"\u0112\u0001\u0000\u0000\u0000\u0012\u013c\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0006\u0000\uffff\uffff\u0000"+
		"\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000"+
		"\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000"+
		"\u001f \u0005\u0004\u0000\u0000 &\u0005\u0005\u0000\u0000!\"\u0003\u0004"+
		"\u0002\u0000\"#\u0006\u0000\uffff\uffff\u0000#%\u0001\u0000\u0000\u0000"+
		"$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'.\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0003\f\u0006\u0000*+\u0006\u0000\uffff\uffff\u0000+-\u0001"+
		"\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000012\u0005\u0006\u0000\u000023\u0005\u0000"+
		"\u0000\u000134\u0006\u0000\uffff\uffff\u00004\u0001\u0001\u0000\u0000"+
		"\u000056\u0003\u0004\u0002\u000067\u0006\u0001\uffff\uffff\u00007<\u0001"+
		"\u0000\u0000\u000089\u0003\u0006\u0003\u00009:\u0006\u0001\uffff\uffff"+
		"\u0000:<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;8\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005,\u0000\u0000>D\u0006"+
		"\u0002\uffff\uffff\u0000?@\u0005\u0007\u0000\u0000@A\u0005,\u0000\u0000"+
		"AC\u0006\u0002\uffff\uffff\u0000B?\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000HI\u0003"+
		"\b\u0004\u0000IJ\u0005\t\u0000\u0000JK\u0006\u0002\uffff\uffff\u0000K"+
		"\u0005\u0001\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0005,\u0000"+
		"\u0000N^\u0005\u0003\u0000\u0000OP\u0005,\u0000\u0000PQ\u0005\b\u0000"+
		"\u0000QR\u0003\b\u0004\u0000R[\u0006\u0003\uffff\uffff\u0000ST\u0005\u0007"+
		"\u0000\u0000TU\u0005,\u0000\u0000UV\u0005\b\u0000\u0000VW\u0003\b\u0004"+
		"\u0000WX\u0006\u0003\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000YS\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^O\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`e\u0005\u0004\u0000\u0000ab\u0005\b\u0000\u0000bc\u0003\b"+
		"\u0004\u0000cd\u0006\u0003\uffff\uffff\u0000df\u0001\u0000\u0000\u0000"+
		"ea\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gm\u0005\u0005\u0000\u0000hi\u0003\u0004\u0002\u0000ij\u0006\u0003"+
		"\uffff\uffff\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nu\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003\f\u0006"+
		"\u0000qr\u0006\u0003\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sp\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0006\u0000\u0000yz\u0006\u0003\uffff\uffff\u0000z\u0007"+
		"\u0001\u0000\u0000\u0000{|\u0005\n\u0000\u0000|\u0094\u0006\u0004\uffff"+
		"\uffff\u0000}~\u0005\u000b\u0000\u0000~\u0094\u0006\u0004\uffff\uffff"+
		"\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0094\u0006\u0004\uffff\uffff"+
		"\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0083\u0005)\u0000\u0000"+
		"\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0085\u0003\b\u0004\u0000\u0085"+
		"\u0086\u0006\u0004\uffff\uffff\u0000\u0086\u0094\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u008e\u0005\u0005\u0000\u0000"+
		"\u0089\u008a\u0003\u0004\u0002\u0000\u008a\u008b\u0006\u0004\uffff\uffff"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0006\u0000"+
		"\u0000\u0092\u0094\u0006\u0004\uffff\uffff\u0000\u0093{\u0001\u0000\u0000"+
		"\u0000\u0093}\u0001\u0000\u0000\u0000\u0093\u007f\u0001\u0000\u0000\u0000"+
		"\u0093\u0081\u0001\u0000\u0000\u0000\u0093\u0087\u0001\u0000\u0000\u0000"+
		"\u0094\t\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096"+
		"\u0097\u0005\u0010\u0000\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098\u0099"+
		"\u0006\u0005\uffff\uffff\u0000\u0099\u000b\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0011\u0000\u0000\u009b\u009c\u0003\u0010\b\u0000\u009c\u009d"+
		"\u0005\t\u0000\u0000\u009d\u009e\u0006\u0006\uffff\uffff\u0000\u009e\u0107"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0012\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0010\b\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a3\u0006"+
		"\u0006\uffff\uffff\u0000\u00a3\u0107\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0013\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0012\t\u0000\u00a7\u00b5\u0005\u0004\u0000\u0000\u00a8\u00ae\u0005"+
		"\u0005\u0000\u0000\u00a9\u00aa\u0003\f\u0006\u0000\u00aa\u00ab\u0006\u0006"+
		"\uffff\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0005"+
		"\u0006\u0000\u0000\u00b2\u00b3\u0003\f\u0006\u0000\u00b3\u00b4\u0006\u0006"+
		"\uffff\uffff\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00c5\u0005\u0014\u0000\u0000\u00b8\u00be\u0005"+
		"\u0005\u0000\u0000\u00b9\u00ba\u0003\f\u0006\u0000\u00ba\u00bb\u0006\u0006"+
		"\uffff\uffff\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6\u0005"+
		"\u0006\u0000\u0000\u00c2\u00c3\u0003\f\u0006\u0000\u00c3\u00c4\u0006\u0006"+
		"\uffff\uffff\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c7\u00b7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006"+
		"\u0006\uffff\uffff\u0000\u00ca\u0107\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0015\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce"+
		"\u0003\u0012\t\u0000\u00ce\u00dc\u0005\u0004\u0000\u0000\u00cf\u00d5\u0005"+
		"\u0005\u0000\u0000\u00d0\u00d1\u0003\f\u0006\u0000\u00d1\u00d2\u0006\u0006"+
		"\uffff\uffff\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00dd\u0005"+
		"\u0006\u0000\u0000\u00d9\u00da\u0003\f\u0006\u0000\u00da\u00db\u0006\u0006"+
		"\uffff\uffff\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001"+
		"\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0006\u0006\uffff\uffff\u0000\u00df\u0107"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0016\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0003\u0000\u0000\u00e2\u00e3\u0003\n\u0005\u0000\u00e3\u00e4\u0005"+
		"\t\u0000\u0000\u00e4\u00e5\u0003\u0012\t\u0000\u00e5\u00e6\u0005\t\u0000"+
		"\u0000\u00e6\u00e7\u0003\n\u0005\u0000\u00e7\u00f5\u0005\u0004\u0000\u0000"+
		"\u00e8\u00ee\u0005\u0005\u0000\u0000\u00e9\u00ea\u0003\f\u0006\u0000\u00ea"+
		"\u00eb\u0006\u0006\uffff\uffff\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f6\u0005\u0006\u0000\u0000\u00f2\u00f3\u0003\f\u0006\u0000\u00f3"+
		"\u00f4\u0006\u0006\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e8\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0006\u0006\uffff\uffff"+
		"\u0000\u00f8\u0107\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0017\u0000"+
		"\u0000\u00fa\u00fb\u0003\u0012\t\u0000\u00fb\u00fc\u0005\t\u0000\u0000"+
		"\u00fc\u00fd\u0006\u0006\uffff\uffff\u0000\u00fd\u0107\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0003\u000e\u0007\u0000\u00ff\u0100\u0005\t\u0000\u0000"+
		"\u0100\u0101\u0006\u0006\uffff\uffff\u0000\u0101\u0107\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0003\n\u0005\u0000\u0103\u0104\u0005\t\u0000\u0000"+
		"\u0104\u0105\u0006\u0006\uffff\uffff\u0000\u0105\u0107\u0001\u0000\u0000"+
		"\u0000\u0106\u009a\u0001\u0000\u0000\u0000\u0106\u009f\u0001\u0000\u0000"+
		"\u0000\u0106\u00a4\u0001\u0000\u0000\u0000\u0106\u00cb\u0001\u0000\u0000"+
		"\u0000\u0106\u00e0\u0001\u0000\u0000\u0000\u0106\u00f9\u0001\u0000\u0000"+
		"\u0000\u0106\u00fe\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000"+
		"\u0000\u0107\r\u0001\u0000\u0000\u0000\u0108\u0109\u0005,\u0000\u0000"+
		"\u0109\u010d\u0005\u0003\u0000\u0000\u010a\u010b\u0003\u0010\b\u0000\u010b"+
		"\u010c\u0006\u0007\uffff\uffff\u0000\u010c\u010e\u0001\u0000\u0000\u0000"+
		"\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0004\u0000\u0000"+
		"\u0110\u0111\u0006\u0007\uffff\uffff\u0000\u0111\u000f\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0003\u0012\t\u0000\u0113\u011a\u0006\b\uffff\uffff"+
		"\u0000\u0114\u0115\u0005\u0007\u0000\u0000\u0115\u0116\u0003\u0012\t\u0000"+
		"\u0116\u0117\u0006\b\uffff\uffff\u0000\u0117\u0119\u0001\u0000\u0000\u0000"+
		"\u0118\u0114\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000"+
		"\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u0011\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0006\t\uffff\uffff\u0000\u011e\u011f\u0003\u000e\u0007\u0000"+
		"\u011f\u0120\u0006\t\uffff\uffff\u0000\u0120\u013d\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123\u0003\u0012\t\u0000\u0123"+
		"\u0124\u0005\u0004\u0000\u0000\u0124\u0125\u0006\t\uffff\uffff\u0000\u0125"+
		"\u013d\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000\u0127"+
		"\u0128\u0003\b\u0004\u0000\u0128\u0129\u0005\u0004\u0000\u0000\u0129\u012a"+
		"\u0003\u0012\t\f\u012a\u012b\u0006\t\uffff\uffff\u0000\u012b\u013d\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005\u0019\u0000\u0000\u012d\u012e\u0003"+
		"\u0012\t\u000b\u012e\u012f\u0006\t\uffff\uffff\u0000\u012f\u013d\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005\u001a\u0000\u0000\u0131\u0132\u0003"+
		"\u0012\t\n\u0132\u0133\u0006\t\uffff\uffff\u0000\u0133\u013d\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005)\u0000\u0000\u0135\u013d\u0006\t\uffff"+
		"\uffff\u0000\u0136\u0137\u0005*\u0000\u0000\u0137\u013d\u0006\t\uffff"+
		"\uffff\u0000\u0138\u0139\u0005+\u0000\u0000\u0139\u013d\u0006\t\uffff"+
		"\uffff\u0000\u013a\u013b\u0005,\u0000\u0000\u013b\u013d\u0006\t\uffff"+
		"\uffff\u0000\u013c\u011d\u0001\u0000\u0000\u0000\u013c\u0121\u0001\u0000"+
		"\u0000\u0000\u013c\u0126\u0001\u0000\u0000\u0000\u013c\u012c\u0001\u0000"+
		"\u0000\u0000\u013c\u0130\u0001\u0000\u0000\u0000\u013c\u0134\u0001\u0000"+
		"\u0000\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c\u0138\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0165\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\n\t\u0000\u0000\u013f\u0140\u0007\u0000\u0000"+
		"\u0000\u0140\u0141\u0003\u0012\t\n\u0141\u0142\u0006\t\uffff\uffff\u0000"+
		"\u0142\u0164\u0001\u0000\u0000\u0000\u0143\u0144\n\b\u0000\u0000\u0144"+
		"\u0145\u0007\u0001\u0000\u0000\u0145\u0146\u0003\u0012\t\t\u0146\u0147"+
		"\u0006\t\uffff\uffff\u0000\u0147\u0164\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\n\u0007\u0000\u0000\u0149\u014a\u0007\u0002\u0000\u0000\u014a\u014b\u0003"+
		"\u0012\t\b\u014b\u014c\u0006\t\uffff\uffff\u0000\u014c\u0164\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\n\u0006\u0000\u0000\u014e\u014f\u0007\u0003\u0000"+
		"\u0000\u014f\u0150\u0003\u0012\t\u0007\u0150\u0151\u0006\t\uffff\uffff"+
		"\u0000\u0151\u0164\u0001\u0000\u0000\u0000\u0152\u0153\n\u0005\u0000\u0000"+
		"\u0153\u0154\u0005\'\u0000\u0000\u0154\u0155\u0003\u0012\t\u0000\u0155"+
		"\u0156\u0005\b\u0000\u0000\u0156\u0157\u0003\u0012\t\u0006\u0157\u0158"+
		"\u0006\t\uffff\uffff\u0000\u0158\u0164\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\n\u000e\u0000\u0000\u015a\u015b\u0005\r\u0000\u0000\u015b\u015c\u0003"+
		"\u0012\t\u0000\u015c\u015d\u0005\u000e\u0000\u0000\u015d\u015e\u0006\t"+
		"\uffff\uffff\u0000\u015e\u0164\u0001\u0000\u0000\u0000\u015f\u0160\n\r"+
		"\u0000\u0000\u0160\u0161\u0005\u0018\u0000\u0000\u0161\u0162\u0005,\u0000"+
		"\u0000\u0162\u0164\u0006\t\uffff\uffff\u0000\u0163\u013e\u0001\u0000\u0000"+
		"\u0000\u0163\u0143\u0001\u0000\u0000\u0000\u0163\u0148\u0001\u0000\u0000"+
		"\u0000\u0163\u014d\u0001\u0000\u0000\u0000\u0163\u0152\u0001\u0000\u0000"+
		"\u0000\u0163\u0159\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0013\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u001b\u0019&.;D[^emu\u008e"+
		"\u0093\u00ae\u00b5\u00be\u00c5\u00c7\u00d5\u00dc\u00ee\u00f5\u0106\u010d"+
		"\u011a\u013c\u0163\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}