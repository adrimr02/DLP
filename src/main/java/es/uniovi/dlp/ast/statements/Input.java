package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Input extends AbstractASTNode implements Statement {

  public Expression expression;

  public Input(Expression expression , int line, int column) {
    super(line, column);
    this.expression = expression;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }
  
}
