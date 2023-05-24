package es.uniovi.dlp.symboltable;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.TypeDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypesSymbolTable {

    private Map<String, TypeDefinition> table;
    public TypesSymbolTable()  {
        table = new HashMap<>();
    }


    /**
     * Adds a new type definition
     * @param definition Definition of the custom type
     * @return true if inserted or false if previously defined
     */
    public boolean insert(TypeDefinition definition) {
        if (table.get( definition.getName() ) != null)
            return false;

        table.put( definition.getName(), definition );
        definition.setScope( 0 );
        return true;
    }

    /**
     *
     * @param id Id of the custom type
     * @return Definition if exists or null
     */
    public TypeDefinition find(String id) {
        return table.get(id);
    }

}
