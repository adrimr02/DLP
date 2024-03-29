package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Boolean>{

    /*
     * Definitions
     */

    @Override
    public Boolean visit(FuncDefinition fDef, Type param) {
        fDef.type.accept( this, param );

        boolean hasReturn = false;

        for (var def : fDef.definitions)
            def.accept( this, param );

        for (var stmt : fDef.statements)
            hasReturn = hasReturn || stmt.accept( this, ((FunctionType) fDef.type).returnType );

        if (!hasReturn && !(((FunctionType) fDef.type).returnType instanceof VoidType))
            new ErrorType("Missing return statement", fDef.getLine(), fDef.getColumn());

        return null;
    }
    /*
     * Statements
     */

    @Override
    public Boolean visit(Assignment stmt, Type param) {
        stmt.left.accept( this, param );
        stmt.right.accept( this, param );
        if (!stmt.left.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        stmt.left.setType( stmt.right.getType().promotesTo( stmt.left.getType(), stmt ) );

        stmt.right.getType().asBuiltInType( stmt );

        return false;
    }

    @Override
    public Boolean visit(IfElse ifElse, Type param) {
        ifElse.condition.accept( this, param );

        boolean ifHasReturn = false;
        boolean elseHasReturn = false;

        for (var stmt : ifElse.ifBody)
            ifHasReturn = ifHasReturn || stmt.accept( this, param );

        for (var stmt : ifElse.elseBody)
            elseHasReturn = elseHasReturn || stmt.accept( this, param );
        ifElse.condition.getType().asLogical( ifElse );

        return ifHasReturn && elseHasReturn;
    }

    @Override
    public Boolean visit(While whileStmt, Type param) {
        whileStmt.condition.accept( this, param );

        boolean hasReturn = false;

        for (var stmt : whileStmt.body)
            hasReturn = hasReturn || stmt.accept( this, param );

        whileStmt.condition.getType().asLogical( whileStmt );

        return hasReturn;
    }

    @Override
    public Boolean visit(Input stmt, Type param) {
        stmt.expression.accept( this, param );
        if (!stmt.expression.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        stmt.expression.getType().asBuiltInType( stmt );

        return false;
    }

    @Override
    public Boolean visit(Print stmt, Type param) {
        stmt.expression.accept( this, param );
        stmt.expression.getType().asBuiltInType( stmt );

        return false;
    }

    @Override
    public Boolean visit(Return stmt, Type param) {
        stmt.returnValue.accept( this, param );

        stmt.returnValue.getType().promotesTo( param, stmt );

        return true;
    }

    /*
     * Expressions
     */

    @Override
    public Boolean visit(Function stmt, Type param) {
        stmt.var.accept( this, param );
        List<Type> paramTypes = new ArrayList<>();

        for (var p : stmt.arguments) {
            p.accept( this, param );
            paramTypes.add( p.getType() );
        }

        stmt.setIsLValue( false );

        stmt.setType( stmt.var.type.parenthesis( paramTypes, stmt ) );
        return false;
    }

    @Override
    public Boolean visit(Arithmetic exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().arithmetic( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Boolean visit(Comparison exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().comparison( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Boolean visit(LogicComparison exp, Type param) {
        exp.left.accept( this, param );
        exp.right.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.left.getType().logic( exp.right.getType(), exp ) );
        return null;
    }

    @Override
    public Boolean visit(UnaryMinus exp, Type param) {
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().arithmetic( exp ) );
        return null;
    }

    @Override
    public Boolean visit(Not exp, Type param) {
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().logic( exp ) );
        return null;
    }

    @Override
    public Boolean visit(Cast exp, Type param) {
        exp.target.accept( this, param );
        exp.target.accept( this, param );
        exp.setIsLValue( false );
        exp.setType( exp.target.getType().canBeCastTo( exp.newType, exp ) );
        return null;
    }

    @Override
    public Boolean visit(ArrayAccess exp, Type param) {
        exp.variable.accept( this, param );
        exp.index.accept( this, param );
        exp.setIsLValue( true );
        exp.setType( exp.variable.getType().squareBrackets( exp.index.getType(), exp) );
        return null;
    }

    @Override
    public Boolean visit(FieldAccess exp, Type param) {
        exp.field.accept( this, param );
        exp.setIsLValue( true );
        exp.setType( exp.field.getType().dot( exp.name, exp ) );
        return null;
    }

    @Override
    public Boolean visit(IntLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( IntType.get() );
        return null;
    }

    @Override
    public Boolean visit(RealLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( DoubleType.get() );
        return null;
    }

    @Override
    public Boolean visit(CharLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( CharType.get() );
        return null;
    }

    @Override
    public Boolean visit(Variable exp, Type param) {
        exp.setIsLValue( true );
        exp.setType( exp.definition.getType() );
        return null;
    }

    /*
     * Types
     */

    @Override
    public Boolean visit(FunctionType t, Type param) {
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
