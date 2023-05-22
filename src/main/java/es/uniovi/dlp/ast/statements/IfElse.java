package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class IfElse extends AbstractASTNode implements Statement {
  
  public Expression condition;
  public List<Statement> ifBody;
  public List<Statement> elseBody;

  public int ifBytesLocalsSum;
  public int elseBytesLocalsSum;

  public IfElse(Expression condition, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {
    super( line, column );
    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

}
