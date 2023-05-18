package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public abstract class AbstractVisitor<PT,RT> implements Visitor<PT,RT> {

    @Override
    public RT visit(Program program, PT param) {

        for (var def : program.definitions)
            def.accept( this, param );

        return null;
    }

    /*
     * Statements
     */

    @Override
    public RT visit(FuncDefinition fDef, PT param) {
        fDef.type.accept( this, param );

        for (var def : fDef.defs)
            def.accept( this, param );

        for (var def : fDef.statements)
            def.accept( this, param );

        return null;
    }

    @Override
    public RT visit(VarDefinition def, PT param) {
        def.type.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Assignment stmt, PT param) {
        stmt.left.accept( this, param );
        stmt.right.accept( this, param );
        return null;
    }

    @Override
    public RT visit(UnaryOperator stmt, PT param) {
        stmt.target.accept( this, param );
        return null;
    }

    @Override
    public RT visit(AssignmentOperator stmt, PT param) {
        stmt.left.accept( this, param );
        stmt.right.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Function stmt, PT param) {
        stmt.var.accept( this, param );

        for (var p : stmt.params)
            p.accept( this, param );

        return null;
    }

    @Override
    public RT visit(IfElse ifElse, PT param) {
        ifElse.condition.accept( this, param );
        for (var stmt : ifElse.ifBody)
            stmt.accept( this, param );

        for (var stmt : ifElse.elseBody)
            stmt.accept( this, param );

        return null;
    }

    @Override
    public RT visit(While whileStmt, PT param) {
        whileStmt.condition.accept( this, param );
        for (var stmt : whileStmt.body)
            stmt.accept( this, param );

        return null;
    }

    @Override
    public RT visit(For forStmt, PT param) {
        forStmt.initialization.accept( this, param );
        forStmt.condition.accept( this, param );
        forStmt.increment.accept( this, param );
        for (var stmt : forStmt.body)
            stmt.accept( this, param );

        return null;
    }

    @Override
    public RT visit(Input stmt, PT param) {
        stmt.expression.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Print stmt, PT param) {
        stmt.expression.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Return stmt, PT param) {
        if (stmt.returnValue != null)
            stmt.returnValue.accept( this, param );
        return null;
    }

    /*
     * Expressions
     */

    @Override
    public RT visit(Ternary exp, PT param) {
        exp.condition.accept( this, param );
        exp.trueExp.accept( this, param );
        exp.falseExp.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Arithmetic exp, PT param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Comparison exp, PT param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        return null;
    }

    @Override
    public RT visit(LogicComparison exp, PT param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        return null;
    }

    @Override
    public RT visit(UnaryMinus exp, PT param) {
        exp.target.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Not exp, PT param) {
        exp.target.accept( this, param );
        return null;
    }

    @Override
    public RT visit(Cast exp, PT param) {
        exp.newType.accept( this, param );
        exp.target.accept( this, param );
        return null;
    }

    @Override
    public RT visit(ArrayAccess exp, PT param) {
        exp.variable.accept( this, param );
        exp.index.accept( this, param );
        return null;
    }

    @Override
    public RT visit(FieldAccess exp, PT param) {
        exp.field.accept( this, param );
        return null;
    }

    @Override
    public RT visit(IntLiteral exp, PT param) {
        return null;
    }

    @Override
    public RT visit(RealLiteral exp, PT param) {
        return null;
    }

    @Override
    public RT visit(CharLiteral exp, PT param) {
        return null;
    }

    @Override
    public RT visit(BoolLiteral exp, PT param) {
        return null;
    }

    @Override
    public RT visit(Variable exp, PT param) {
        return null;
    }

    /*
     * Types
     */

    @Override
    public RT visit(IntType t, PT param) {
        return null;
    }

    @Override
    public RT visit(DoubleType t, PT param) {
        return null;
    }

    @Override
    public RT visit(CharType t, PT param) {
        return null;
    }

    @Override
    public RT visit(BoolType t, PT param) {
        return null;
    }

    @Override
    public RT visit(VoidType t, PT param) {
        return null;
    }

    @Override
    public RT visit(ArrayType t, PT param) {
        t.type.accept( this, param );
        return null;
    }

    @Override
    public RT visit(RecordType t, PT param) {
        for (var field : t.fields)
            field.accept( this, param );

        return null;
    }

    @Override
    public RT visit(RecordField t, PT param) {
        t.type.accept( this, param );
        return null;
    }

    @Override
    public RT visit(FunctionType t, PT param) {
        for (var arg : t.arguments)
            arg.accept( this, param );

        t.returnType.accept( this, param );

        return null;
    }

    @Override
    public RT visit(ErrorType t, PT param) {
        return null;
    }

}
