package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class AssignmentOperator extends AbstractASTNode implements Statement {

    public Expression target;
    public String operator;

    public AssignmentOperator(Expression target, String operator, int line, int column) {
        super(line, column);
        this.target = target;
        this.operator = operator;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }
}
