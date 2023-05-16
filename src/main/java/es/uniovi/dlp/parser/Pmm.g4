grammar Pmm;	

@parser::header {
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
}

program returns [Program ast] locals [List<Definition> defs = new ArrayList<>();, List<VarDefinition> mainDefs = new ArrayList<>();, List<Statement> mainStmts = new ArrayList<>(); ]:
       (definition { $defs.addAll( $definition.list ); })* MAIN='def' 'main' '('')''{' (var_definition { $mainDefs.addAll( $var_definition.list ); })* (statement { $mainStmts.addAll( $statement.list ); })* '}' EOF { $defs.add( new FuncDefinition( "main", new FunctionType( new ArrayList<>(), VoidType.get() ), $mainDefs, $mainStmts, $MAIN.getLine(), $MAIN.getCharPositionInLine()+1 ) ); $ast = new Program( $defs ); }
       ;

definition returns [List<Definition> list = new ArrayList<>();]:
            var_definition { $list.addAll( $var_definition.list ); }
          | func_definition { $list.add( $func_definition.ast ); }
          ;
var_definition returns [List<VarDefinition> list = new ArrayList<>();] locals [List<Token> ids = new ArrayList<>(); ]:
        ID1=IDENT { $ids.add($ID1); } (',' ID2=IDENT { if ($ids.stream().anyMatch( id -> id.getText().equals($ID2.text) )) new ErrorType("duplicated variable", $ID2.getLine(), $ID2.getCharPositionInLine()+1); $ids.add($ID2); })* ':' type ';'
                { for (Token id : $ids) { $list.add(new VarDefinition( id.getText(), $type.t, id.getLine(), id.getCharPositionInLine()+1 )); } }
        ;
func_definition returns [Definition ast] locals [List<VarDefinition> args = new ArrayList<>();, List<VarDefinition> defs = new ArrayList<>();, List<Statement> stmts = new ArrayList<>();, Type retType = VoidType.get(); ]:
        'def' ID=IDENT '('(ID1=IDENT':'T1=type { $args.add( new VarDefinition( $ID1.text, $T1.t, $ID1.getLine(), $ID1.getCharPositionInLine()+1 ) ); }(','ID2=IDENT':'T2=type { $args.add( new VarDefinition( $ID2.text, $T2.t, $ID2.getLine(), $ID2.getCharPositionInLine()+1 ) ); })*)?')'(':'rt=type { $retType = $rt.t; })?'{' (vdefs=var_definition { $defs.addAll( $vdefs.list ); })* (stmt=statement { $stmts.addAll( $stmt.list ); })* '}' { $ast = new FuncDefinition( $ID.text, new FunctionType( $args, $retType ), $defs, $stmts, $ID.getLine(), $ID.getCharPositionInLine()+1 ); }
        ;

type returns [Type t] locals [List<RecordField> defs = new ArrayList<>();]:
      'int' { $t = IntType.get(); }
    | 'double' { $t = DoubleType.get(); }
    | 'char' { $t = CharType.get(); }
    | '['INT_CONSTANT']'type { $t = new ArrayType($type.t, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
    | 'struct' '{' (var_definition { for (Definition def : $var_definition.list) { if ($defs.stream().anyMatch( d -> d.name.equals(def.getName()) )) new ErrorType("duplicated field", def.getLine(), def.getColumn()); $defs.add( new RecordField(def.getName(), def.getType(), def.getLine(), def.getColumn() ) ); } })* '}' { $t = new RecordType( $defs ); }
    ;

expStmt returns [Statement ast]:
           left=expression '=' right=expression { $ast = new Assignment( $left.ast, $right.ast, $left.ast.getLine(), $left.ast.getColumn() ); }
         | expression OP=('++' | '--') { $ast = new AssignmentOperator( $expression.ast, $OP.text, $expression.ast.getLine(), $expression.ast.getColumn() ); }
         ;

statement returns [List<Statement> list = new ArrayList();] locals [List<Statement> stmts = new ArrayList<>();, List<Statement> elseStmts = new ArrayList<>();]:
           'print' exps=expressions ';' { $list.addAll( $exps.list.stream().map( e -> new Print( e, e.getLine(), e.getColumn()) ).toList() ); }
         | 'input' exps=expressions ';' { $list.addAll( $exps.list.stream().map( e -> new Input( e, e.getLine(), e.getColumn()) ).toList() ); }
         | 'if' '('expression')' (( '{' (stm=statement { $stmts.addAll( $stm.list ); })* '}') | (stm2=statement { $stmts.addAll( $stm2.list ); })) ('else' (('{' (stm3=statement { $elseStmts.addAll( $stm3.list ); })* '}') | (stm4=statement { $elseStmts.addAll( $stm4.list ); })))? { $list.add( new IfElse( $expression.ast, $stmts, $elseStmts, $expression.ast.getLine(), $expression.ast.getColumn() ) ); }
         | 'while' '('expression ')' (('{' (stm=statement { $stmts.addAll( $stm.list ); })* '}') | stm=statement { $stmts.addAll( $stm.list ); }) { $list.add( new While( $expression.ast, $stmts, $expression.ast.getLine(), $expression.ast.getColumn() ) ); }
         | 'for' '(' initialization=expStmt ';' condition=expression ';' increment=expStmt ')' (('{' (stm=statement { $stmts.addAll( $stm.list ); })* '}') | stm=statement { $stmts.addAll( $stm.list ); }) { $list.add( new For( $initialization.ast, $condition.ast, $increment.ast, $stmts, $expression.ast.getLine(), $expression.ast.getColumn() ) ); }
         | 'return' exp=expression ';' { $list.add( new Return( $exp.ast, $exp.ast.getLine(), $exp.ast.getColumn() ) ); }
         | func_call ';' { $list.add( $func_call.ast ); }
         | expStmt ';' { $list.add( $expStmt.ast ); }
         ;

func_call returns [Function ast] locals [List<Expression> exps = new ArrayList<>();]: IDENT '(' (expressions{ $exps.addAll( $expressions.list ); })? ')' { $ast = new Function( new Variable( $IDENT.text, $IDENT.getLine(), $IDENT.getCharPositionInLine()+1 ), $exps, $IDENT.getLine(), $IDENT.getCharPositionInLine()+1 ); };

expressions returns [List<Expression> list = new ArrayList<>();]: exp1=expression { $list.add($exp1.ast); } (',' exp2=expression { $list.add($exp2.ast); })*;

/* <asoc=right>expression ('*' | '/') expression */

expression returns [Expression ast]:
            func_call { $ast = $func_call.ast; }
          | '('exp=expression')' { $ast = $exp.ast; }
          | var=expression'[' index=expression ']' { $ast = new ArrayAccess( $var.ast, $index.ast, $var.ast.getLine(), $var.ast.getColumn()); }
          | exp=expression'.'IDENT { $ast = new FieldAccess( $exp.ast, $IDENT.text, $exp.ast.getLine(), $exp.ast.getColumn() ); }
          | '(' type ')'target=expression { $ast = new Cast( $target.ast, $type.t, $target.ast.getLine(), $target.ast.getColumn()); }
          | '-' exp=expression { $ast = new UnaryMinus( $exp.ast, $exp.ast.getLine(), $exp.ast.getColumn() ); }
          | '!' exp=expression { $ast = new Not( $exp.ast, $exp.ast.getLine(), $exp.ast.getColumn() ); }
          | left=expression OP=('*' | '/' | '%') right=expression { $ast = new Arithmetic( $left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn() ); }
          | left=expression OP=('+' | '-') right=expression { $ast = new Arithmetic( $left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn() ); }
          | left=expression OP=('>' | '>=' | '<' | '<=' | '!=' | '==') right=expression { $ast = new Comparison( $left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn() ); }
          | left=expression OP=('&&' | '||') right=expression { $ast = new LogicComparison( $left.ast, $OP.text, $right.ast, $left.ast.getLine(), $left.ast.getColumn() ); }
          | condition=expression '?' exp1=expression ':' exp2=expression { $ast = new Ternary( $condition.ast, $exp1.ast, $exp2.ast, $condition.ast.getLine(), $condition.ast.getColumn() ); }
          | INT_CONSTANT { $ast = new IntLiteral( LexerHelper.lexemeToInt($INT_CONSTANT.text), $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1 ); }
          | REAL_CONSTANT { $ast = new RealLiteral( LexerHelper.lexemeToReal($REAL_CONSTANT.text), $REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1 ); }
          | CHAR_CONSTANT { $ast = new CharLiteral( LexerHelper.lexemeToChar($CHAR_CONSTANT.text), $CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1 ); }
          | IDENT { $ast = new Variable( $IDENT.text, $IDENT.getLine(), $IDENT.getCharPositionInLine()+1 ); }
          ;



/*** LEXICO ***/

fragment
LETRA: [a-zA-Z];
fragment
NUMERO: [0-9];
fragment
EXPONENTE: ('E'|'e')('-'|'+')?INT_CONSTANT;
fragment
COMENTARIO: ('#' .*? ('\n' | EOF)) | ('"""'.*?'"""');

TRASH: ([\n\t\r ] | COMENTARIO) -> skip;

INT_CONSTANT: [1-9]NUMERO* | '0';

REAL_CONSTANT: INT_CONSTANT?(('.'INT_CONSTANT? EXPONENTE?) | EXPONENTE);

CHAR_CONSTANT: '\''( . | '\\'NUMERO NUMERO? NUMERO? | '\\n' | '\\t')'\'';

IDENT: (LETRA | '_')(LETRA|NUMERO|'_')*;