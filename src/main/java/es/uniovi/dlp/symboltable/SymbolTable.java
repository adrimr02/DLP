package es.uniovi.dlp.symboltable;

import es.uniovi.dlp.ast.definitions.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
	
	private int scope = 0;
	private List<Map<String, Definition>> table;
	public SymbolTable()  {
		table = new ArrayList<>();
		table.add( new HashMap<>() );
	}

	/**
	 * Suma uno al scope y añade un nuevo map al final de la lista
	 */
	public void set() {
		scope++;
		table.add( new HashMap<>() );
	}

	/**
	 * Resta uno al scope y elimina el ultimo map de la lista
	 */
	public void reset() {
		table.remove(table.size() - 1);
		scope--;
	}

	/**
	 * Añade una nueva definicion en el scope actual
	 * @param definition
	 * @return true si se ha insertado, false si ya estaba insertado
	 */
	public boolean insert(Definition definition) {
		if (table.get( scope ).get( definition.getName() ) != null)
			return false;

		table.get( scope ).put( definition.getName(), definition );
		definition.setScope( scope );
		return true;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	public Definition find(String id) {
		Definition def;
		int currentScope = scope;
		do {
			def = table.get( currentScope ).get( id );
			currentScope--;
		} while (def == null && currentScope >= 0);
		return def;
	}

	/**
	 * <strong>Solo para pruebas</strong>
	 * @param id
	 * @return
	 */
	public Definition findInCurrentScope(String id) {
		return table.get( scope ).get( id );
	}
}
