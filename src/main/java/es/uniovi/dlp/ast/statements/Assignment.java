package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Assignment extends AbstractASTNode implements Statement {

  public Expression left;
  public Expression right;

  public Assignment(Expression left, Expression right, int line, int column) {
    super(line, column);
    this.left = left;
    this.right = right;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }
  
}
