package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class Function extends AbstractASTNode implements Statement, Expression {

  public List<Expression> arguments;
  public Variable var;
  public boolean isLValue;
  public Type type;

  public Function(Variable var, List<Expression> params, int line, int column) {
    super( line, column );
    this.var = var;
    this.arguments = params;
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
    return type;
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
