package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private final SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition fDef, Void param) {
        if (!symbolTable.insert( fDef ))
            new ErrorType( "Repeated variable "+fDef.getName(), fDef.getLine(), fDef.getColumn() );

        symbolTable.set();
        var r = super.visit( fDef, param );
        symbolTable.reset();
        return r;
    }

    @Override
    public Void visit(VarDefinition def, Void param) {
        if (!symbolTable.insert( def ))
            new ErrorType( "Repeated variable "+def.getName(), def.getLine(), def.getColumn() );
        return super.visit( def, param );
    }

    @Override
    public Void visit(Variable exp, Void param) {
        var def = symbolTable.find( exp.name );
        if (def == null) {
            var type = new ErrorType( "Unknown variable "+exp.name, exp.getLine(), exp.getColumn() );
            exp.setDefinition( new VarDefinition( exp.name, type, exp.getLine(), exp.getColumn() ) );
        } else {
            exp.setDefinition( def );
        }
        return super.visit( exp, param );
    }
}
