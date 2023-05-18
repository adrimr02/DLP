package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.util.CodeGenerator;

public abstract class AbstractCGVisitor<PT, RT> implements Visitor<PT, RT> {

    protected CodeGenerator cg;

    public AbstractCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    @Override
    public RT visit(Program program, PT param) {
        throw new IllegalStateException("\"Undefined template visitProgram for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    /*
     * Statements
     */

    @Override
    public RT visit(FuncDefinition fDef, PT param) {
        throw new IllegalStateException("\"Undefined template visitFuncDefinition for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(VarDefinition def, PT param) {
        throw new IllegalStateException("\"Undefined template visitVarDefinition for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Assignment stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitAssignment for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(UnaryOperator stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitUnaryOperator for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(AssignmentOperator stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitAssignmentOperator for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Function stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitFunction for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(IfElse ifElse, PT param) {
        throw new IllegalStateException("\"Undefined template visitIfElse for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(While whileStmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitWhile for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(For whileStmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitFor for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Input stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitInput for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Print stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitPrint for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Return stmt, PT param) {
        throw new IllegalStateException("\"Undefined template visitReturn for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    /*
     * Expressions
     */

    @Override
    public RT visit(Ternary exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitTernary for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Arithmetic exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitArithmetic for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Comparison exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitComparison for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(LogicComparison exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitLogicComparison for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(UnaryMinus exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitUnaryMinus for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Not exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitNot for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Cast exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitCast for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(ArrayAccess exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitArrayAccess for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(FieldAccess exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitFieldAccess for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(IntLiteral exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitIntLiteral for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(RealLiteral exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitRealLiteral for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(CharLiteral exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitCharLiteral for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(BoolLiteral exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitBoolLiteral for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(Variable exp, PT param) {
        throw new IllegalStateException("\"Undefined template visitVariable for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    /*
     * Types
     */

    @Override
    public RT visit(IntType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitIntType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(DoubleType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitDoubleType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(CharType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitCharType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(BoolType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitBoolType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(VoidType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitVoidType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(ArrayType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitArrayType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(RecordType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitRecordType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(RecordField t, PT param) {
        throw new IllegalStateException("\"Undefined template visitRecordField for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(FunctionType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitFunctionType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

    @Override
    public RT visit(ErrorType t, PT param) {
        throw new IllegalStateException("\"Undefined template visitErrorType for " +
                "the code function \"" + this.getClass().getName() + "\"");
    }

}
