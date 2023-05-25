package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
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

        for (var stmt : fDef.statements)
            hasReturn = hasReturn || stmt.accept( this, ((FunctionType) fDef.type).returnType );

        if (!hasReturn && !(((FunctionType) fDef.type).returnType instanceof VoidType))
            new ErrorType("Missing return statement", fDef.getLine(), fDef.getColumn());

        return null;
    }

    @Override
    public Boolean visit(VarDefinition def, Type param) {
        super.visit(def, param);
        return false;
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
    public Boolean visit(UnaryOperator stmt, Type param) {
        stmt.target.accept( this, param );
        if (!stmt.target.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        stmt.target.getType().asNumerical( stmt );

        return false;
    }

    @Override
    public Boolean visit(AssignmentOperator stmt, Type param) {
        stmt.left.accept( this, param );
        stmt.right.accept( this, param );
        if (!stmt.left.getIsLValue())
            new ErrorType("Variable expected", stmt.getLine(), stmt.getColumn());

        stmt.left.getType().asNumerical( stmt.right.getType(), stmt );

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
    public Boolean visit(For forStmt, Type param) {
        forStmt.initialization.accept( this, param );
        forStmt.condition.accept( this, param );
        forStmt.increment.accept( this, param );

        boolean hasReturn = false;

        for (var stmt : forStmt.body)
            hasReturn = hasReturn || stmt.accept( this, param );

        forStmt.condition.getType().asLogical( forStmt );

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
        if (stmt.returnValue != null) {
            stmt.returnValue.accept(this, param);
            stmt.returnValue.getType().promotesTo(param, stmt);
        } else {
            if (!(param instanceof VoidType))
                new ErrorType("Missing return value", stmt.getLine(), stmt.getColumn());
        }
        return true;
    }

    /*
     * Expressions
     */

    @Override
    public Boolean visit(Function stmt, Type param) {
        stmt.var.accept( this, param );
        List<Type> paramTypes = new ArrayList<>();

        for (var p : stmt.params) {
            p.accept( this, param );
            paramTypes.add( p.getType() );
        }

        stmt.setIsLValue( false );

        stmt.setType( stmt.var.getType().parenthesis( paramTypes, stmt ) );
        return false;
    }

    @Override
    public Boolean visit(Ternary exp, Type param) {
        exp.condition.accept( this, param );
        exp.trueExp.accept( this, param );
        exp.falseExp.accept( this, param );
        exp.setIsLValue( false );
        exp.condition.getType().asLogical( exp );
        exp.setType( exp.trueExp.getType().ternary( exp.falseExp.getType(), exp ) );
        return null;
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
        exp.setType( IntType.getInstance() );
        return null;
    }

    @Override
    public Boolean visit(RealLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( DoubleType.getInstance() );
        return null;
    }

    @Override
    public Boolean visit(CharLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( CharType.getInstance() );
        return null;
    }

    @Override
    public Boolean visit(BoolLiteral exp, Type param) {
        exp.setIsLValue( false );
        exp.setType( BoolType.getInstance() );
        return null;
    }

    @Override
    public Boolean visit(Variable exp, Type param) {
        exp.setIsLValue( true );
        if (exp.definition.getType() instanceof CustomType)
            exp.setType( ((CustomType) exp.definition.getType()).type );
        else
            exp.setType( exp.definition.getType() );
        return null;
    }

    /*
     * Types
     */

    @Override
    public Boolean visit(CustomType t, Type param) {
        t.setType( t.def.type );
        return super.visit(t, param);
    }

}
