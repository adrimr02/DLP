package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public interface Visitor<PT, RT> {

    RT visit(Program program, PT param);
    RT visit(FuncDefinition def, PT param);
    RT visit(VarDefinition def, PT param);

    /*
     * Statements
     */
    RT visit(Assignment stmt, PT param);
    RT visit(AssignmentOperator stmt, PT param);
    RT visit(Function stmt, PT param);
    RT visit(IfElse stmt, PT param);
    RT visit(While stmt, PT param);
    RT visit(For stmt, PT param);
    RT visit(Input stmt, PT param);
    RT visit(Print stmt, PT param);
    RT visit(Return stmt, PT param);

    /*
     * Expressions
     */

    RT visit(Ternary exp, PT param);
    RT visit(Arithmetic exp, PT param);
    RT visit(Comparison exp, PT param);
    RT visit(LogicComparison exp, PT param);
    RT visit(UnaryMinus exp, PT param);
    RT visit(Not exp, PT param);
    RT visit(Cast exp, PT param);
    RT visit(ArrayAccess exp, PT param);
    RT visit(FieldAccess exp, PT param);
    RT visit(IntLiteral exp, PT param);
    RT visit(RealLiteral exp, PT param);
    RT visit(CharLiteral exp, PT param);
    RT visit(Variable exp, PT param);

    /*
     * Types
     */

    RT visit(IntType t, PT param);
    RT visit(DoubleType t, PT param);
    RT visit(CharType t, PT param);
    RT visit(VoidType t, PT param);
    RT visit(ArrayType t, PT param);
    RT visit(RecordType t, PT param);
    RT visit(RecordField t, PT param);
    RT visit(FunctionType t, PT param);
    RT visit(ErrorType t, PT param);


}
