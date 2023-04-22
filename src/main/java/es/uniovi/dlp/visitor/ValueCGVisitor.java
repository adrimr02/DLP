package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.util.CodeGenerator;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private final AddressCGVisitor av;

    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor av) {
        super( cg );
        this.av = av;
    }

    @Override
    public Void visit(Arithmetic exp, Void param) {
        exp.left.accept(this, param);
        exp.right.accept(this, param);
        switch (exp.operator) {
            case "+" -> cg.add(exp.type.getSuffix());
            case "-" -> cg.sub(exp.type.getSuffix());
            case "*" -> cg.mul(exp.type.getSuffix());
            case "/" -> cg.div(exp.type.getSuffix());
            case "%" -> cg.mod(exp.type.getSuffix());
        }

        return null;
    }

    @Override
    public Void visit(Comparison exp, Void param) {
        exp.left.accept(this, param);
        exp.right.accept(this, param);
        switch (exp.operator) {
            case "<" -> cg.lt(exp.type.getSuffix());
            case "<=" -> cg.le(exp.type.getSuffix());
            case "==" -> cg.eq(exp.type.getSuffix());
            case ">=" -> cg.ge(exp.type.getSuffix());
            case ">" -> cg.gt(exp.type.getSuffix());
            case "!=" -> cg.ne(exp.type.getSuffix());
        }

        return null;
    }

    @Override
    public Void visit(LogicComparison exp, Void param) {
        exp.left.accept(this, param);
        exp.right.accept(this, param);
        switch (exp.operator) {
            case "&&" -> cg.and();
            case "||" -> cg.or();
        }

        return null;
    }

    @Override
    public Void visit(UnaryMinus exp, Void param) {
        if (exp.type instanceof DoubleType)
            cg.pushf(0.0);
        else
            cg.pushi(0);

        exp.target.accept(this, param);
        cg.sub(exp.type.getSuffix());

        return null;
    }

    @Override
    public Void visit(Not exp, Void param) {
        exp.target.accept(this, param);
        cg.not();
        return null;
    }

    @Override
    public Void visit(Cast exp, Void param) {
        exp.target.accept(this, param);
        if (exp.target.getType() instanceof CharType && exp.type instanceof DoubleType
                || exp.target.getType() instanceof DoubleType && exp.type instanceof CharType) {
            cg.cast(exp.target.getType().getSuffix(), 'i');
            cg.cast('i', exp.type.getSuffix());
        } else {
            cg.cast(exp.target.getType().getSuffix(), exp.type.getSuffix());
        }

        return null;
    }

    @Override
    public Void visit(IntLiteral exp, Void param) {
        cg.pushi(exp.value);

        return null;
    }

    @Override
    public Void visit(RealLiteral exp, Void param) {
        cg.pushf(exp.value);

        return null;
    }

    @Override
    public Void visit(CharLiteral exp, Void param) {
        cg.pushb(exp.value);

        return null;
    }

    @Override
    public Void visit(Variable exp, Void param) {

        exp.accept(this.av, param);
        cg.load(exp.type.getSuffix());

        return null;
    }
}
