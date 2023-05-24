package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

public class Ternary extends AbstractASTNode implements Expression {

    public Expression condition;
    public Expression trueExp;
    public Expression falseExp;

    public boolean isLValue;
    private Type type;

    public Ternary(Expression condition, Expression trueExp, Expression falseExp, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.trueExp = trueExp;
        this.falseExp = falseExp;
    }

    @Override
    public boolean getIsLValue() {
        return isLValue;
    }

    @Override
    public void setIsLValue(boolean isLValue) {
        this.isLValue = isLValue;
    }

    @Override
    public Type getType() {
        return type.get();
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }
}
