package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class While extends AbstractASTNode implements Statement {
  
  public Expression condition;
  public List<Statement> body;

  public While(Expression condition, List<Statement> body, int line, int column) {
    super( line, column );
    this.condition = condition;
    this.body = body;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

}
