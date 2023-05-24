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
		T__45=46, T__46=47, T__47=48, TRASH=49, INT_CONSTANT=50, REAL_CONSTANT=51, 
		CHAR_CONSTANT=52, BOOL_CONSTANT=53, IDENT=54;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_var_definition = 2, RULE_func_definition = 3, 
		RULE_typedef = 4, RULE_type = 5, RULE_expStmt = 6, RULE_statement = 7, 
		RULE_func_call = 8, RULE_expressions = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "var_definition", "func_definition", "typedef", 
			"type", "expStmt", "statement", "func_call", "expressions", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "'{'", "'}'", "','", "':'", "';'", 
			"'typedef'", "'int'", "'double'", "'char'", "'boolean'", "'['", "']'", 
			"'struct'", "'='", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'print'", "'input'", "'if'", "'else'", "'while'", "'for'", "'return'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "BOOL_CONSTANT", 
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
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
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
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					((ProgramContext)_localctx).definition = definition();
					 _localctx.defs.addAll( ((ProgramContext)_localctx).definition.list ); 
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(30);
			((ProgramContext)_localctx).MAIN = match(T__0);
			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
			match(T__3);
			setState(34);
			match(T__4);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
				{
				{
				setState(35);
				((ProgramContext)_localctx).statement = statement();
				 _localctx.mainStmts.addAll( ((ProgramContext)_localctx).statement.list ); 
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(T__5);
			setState(44);
			match(EOF);
			 _localctx.defs.add( new FuncDefinition( "main", new FunctionType( new ArrayList<>(), VoidType.getInstance() ), _localctx.mainStmts, ((ProgramContext)_localctx).MAIN.getLine(), ((ProgramContext)_localctx).MAIN.getCharPositionInLine()+1 ) ); ((ProgramContext)_localctx).ast =  new Program( _localctx.defs ); 
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
		public TypedefContext typedef;
		public Func_definitionContext func_definition;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((DefinitionContext)_localctx).var_definition = var_definition();
				 _localctx.list.addAll( ((DefinitionContext)_localctx).var_definition.list ); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((DefinitionContext)_localctx).typedef = typedef();
				 _localctx.list.add( ((DefinitionContext)_localctx).typedef.ast ); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
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
			setState(58);
			((Var_definitionContext)_localctx).ID1 = match(IDENT);
			 _localctx.ids.add(((Var_definitionContext)_localctx).ID1); 
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(60);
				match(T__6);
				setState(61);
				((Var_definitionContext)_localctx).ID2 = match(IDENT);
				 if (_localctx.ids.stream().anyMatch( id -> id.getText().equals((((Var_definitionContext)_localctx).ID2!=null?((Var_definitionContext)_localctx).ID2.getText():null)) )) new ErrorType("duplicated variable", ((Var_definitionContext)_localctx).ID2.getLine(), ((Var_definitionContext)_localctx).ID2.getCharPositionInLine()+1); _localctx.ids.add(((Var_definitionContext)_localctx).ID2); 
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__7);
			setState(69);
			((Var_definitionContext)_localctx).type = type();
			setState(70);
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
		public List<Statement> stmts = new ArrayList<>();;
		public Type retType = VoidType.getInstance();;
		public Token ID;
		public Token ID1;
		public TypeContext T1;
		public Token ID2;
		public TypeContext T2;
		public TypeContext rt;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__0);
			setState(74);
			((Func_definitionContext)_localctx).ID = match(IDENT);
			setState(75);
			match(T__2);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(76);
				((Func_definitionContext)_localctx).ID1 = match(IDENT);
				setState(77);
				match(T__7);
				setState(78);
				((Func_definitionContext)_localctx).T1 = type();
				 _localctx.args.add( new VarDefinition( (((Func_definitionContext)_localctx).ID1!=null?((Func_definitionContext)_localctx).ID1.getText():null), ((Func_definitionContext)_localctx).T1.t, ((Func_definitionContext)_localctx).ID1.getLine(), ((Func_definitionContext)_localctx).ID1.getCharPositionInLine()+1 ) ); 
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(80);
					match(T__6);
					setState(81);
					((Func_definitionContext)_localctx).ID2 = match(IDENT);
					setState(82);
					match(T__7);
					setState(83);
					((Func_definitionContext)_localctx).T2 = type();
					 _localctx.args.add( new VarDefinition( (((Func_definitionContext)_localctx).ID2!=null?((Func_definitionContext)_localctx).ID2.getText():null), ((Func_definitionContext)_localctx).T2.t, ((Func_definitionContext)_localctx).ID2.getLine(), ((Func_definitionContext)_localctx).ID2.getCharPositionInLine()+1 ) ); 
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
			match(T__3);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(94);
				match(T__7);
				setState(95);
				((Func_definitionContext)_localctx).rt = type();
				 ((Func_definitionContext)_localctx).retType =  ((Func_definitionContext)_localctx).rt.t; 
				}
			}

			setState(100);
			match(T__4);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
				{
				{
				setState(101);
				((Func_definitionContext)_localctx).stmt = statement();
				 _localctx.stmts.addAll( ((Func_definitionContext)_localctx).stmt.list ); 
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
			 ((Func_definitionContext)_localctx).ast =  new FuncDefinition( (((Func_definitionContext)_localctx).ID!=null?((Func_definitionContext)_localctx).ID.getText():null), new FunctionType( _localctx.args, _localctx.retType ), _localctx.stmts, ((Func_definitionContext)_localctx).ID.getLine(), ((Func_definitionContext)_localctx).ID.getCharPositionInLine()+1 ); 
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
	public static class TypedefContext extends ParserRuleContext {
		public TypeDefinition ast;
		public Token DEF;
		public Token IDENT;
		public TypeContext type;
		public TerminalNode IDENT() { return getToken(PmmParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((TypedefContext)_localctx).DEF = match(T__9);
			setState(113);
			((TypedefContext)_localctx).IDENT = match(IDENT);
			setState(114);
			((TypedefContext)_localctx).type = type();
			setState(115);
			match(T__8);
			 ((TypedefContext)_localctx).ast =  new TypeDefinition( ((TypedefContext)_localctx).type.t, (((TypedefContext)_localctx).IDENT!=null?((TypedefContext)_localctx).IDENT.getText():null), ((TypedefContext)_localctx).DEF.getLine(), ((TypedefContext)_localctx).DEF.getCharPositionInLine()+1 ); 
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
		public Token IDENT;
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
		public TerminalNode IDENT() { return getToken(PmmParser.IDENT, 0); }
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__10);
				 ((TypeContext)_localctx).t =  IntType.getInstance(); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__11);
				 ((TypeContext)_localctx).t =  DoubleType.getInstance(); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(T__12);
				 ((TypeContext)_localctx).t =  CharType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__13);
				 ((TypeContext)_localctx).t =  BoolType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__14);
				setState(127);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(128);
				match(T__15);
				setState(129);
				((TypeContext)_localctx).type = type();
				 ((TypeContext)_localctx).t =  new ArrayType(((TypeContext)_localctx).type.t, LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(T__16);
				setState(133);
				match(T__4);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(134);
					((TypeContext)_localctx).var_definition = var_definition();
					 for (Definition def : ((TypeContext)_localctx).var_definition.list) { if (_localctx.defs.stream().anyMatch( d -> d.name.equals(def.getName()) )) new ErrorType("duplicated field", def.getLine(), def.getColumn()); _localctx.defs.add( new RecordField(def.getName(), def.getType(), def.getLine(), def.getColumn() ) ); } 
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__5);
				 ((TypeContext)_localctx).t =  new RecordType( _localctx.defs ); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				((TypeContext)_localctx).IDENT = match(IDENT);
				 ((TypeContext)_localctx).t =  new CustomType( (((TypeContext)_localctx).IDENT!=null?((TypeContext)_localctx).IDENT.getText():null), ((TypeContext)_localctx).IDENT.getLine(), ((TypeContext)_localctx).IDENT.getCharPositionInLine()+1 ); 
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
		enterRule(_localctx, 12, RULE_expStmt);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((ExpStmtContext)_localctx).left = expression(0);
				setState(149);
				match(T__17);
				setState(150);
				((ExpStmtContext)_localctx).right = expression(0);
				 ((ExpStmtContext)_localctx).ast =  new Assignment( ((ExpStmtContext)_localctx).left.ast, ((ExpStmtContext)_localctx).right.ast, ((ExpStmtContext)_localctx).left.ast.getLine(), ((ExpStmtContext)_localctx).left.ast.getColumn() ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((ExpStmtContext)_localctx).expression = expression(0);
				setState(154);
				((ExpStmtContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
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
				setState(157);
				((ExpStmtContext)_localctx).left = ((ExpStmtContext)_localctx).expression = expression(0);
				setState(158);
				((ExpStmtContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
					((ExpStmtContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
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
		public Token RET;
		public Func_callContext func_call;
		public ExpStmtContext expStmt;
		public Var_definitionContext var_definition;
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
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__25);
				setState(165);
				((StatementContext)_localctx).exps = expressions();
				setState(166);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Print( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__26);
				setState(170);
				((StatementContext)_localctx).exps = expressions();
				setState(171);
				match(T__8);
				 _localctx.list.addAll( ((StatementContext)_localctx).exps.list.stream().map( e -> new Input( e, e.getLine(), e.getColumn()) ).toList() ); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__27);
				setState(175);
				match(T__2);
				setState(176);
				((StatementContext)_localctx).expression = expression(0);
				setState(177);
				match(T__3);
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(178);
					match(T__4);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
						{
						{
						setState(179);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(187);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__25:
				case T__26:
				case T__27:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__34:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					{
					setState(188);
					((StatementContext)_localctx).stm2 = statement();
					 _localctx.stmts.addAll( ((StatementContext)_localctx).stm2.list ); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(193);
					match(T__28);
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						{
						setState(194);
						match(T__4);
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
							{
							{
							setState(195);
							((StatementContext)_localctx).stm3 = statement();
							 _localctx.elseStmts.addAll( ((StatementContext)_localctx).stm3.list ); 
							}
							}
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(203);
						match(T__5);
						}
						}
						break;
					case T__2:
					case T__25:
					case T__26:
					case T__27:
					case T__29:
					case T__30:
					case T__31:
					case T__33:
					case T__34:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case BOOL_CONSTANT:
					case IDENT:
						{
						{
						setState(204);
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
				setState(213);
				match(T__29);
				setState(214);
				match(T__2);
				setState(215);
				((StatementContext)_localctx).expression = expression(0);
				setState(216);
				match(T__3);
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(217);
					match(T__4);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
						{
						{
						setState(218);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__25:
				case T__26:
				case T__27:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__34:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					setState(227);
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
				setState(234);
				match(T__30);
				setState(235);
				match(T__2);
				setState(236);
				((StatementContext)_localctx).initialization = expStmt();
				setState(237);
				match(T__8);
				setState(238);
				((StatementContext)_localctx).condition = ((StatementContext)_localctx).expression = expression(0);
				setState(239);
				match(T__8);
				setState(240);
				((StatementContext)_localctx).increment = expStmt();
				setState(241);
				match(T__3);
				setState(255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(242);
					match(T__4);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902956637683720L) != 0)) {
						{
						{
						setState(243);
						((StatementContext)_localctx).stm = statement();
						 _localctx.stmts.addAll( ((StatementContext)_localctx).stm.list ); 
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(251);
					match(T__5);
					}
					}
					break;
				case T__2:
				case T__25:
				case T__26:
				case T__27:
				case T__29:
				case T__30:
				case T__31:
				case T__33:
				case T__34:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case BOOL_CONSTANT:
				case IDENT:
					{
					setState(252);
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
				setState(259);
				((StatementContext)_localctx).RET = match(T__31);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902948651728904L) != 0)) {
					{
					setState(260);
					((StatementContext)_localctx).expression = expression(0);
					}
				}

				setState(263);
				match(T__8);
				 _localctx.list.add( new Return( ((StatementContext)_localctx).expression != null ? ((StatementContext)_localctx).expression.ast : null, ((StatementContext)_localctx).RET.getLine(), ((StatementContext)_localctx).RET.getCharPositionInLine()+1 ) ); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				((StatementContext)_localctx).func_call = func_call();
				setState(266);
				match(T__8);
				 _localctx.list.add( ((StatementContext)_localctx).func_call.ast ); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				((StatementContext)_localctx).expStmt = expStmt();
				setState(270);
				match(T__8);
				 _localctx.list.add( ((StatementContext)_localctx).expStmt.ast ); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(273);
				((StatementContext)_localctx).var_definition = var_definition();
				 _localctx.list.addAll( ((StatementContext)_localctx).var_definition.list ); 
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
		enterRule(_localctx, 16, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((Func_callContext)_localctx).IDENT = match(IDENT);
			setState(279);
			match(T__2);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902948651728904L) != 0)) {
				{
				setState(280);
				((Func_callContext)_localctx).expressions = expressions();
				 _localctx.exps.addAll( ((Func_callContext)_localctx).expressions.list ); 
				}
			}

			setState(285);
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
		enterRule(_localctx, 18, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ExpressionsContext)_localctx).exp1 = expression(0);
			 _localctx.list.add(((ExpressionsContext)_localctx).exp1.ast); 
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(290);
				match(T__6);
				setState(291);
				((ExpressionsContext)_localctx).exp2 = expression(0);
				 _localctx.list.add(((ExpressionsContext)_localctx).exp2.ast); 
				}
				}
				setState(298);
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
		public Token BOOL_CONSTANT;
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(300);
				((ExpressionContext)_localctx).func_call = func_call();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).func_call.ast; 
				}
				break;
			case 2:
				{
				setState(303);
				match(T__2);
				setState(304);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(305);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).exp.ast; 
				}
				break;
			case 3:
				{
				setState(308);
				match(T__2);
				setState(309);
				((ExpressionContext)_localctx).type = type();
				setState(310);
				match(T__3);
				setState(311);
				((ExpressionContext)_localctx).target = expression(13);
				 ((ExpressionContext)_localctx).ast =  new Cast( ((ExpressionContext)_localctx).target.ast, ((ExpressionContext)_localctx).type.t, ((ExpressionContext)_localctx).target.ast.getLine(), ((ExpressionContext)_localctx).target.ast.getColumn()); 
				}
				break;
			case 4:
				{
				setState(314);
				match(T__33);
				setState(315);
				((ExpressionContext)_localctx).exp = expression(12);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 5:
				{
				setState(318);
				match(T__34);
				setState(319);
				((ExpressionContext)_localctx).exp = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Not( ((ExpressionContext)_localctx).exp.ast, ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
				}
				break;
			case 6:
				{
				setState(322);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral( LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)), ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 7:
				{
				setState(324);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral( LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)), ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 8:
				{
				setState(326);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral( LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)), ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 9:
				{
				setState(328);
				((ExpressionContext)_localctx).BOOL_CONSTANT = match(BOOL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new BoolLiteral( LexerHelper.lexemeToBool((((ExpressionContext)_localctx).BOOL_CONSTANT!=null?((ExpressionContext)_localctx).BOOL_CONSTANT.getText():null)), ((ExpressionContext)_localctx).BOOL_CONSTANT.getLine(), ((ExpressionContext)_localctx).BOOL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 10:
				{
				setState(330);
				((ExpressionContext)_localctx).IDENT = match(IDENT);
				 ((ExpressionContext)_localctx).ast =  new Variable( (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).IDENT.getLine(), ((ExpressionContext)_localctx).IDENT.getCharPositionInLine()+1 ); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(335);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExpressionContext)_localctx).right = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(340);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__38) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						((ExpressionContext)_localctx).right = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(345);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69269232549888L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						((ExpressionContext)_localctx).right = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Comparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(350);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__45 || _la==T__46) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(351);
						((ExpressionContext)_localctx).right = expression(8);
						 ((ExpressionContext)_localctx).ast =  new LogicComparison( ((ExpressionContext)_localctx).left.ast, (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn() ); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(355);
						match(T__47);
						setState(356);
						((ExpressionContext)_localctx).exp1 = expression(0);
						setState(357);
						match(T__7);
						setState(358);
						((ExpressionContext)_localctx).exp2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Ternary( ((ExpressionContext)_localctx).condition.ast, ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast, ((ExpressionContext)_localctx).condition.ast.getLine(), ((ExpressionContext)_localctx).condition.ast.getColumn() ); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.var = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(362);
						match(T__14);
						setState(363);
						((ExpressionContext)_localctx).index = expression(0);
						setState(364);
						match(T__15);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess( ((ExpressionContext)_localctx).var.ast, ((ExpressionContext)_localctx).index.ast, ((ExpressionContext)_localctx).var.ast.getLine(), ((ExpressionContext)_localctx).var.ast.getColumn()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(368);
						match(T__32);
						setState(369);
						((ExpressionContext)_localctx).IDENT = match(IDENT);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess( ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).IDENT!=null?((ExpressionContext)_localctx).IDENT.getText():null), ((ExpressionContext)_localctx).exp.ast.getLine(), ((ExpressionContext)_localctx).exp.ast.getColumn() ); 
						}
						break;
					}
					} 
				}
				setState(375);
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
		case 10:
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
		"\u0004\u00016\u0179\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0003\u0003\\\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003i\b\u0003\n\u0003"+
		"\f\u0003l\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u008a\b\u0005\n\u0005\f\u0005\u008d\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c0"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00c7\b\u0007\n\u0007\f\u0007\u00ca\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00d0\b\u0007\u0003\u0007\u00d2\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00de"+
		"\b\u0007\n\u0007\f\u0007\u00e1\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00e7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00f7\b\u0007\n\u0007\f\u0007\u00fa\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0100\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0106\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0115"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u011c\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0127\b\t\n\t\f\t\u012a\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u014d\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0174\b\n\n\n\f\n\u0177\t\n"+
		"\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0006\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0019"+
		"\u0001\u0000$&\u0002\u0000\"\"\'\'\u0001\u0000(-\u0001\u0000./\u01a3\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bp\u0001\u0000\u0000"+
		"\u0000\n\u0092\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000"+
		"\u000e\u0114\u0001\u0000\u0000\u0000\u0010\u0116\u0001\u0000\u0000\u0000"+
		"\u0012\u0120\u0001\u0000\u0000\u0000\u0014\u014c\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0006\u0000\uffff\uffff"+
		"\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000"+
		"\u0000\u001f \u0005\u0002\u0000\u0000 !\u0005\u0003\u0000\u0000!\"\u0005"+
		"\u0004\u0000\u0000\"(\u0005\u0005\u0000\u0000#$\u0003\u000e\u0007\u0000"+
		"$%\u0006\u0000\uffff\uffff\u0000%\'\u0001\u0000\u0000\u0000&#\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0006\u0000\u0000,-\u0005\u0000\u0000\u0001-.\u0006\u0000\uffff"+
		"\uffff\u0000.\u0001\u0001\u0000\u0000\u0000/0\u0003\u0004\u0002\u0000"+
		"01\u0006\u0001\uffff\uffff\u000019\u0001\u0000\u0000\u000023\u0003\b\u0004"+
		"\u000034\u0006\u0001\uffff\uffff\u000049\u0001\u0000\u0000\u000056\u0003"+
		"\u0006\u0003\u000067\u0006\u0001\uffff\uffff\u000079\u0001\u0000\u0000"+
		"\u00008/\u0001\u0000\u0000\u000082\u0001\u0000\u0000\u000085\u0001\u0000"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u00056\u0000\u0000;A\u0006"+
		"\u0002\uffff\uffff\u0000<=\u0005\u0007\u0000\u0000=>\u00056\u0000\u0000"+
		">@\u0006\u0002\uffff\uffff\u0000?<\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000EF\u0003"+
		"\n\u0005\u0000FG\u0005\t\u0000\u0000GH\u0006\u0002\uffff\uffff\u0000H"+
		"\u0005\u0001\u0000\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u00056\u0000"+
		"\u0000K[\u0005\u0003\u0000\u0000LM\u00056\u0000\u0000MN\u0005\b\u0000"+
		"\u0000NO\u0003\n\u0005\u0000OX\u0006\u0003\uffff\uffff\u0000PQ\u0005\u0007"+
		"\u0000\u0000QR\u00056\u0000\u0000RS\u0005\b\u0000\u0000ST\u0003\n\u0005"+
		"\u0000TU\u0006\u0003\uffff\uffff\u0000UW\u0001\u0000\u0000\u0000VP\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[L\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]b\u0005\u0004\u0000\u0000^_\u0005\b\u0000\u0000_`\u0003\n"+
		"\u0005\u0000`a\u0006\u0003\uffff\uffff\u0000ac\u0001\u0000\u0000\u0000"+
		"b^\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000dj\u0005\u0005\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0006\u0003"+
		"\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0006"+
		"\u0000\u0000no\u0006\u0003\uffff\uffff\u0000o\u0007\u0001\u0000\u0000"+
		"\u0000pq\u0005\n\u0000\u0000qr\u00056\u0000\u0000rs\u0003\n\u0005\u0000"+
		"st\u0005\t\u0000\u0000tu\u0006\u0004\uffff\uffff\u0000u\t\u0001\u0000"+
		"\u0000\u0000vw\u0005\u000b\u0000\u0000w\u0093\u0006\u0005\uffff\uffff"+
		"\u0000xy\u0005\f\u0000\u0000y\u0093\u0006\u0005\uffff\uffff\u0000z{\u0005"+
		"\r\u0000\u0000{\u0093\u0006\u0005\uffff\uffff\u0000|}\u0005\u000e\u0000"+
		"\u0000}\u0093\u0006\u0005\uffff\uffff\u0000~\u007f\u0005\u000f\u0000\u0000"+
		"\u007f\u0080\u00052\u0000\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081"+
		"\u0082\u0003\n\u0005\u0000\u0082\u0083\u0006\u0005\uffff\uffff\u0000\u0083"+
		"\u0093\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085"+
		"\u008b\u0005\u0005\u0000\u0000\u0086\u0087\u0003\u0004\u0002\u0000\u0087"+
		"\u0088\u0006\u0005\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u0086\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0093\u0006\u0005\uffff\uffff"+
		"\u0000\u0090\u0091\u00056\u0000\u0000\u0091\u0093\u0006\u0005\uffff\uffff"+
		"\u0000\u0092v\u0001\u0000\u0000\u0000\u0092x\u0001\u0000\u0000\u0000\u0092"+
		"z\u0001\u0000\u0000\u0000\u0092|\u0001\u0000\u0000\u0000\u0092~\u0001"+
		"\u0000\u0000\u0000\u0092\u0084\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095\u0003"+
		"\u0014\n\u0000\u0095\u0096\u0005\u0012\u0000\u0000\u0096\u0097\u0003\u0014"+
		"\n\u0000\u0097\u0098\u0006\u0006\uffff\uffff\u0000\u0098\u00a3\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009b\u0007\u0000\u0000"+
		"\u0000\u009b\u009c\u0006\u0006\uffff\uffff\u0000\u009c\u00a3\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0003\u0014\n\u0000\u009e\u009f\u0007\u0001\u0000"+
		"\u0000\u009f\u00a0\u0003\u0014\n\u0000\u00a0\u00a1\u0006\u0006\uffff\uffff"+
		"\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u0094\u0001\u0000\u0000"+
		"\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000"+
		"\u0000\u00a3\r\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u001a\u0000\u0000"+
		"\u00a5\u00a6\u0003\u0012\t\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7"+
		"\u00a8\u0006\u0007\uffff\uffff\u0000\u00a8\u0115\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\u001b\u0000\u0000\u00aa\u00ab\u0003\u0012\t\u0000\u00ab"+
		"\u00ac\u0005\t\u0000\u0000\u00ac\u00ad\u0006\u0007\uffff\uffff\u0000\u00ad"+
		"\u0115\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af"+
		"\u00b0\u0005\u0003\u0000\u0000\u00b0\u00b1\u0003\u0014\n\u0000\u00b1\u00bf"+
		"\u0005\u0004\u0000\u0000\u00b2\u00b8\u0005\u0005\u0000\u0000\u00b3\u00b4"+
		"\u0003\u000e\u0007\u0000\u00b4\u00b5\u0006\u0007\uffff\uffff\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005\u0006\u0000\u0000\u00bc"+
		"\u00bd\u0003\u000e\u0007\u0000\u00bd\u00be\u0006\u0007\uffff\uffff\u0000"+
		"\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b2\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00cf\u0005\u001d\u0000\u0000\u00c2\u00c8\u0005\u0005\u0000\u0000"+
		"\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0006\u0007\uffff\uffff"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d0\u0005\u0006\u0000"+
		"\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000\u00cd\u00ce\u0006\u0007\uffff"+
		"\uffff\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d1\u00c1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0006\u0007"+
		"\uffff\uffff\u0000\u00d4\u0115\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u001e\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0003"+
		"\u0014\n\u0000\u00d8\u00e6\u0005\u0004\u0000\u0000\u00d9\u00df\u0005\u0005"+
		"\u0000\u0000\u00da\u00db\u0003\u000e\u0007\u0000\u00db\u00dc\u0006\u0007"+
		"\uffff\uffff\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e7\u0005"+
		"\u0006\u0000\u0000\u00e3\u00e4\u0003\u000e\u0007\u0000\u00e4\u00e5\u0006"+
		"\u0007\uffff\uffff\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006\u0007\uffff\uffff\u0000\u00e9"+
		"\u0115\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u001f\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed\u0003\f\u0006\u0000\u00ed\u00ee"+
		"\u0005\t\u0000\u0000\u00ee\u00ef\u0003\u0014\n\u0000\u00ef\u00f0\u0005"+
		"\t\u0000\u0000\u00f0\u00f1\u0003\f\u0006\u0000\u00f1\u00ff\u0005\u0004"+
		"\u0000\u0000\u00f2\u00f8\u0005\u0005\u0000\u0000\u00f3\u00f4\u0003\u000e"+
		"\u0007\u0000\u00f4\u00f5\u0006\u0007\uffff\uffff\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fb\u0100\u0005\u0006\u0000\u0000\u00fc\u00fd\u0003"+
		"\u000e\u0007\u0000\u00fd\u00fe\u0006\u0007\uffff\uffff\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00f2\u0001\u0000\u0000\u0000\u00ff\u00fc"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0006\u0007\uffff\uffff\u0000\u0102\u0115\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0005 \u0000\u0000\u0104\u0106\u0003\u0014\n\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0005\t\u0000\u0000\u0108\u0115\u0006"+
		"\u0007\uffff\uffff\u0000\u0109\u010a\u0003\u0010\b\u0000\u010a\u010b\u0005"+
		"\t\u0000\u0000\u010b\u010c\u0006\u0007\uffff\uffff\u0000\u010c\u0115\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0003\f\u0006\u0000\u010e\u010f\u0005\t"+
		"\u0000\u0000\u010f\u0110\u0006\u0007\uffff\uffff\u0000\u0110\u0115\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0003\u0004\u0002\u0000\u0112\u0113\u0006"+
		"\u0007\uffff\uffff\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u00a4"+
		"\u0001\u0000\u0000\u0000\u0114\u00a9\u0001\u0000\u0000\u0000\u0114\u00ae"+
		"\u0001\u0000\u0000\u0000\u0114\u00d5\u0001\u0000\u0000\u0000\u0114\u00ea"+
		"\u0001\u0000\u0000\u0000\u0114\u0103\u0001\u0000\u0000\u0000\u0114\u0109"+
		"\u0001\u0000\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u0111"+
		"\u0001\u0000\u0000\u0000\u0115\u000f\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u00056\u0000\u0000\u0117\u011b\u0005\u0003\u0000\u0000\u0118\u0119\u0003"+
		"\u0012\t\u0000\u0119\u011a\u0006\b\uffff\uffff\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0004\u0000\u0000\u011e\u011f\u0006\b\uffff\uffff\u0000\u011f\u0011\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0003\u0014\n\u0000\u0121\u0128\u0006\t"+
		"\uffff\uffff\u0000\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u0124\u0003"+
		"\u0014\n\u0000\u0124\u0125\u0006\t\uffff\uffff\u0000\u0125\u0127\u0001"+
		"\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127\u012a\u0001"+
		"\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u0013\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0006\n\uffff\uffff\u0000\u012c\u012d\u0003"+
		"\u0010\b\u0000\u012d\u012e\u0006\n\uffff\uffff\u0000\u012e\u014d\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u0003\u0000\u0000\u0130\u0131\u0003"+
		"\u0014\n\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132\u0133\u0006\n"+
		"\uffff\uffff\u0000\u0133\u014d\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0003\u0000\u0000\u0135\u0136\u0003\n\u0005\u0000\u0136\u0137\u0005\u0004"+
		"\u0000\u0000\u0137\u0138\u0003\u0014\n\r\u0138\u0139\u0006\n\uffff\uffff"+
		"\u0000\u0139\u014d\u0001\u0000\u0000\u0000\u013a\u013b\u0005\"\u0000\u0000"+
		"\u013b\u013c\u0003\u0014\n\f\u013c\u013d\u0006\n\uffff\uffff\u0000\u013d"+
		"\u014d\u0001\u0000\u0000\u0000\u013e\u013f\u0005#\u0000\u0000\u013f\u0140"+
		"\u0003\u0014\n\u000b\u0140\u0141\u0006\n\uffff\uffff\u0000\u0141\u014d"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u00052\u0000\u0000\u0143\u014d\u0006"+
		"\n\uffff\uffff\u0000\u0144\u0145\u00053\u0000\u0000\u0145\u014d\u0006"+
		"\n\uffff\uffff\u0000\u0146\u0147\u00054\u0000\u0000\u0147\u014d\u0006"+
		"\n\uffff\uffff\u0000\u0148\u0149\u00055\u0000\u0000\u0149\u014d\u0006"+
		"\n\uffff\uffff\u0000\u014a\u014b\u00056\u0000\u0000\u014b\u014d\u0006"+
		"\n\uffff\uffff\u0000\u014c\u012b\u0001\u0000\u0000\u0000\u014c\u012f\u0001"+
		"\u0000\u0000\u0000\u014c\u0134\u0001\u0000\u0000\u0000\u014c\u013a\u0001"+
		"\u0000\u0000\u0000\u014c\u013e\u0001\u0000\u0000\u0000\u014c\u0142\u0001"+
		"\u0000\u0000\u0000\u014c\u0144\u0001\u0000\u0000\u0000\u014c\u0146\u0001"+
		"\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014d\u0175\u0001\u0000\u0000\u0000\u014e\u014f\n\n"+
		"\u0000\u0000\u014f\u0150\u0007\u0002\u0000\u0000\u0150\u0151\u0003\u0014"+
		"\n\u000b\u0151\u0152\u0006\n\uffff\uffff\u0000\u0152\u0174\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\n\t\u0000\u0000\u0154\u0155\u0007\u0003\u0000"+
		"\u0000\u0155\u0156\u0003\u0014\n\n\u0156\u0157\u0006\n\uffff\uffff\u0000"+
		"\u0157\u0174\u0001\u0000\u0000\u0000\u0158\u0159\n\b\u0000\u0000\u0159"+
		"\u015a\u0007\u0004\u0000\u0000\u015a\u015b\u0003\u0014\n\t\u015b\u015c"+
		"\u0006\n\uffff\uffff\u0000\u015c\u0174\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\n\u0007\u0000\u0000\u015e\u015f\u0007\u0005\u0000\u0000\u015f\u0160\u0003"+
		"\u0014\n\b\u0160\u0161\u0006\n\uffff\uffff\u0000\u0161\u0174\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\n\u0006\u0000\u0000\u0163\u0164\u00050\u0000"+
		"\u0000\u0164\u0165\u0003\u0014\n\u0000\u0165\u0166\u0005\b\u0000\u0000"+
		"\u0166\u0167\u0003\u0014\n\u0007\u0167\u0168\u0006\n\uffff\uffff\u0000"+
		"\u0168\u0174\u0001\u0000\u0000\u0000\u0169\u016a\n\u000f\u0000\u0000\u016a"+
		"\u016b\u0005\u000f\u0000\u0000\u016b\u016c\u0003\u0014\n\u0000\u016c\u016d"+
		"\u0005\u0010\u0000\u0000\u016d\u016e\u0006\n\uffff\uffff\u0000\u016e\u0174"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\n\u000e\u0000\u0000\u0170\u0171\u0005"+
		"!\u0000\u0000\u0171\u0172\u00056\u0000\u0000\u0172\u0174\u0006\n\uffff"+
		"\uffff\u0000\u0173\u014e\u0001\u0000\u0000\u0000\u0173\u0153\u0001\u0000"+
		"\u0000\u0000\u0173\u0158\u0001\u0000\u0000\u0000\u0173\u015d\u0001\u0000"+
		"\u0000\u0000\u0173\u0162\u0001\u0000\u0000\u0000\u0173\u0169\u0001\u0000"+
		"\u0000\u0000\u0173\u016f\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0015\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u001b\u001b(8AX[bj\u008b\u0092\u00a2\u00b8\u00bf\u00c8\u00cf"+
		"\u00d1\u00df\u00e6\u00f8\u00ff\u0105\u0114\u011b\u0128\u014c\u0173\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}