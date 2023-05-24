package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.definitions.FuncDefinition;
import es.uniovi.dlp.ast.definitions.TypeDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.statements.For;
import es.uniovi.dlp.ast.statements.IfElse;
import es.uniovi.dlp.ast.statements.While;
import es.uniovi.dlp.ast.types.CustomType;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.symboltable.SymbolTable;
import es.uniovi.dlp.symboltable.TypesSymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    private final SymbolTable symbolTable = new SymbolTable();

    private final TypesSymbolTable typesTable = new TypesSymbolTable();

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

    public Void visit(TypeDefinition def, Void param) {
        if (!typesTable.insert(def))
            new ErrorType("Repeated type", def.getLine(), def.getColumn());
        return super.visit(def, param);
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {

        ifElse.condition.accept( this, param );
        symbolTable.set();
        for (var stmt : ifElse.ifBody)
            stmt.accept( this, param );
        symbolTable.reset();

        symbolTable.set();
        for (var stmt : ifElse.elseBody)
            stmt.accept( this, param );
        symbolTable.reset();

        return null;
    }

    @Override
    public Void visit(While whileStmt, Void param) {
        symbolTable.set();
        var r = super.visit( whileStmt, param );
        symbolTable.reset();
        return r;
    }

    @Override
    public Void visit(For forStmt, Void param) {
        symbolTable.set();
        var r = super.visit( forStmt, param );
        symbolTable.reset();
        return r;
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

    public Void visit(CustomType ctype, Void param) {
        var def = typesTable.find(ctype.name);
        if (def == null) {
            var type = new ErrorType( "Unknown type " + ctype.name, ctype.getLine(), ctype.getColumn() );
            ctype.setDefinition( new TypeDefinition( type, ctype.name, ctype.getLine(), ctype.getColumn() ) );
        } else {
            ctype.setDefinition( def );
        }
        return null;
    }

}
