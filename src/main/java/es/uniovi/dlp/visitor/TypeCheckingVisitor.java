package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void>{

    /*
     * Definitions
     */

    @Override
    public Void visit(FuncDefinition fDef, Type param) {
        fDef.type.accept( this, param );

        for (var def : fDef.defs)
            def.accept( this, param );

        for (var def : fDef.statements)
            def.accept( this, ((FunctionType) fDef.type).returnType );

        return null;
    }
    /*
     * Statements
     */

    @Override
    public Void visit(Assignment stmt, Type param) {
        stmt.left.accept( this, param );
        stmt.right.accept( this, param );
        if (!stmt.left.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        if (!stmt.right.getType().equals( stmt.left.getType() ) && (!(stmt.right.getType() instanceof ErrorType) && !(stmt.left.getType() instanceof ErrorType)))
            new ErrorType( incompatibleTypesError(stmt.left.getType(), stmt.right.getType()), stmt.getLine(), stmt.getColumn() );

        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Type param) {
        super.visit( ifElse, param );
        ifElse.condition.getType().asLogical( ifElse );
        return null;
    }

    @Override
    public Void visit(While whileStmt, Type param) {
        super.visit( whileStmt, param );
        whileStmt.condition.getType().asLogical( whileStmt );
        return null;
    }

    @Override
    public Void visit(Input stmt, Type param) {
        stmt.expression.accept( this, param );
        if (!stmt.expression.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        stmt.expression.getType().asBuiltInType( stmt );

        return null;
    }

    @Override
    public Void visit(Print stmt, Type param) {
        stmt.expression.accept( this, param );
        stmt.expression.getType().asBuiltInType( stmt );
        return null;
    }

    @Override
    public Void visit(Return stmt, Type param) {
        stmt.returnValue.accept( this, param );
        if (!stmt.returnValue.getType().equals( param ))
            new ErrorType( incompatibleTypesError( param, stmt.returnValue.getType() ), stmt.getLine(), stmt.getColumn() );
        return null;
    }

    /*
     * Expressions
     */

    @Override
    public Void visit(Function stmt, Type param) {
        stmt.var.accept( this, param );
        List<Type> paramTypes = new ArrayList<>();

        for (var p : stmt.params) {
            p.accept( this, param );
            paramTypes.add( p.getType() );
        }
        stmt.setIsLValue( false );

        stmt.setType( stmt.var.type.parenthesis( paramTypes, stmt ) );
        return null;
    }

    @Override
    public Void visit(Arithmetic exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().arithmetic( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Void visit(Comparison exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().comparison( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Void visit(LogicComparison exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().logic( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Void visit(UnaryMinus exp, Type param) {
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().arithmetic( exp ) );
        return null;
    }

    @Override
    public Void visit(Not exp, Type param) {
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().logic( exp ) );
        return null;
    }

    @Override
    public Void visit(Cast exp, Type param) {
        exp.target.accept( this, param );
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().canBeCastTo( exp.newType, exp ) );
        return null;
    }

    @Override
    public Void visit(ArrayAccess exp, Type param) {
        exp.variable.accept( this, param );
        exp.index.accept( this, param );
        exp.setIsLValue( true );
        exp.setType( exp.variable.getType().squareBrackets( exp.index.getType(), exp) );
        return null;
    }

    @Override
    public Void visit(FieldAccess exp, Type param) {
        exp.field.accept( this, param );
        exp.setIsLValue( true );
        exp.setType( exp.field.getType().dot( exp.name, exp ) );
        return null;
    }

    @Override
    public Void visit(IntLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( IntType.get() );
        return null;
    }

    @Override
    public Void visit(RealLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( DoubleType.get() );
        return null;
    }

    @Override
    public Void visit(CharLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( CharType.get() );
        return null;
    }

    @Override
    public Void visit(Variable exp, Type param) {
        exp.setIsLValue( true );
        exp.setType( exp.definition.getType() );
        return null;
    }

    /*
     * Types
     */

    @Override
    public Void visit(FunctionType t, Type param) {
        for (var arg : t.arguments) {
            arg.accept( this, param );
            arg.type.asBuiltInType( t );
        }
        t.returnType.accept( this, param );

        return null;
    }


    private String incompatibleTypesError(Type expected, Type found) {
        return "Incompatible types. Required '" + expected + "', found '" + found + "'";
    }
}
