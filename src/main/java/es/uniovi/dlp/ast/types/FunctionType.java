package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;
import java.util.Objects;

public class FunctionType extends AbstractType {

    public List<VarDefinition> arguments;
    public Type returnType;
    public int bytesParamsSum;

    public FunctionType(List<VarDefinition> arguments, Type returnType) {
        this.arguments = arguments;
        this.returnType = returnType;
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode astNode) {
        if (types.size() < arguments.size())
            return new ErrorType( "Missing arguments in function", astNode.getLine(), astNode.getColumn() );
        if (types.size() > arguments.size())
            return new ErrorType( "Too many arguments in function", astNode.getLine(), astNode.getColumn() );

        for (int i = 0; i < types.size(); i++) {
            if (!types.get( i ).equals(arguments.get( i ).type))
                return new ErrorType( "Invalid type of argument in position '"+i+"'." +
                        " Expected '"+arguments.get( i ).type+"' and found '"+types.get( i )+"'",
                        astNode.getLine(), astNode.getColumn() );
        }

        return returnType;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }

    @Override
    public String toString() {
        StringBuilder args = new StringBuilder();
        for (var arg : arguments)
            args.append( ", " ).append( arg.type );

        if (arguments.size() >= 1)
            args.delete( 0, 2 );

        return "Function(" + args + "): " + returnType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionType that = (FunctionType) o;
        return Objects.equals(arguments, that.arguments) && Objects.equals(returnType, that.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, returnType);
    }
}
