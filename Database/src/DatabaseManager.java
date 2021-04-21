import java.util.HashMap;

public class DatabaseManager {
	
	private HashMap<String,Database> databaseMap;
	
	
	public DatabaseManager() {
		databaseMap = new HashMap<String,Database>();
	}
	
	public Database createDatabase(String databaseName) {
		if(databaseMap.containsKey(databaseName)) {
			System.out.println("Database with this name already exists");
		}else {
			databaseMap.put(databaseName, new Database(databaseName));
			System.out.println("Database created successfully");
		}
		return databaseMap.get(databaseName);
	}
	
	public void deleteDatabase(String databaseName) {
		if(databaseMap.containsKey(databaseName)) {
				databaseMap.remove(databaseName);
		}else {
			System.out.println("No such Database Found");
		}
	}


	public HashMap<String, Database> getDatabaseMap() {
		return databaseMap;
	}

	public void setDatabaseMap(HashMap<String, Database> databaseMap) {
		this.databaseMap = databaseMap;
	}
	
	

}
