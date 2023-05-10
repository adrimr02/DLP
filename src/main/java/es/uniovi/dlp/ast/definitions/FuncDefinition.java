package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

  public List<VarDefinition> defs;
  public List<Statement> statements;
  public int bytesLocalsSum;

  public FuncDefinition(String name, FunctionType type, List<VarDefinition> defs, List<Statement> statements, int line, int column) {
    super( type, name, line, column );
    this.defs = defs;
    this.statements = statements;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }

}
