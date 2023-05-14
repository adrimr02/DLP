package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class For extends AbstractASTNode implements Statement {

    public Statement initialization;
    public Expression condition;
    public Statement increment;
    public List<Statement> body;

    public For(Statement initialization, Expression condition, Statement increment, List<Statement> body, int line, int column) {
        super(line, column);
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    @Override
    public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
        return v.visit( this, param );
    }
}
