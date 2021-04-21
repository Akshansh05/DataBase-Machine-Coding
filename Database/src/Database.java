import java.util.Date;
import java.util.HashMap;

public class Database {
	private String databaseName;
	private HashMap<String,Table>tableMap;
	private Date createdAt;
	
	public Database(String databaseName) {
		databaseName = databaseName;
		tableMap = new HashMap<String,Table>();
		this.createdAt = new Date();
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		databaseName = databaseName;
	}

	public HashMap<String, Table> getTableMap() {
		return tableMap;
	}

	public void setTableMap(HashMap<String, Table> tableMap) {
		tableMap = tableMap;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Table createTable(String tableName) {
		if(tableMap.containsKey(tableName)) {
			System.out.println("Table already exists");
			return tableMap.get(tableName);
		}else {
			Table table = new Table(tableName);
			tableMap.put(tableName,table);
			System.out.println("Table created Successfully");
			return  tableMap.get(tableName);
		}
		
	}
	
	public void deleteTable(String tableName) {
		if(tableMap.containsKey(tableName)) {
			tableMap.remove(tableName);
			System.out.println("table removed Successfully");
		}else {
			System.out.println("No such table found");
		}
	}
	
	public void updatTableName(String tableName,String finalName) {
		if(!tableMap.containsKey(tableName)) {
			System.out.println(tableName+ " No such table found");
		}
		if(tableMap.containsKey(finalName)) {
			System.out.println(finalName +" table name already exists");
		}
		Table table  = tableMap.get(tableName);
		tableMap.remove(tableName);
		tableMap.put(finalName, table);
	}

}
