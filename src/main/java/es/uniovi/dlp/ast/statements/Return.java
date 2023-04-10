package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Return extends AbstractASTNode implements Statement {

  public Expression returnValue;

  public Return(Expression value, int line, int column) {
    super(line, column);
    this.returnValue = value;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }
  
}
