package es.uniovi.dlp.symboltable;



public class SymbolTableTest {
		
	public void testInsert() {
		es.uniovi.dlp.symboltable.SymbolTable st = new es.uniovi.dlp.symboltable.SymbolTable();

		es.uniovi.dlp.ast.definitions.VarDefinition definition = new es.uniovi.dlp.ast.definitions.VarDefinition( "a", null, 0, 0 );
		assert st.insert(definition);
		assert definition.getScope()==0;
		assert !st.insert(definition);
		st.set();
		es.uniovi.dlp.ast.definitions.VarDefinition definition2 = new es.uniovi.dlp.ast.definitions.VarDefinition("a", null, 0, 0 );
		assert st.insert(definition2);
		assert definition2.getScope()==1;
		assert !st.insert(definition2);
		st.reset();
		assert !st.insert(definition);
	}
	
	public void testFind() {
		es.uniovi.dlp.symboltable.SymbolTable st = new es.uniovi.dlp.symboltable.SymbolTable();
		es.uniovi.dlp.ast.definitions.VarDefinition varDefinition = new es.uniovi.dlp.ast.definitions.VarDefinition( "a", null, 0, 0 );
		assert st.insert(varDefinition);
		assert st.find("a")!=null;
		assert st.find("b")==null;
		st.set();
		es.uniovi.dlp.ast.definitions.VarDefinition varDefinition2 = new es.uniovi.dlp.ast.definitions.VarDefinition( "b", null, 0, 0 );
		assert st.insert(varDefinition2);
		assert st.find("b")!=null;
		assert st.find("a")!=null;
		assert st.find("c")==null;
		st.reset();
		assert st.find("a")!=null;
		assert st.find("b")==null;
	}

	public void testFindInCurrentScope() {
		es.uniovi.dlp.symboltable.SymbolTable st = new es.uniovi.dlp.symboltable.SymbolTable();
		es.uniovi.dlp.ast.definitions.VarDefinition varDefinition = new es.uniovi.dlp.ast.definitions.VarDefinition( "a", null, 0, 0 );
		assert st.insert(varDefinition);
		assert st.findInCurrentScope("a")!=null;
		assert st.findInCurrentScope("b")==null;
		st.set();
		es.uniovi.dlp.ast.definitions.VarDefinition varDefinition2 = new es.uniovi.dlp.ast.definitions.VarDefinition( "b", null, 0, 0 );
		assert st.insert(varDefinition2);
		assert st.findInCurrentScope("b")!=null;
		assert st.findInCurrentScope("a")==null;
		assert st.findInCurrentScope("c")==null;
		st.reset();
		assert st.findInCurrentScope("a")!=null;
		assert st.findInCurrentScope("b")==null;		
	}
	
	public static void main(String[] args) {
		SymbolTableTest test = new SymbolTableTest();
		test.testInsert();
		test.testFind();
		test.testFindInCurrentScope();
	}
	
}
