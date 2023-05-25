package es.uniovi.dlp.visitor;

import com.sun.jdi.DoubleType;
import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Function;
import es.uniovi.dlp.ast.statements.IfElse;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.util.CodeGenerator;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private final AddressCGVisitor av;

    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor av) {
        super( cg );
        this.av = av;
    }

    @Override
    public Void visit(Ternary exp, Void param) {
        int labels = cg.getLabels(2);
        int elseL = labels + 1;
        int endL = labels + 2;

        exp.condition.accept( this, param );
        cg.jz("label"+elseL);

        exp.trueExp.accept( this, param );
        cg.jump( "label"+endL );

        cg.label( "label"+elseL );
        exp.falseExp.accept( this, param );

        cg.label( "label"+endL );
        return null;
    }

    @Override
    public Void visit(Arithmetic exp, Void param) {
        exp.left.accept(this, param);
        if (exp.left.getType() instanceof CharType)
            cg.convert( exp.left.getType(), IntType.getInstance() );

        exp.right.accept(this, param);
        if (exp.right.getType() instanceof CharType)
            cg.convert( exp.right.getType(), IntType.getInstance() );

        switch (exp.operator) {
            case "+" -> cg.add(exp.getType().getSuffix());
            case "-" -> cg.sub(exp.getType().getSuffix());
            case "*" -> cg.mul(exp.getType().getSuffix());
            case "/" -> cg.div(exp.getType().getSuffix());
            case "%" -> cg.mod(exp.getType().getSuffix());
        }

        return null;
    }

    @Override
    public Void visit(Comparison exp, Void param) {
        exp.left.accept(this, param);
        exp.right.accept(this, param);

        switch (exp.operator) {
            case "<" -> cg.lt(exp.getType().getSuffix());
            case "<=" -> cg.le(exp.getType().getSuffix());
            case "==" -> cg.eq(exp.getType().getSuffix());
            case ">=" -> cg.ge(exp.getType().getSuffix());
            case ">" -> cg.gt(exp.getType().getSuffix());
            case "!=" -> cg.ne(exp.getType().getSuffix());
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
        if (exp.getType() instanceof DoubleType)
            cg.pushf(0.0);
        else
            cg.pushi(0);

        exp.target.accept(this, param);
        cg.sub(exp.getType().getSuffix());

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
        cg.convert(exp.target.getType(), exp.getType());

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
    public Void visit(BoolLiteral exp, Void param) {
        cg.pushi(exp.value ? 1 : 0);

        return null;
    }

    @Override
    public Void visit(Variable exp, Void param) {

        exp.accept(this.av, param);
        cg.load(exp.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(ArrayAccess exp, Void param) {
        exp.accept(this.av, param);
        cg.load(exp.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(FieldAccess exp, Void param) {
        exp.accept(this.av, param);
        cg.load(exp.getType().getSuffix());

        return null;
    }

    @Override
    public Void visit(Function stmt, Void param) {
        for (var arg : stmt.params) {
            if (arg instanceof Variable && ((VarDefinition)((Variable) arg).definition).type.isReferenced())
                arg.accept(av, param);
            else
                arg.accept( this, param );
        }
        cg.call( stmt.var.name );
        return null;
    }
}
