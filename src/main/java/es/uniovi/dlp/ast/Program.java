package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {
  
  public List<Definition> definitions;

  public Program(List<Definition> definitions) {
    super( 0, 0);
    this.definitions = definitions;
  }

  @Override
  public <PT, RT> RT accept(Visitor<PT, RT> v, PT param) {
    return v.visit( this, param );
  }
}
