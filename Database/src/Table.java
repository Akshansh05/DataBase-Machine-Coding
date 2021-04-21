import java.util.Date;
import java.util.HashMap;

public class Table {
	private String tableName;
	private HashMap<String,Row> rows;
	private Date createdAt;
	
	public Table(String tableName) {
		this.tableName = tableName;
		this.rows = new HashMap<String,Row>();
		this.createdAt = new Date();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public HashMap<String, Row> getRows() {
		return rows;
	}

	public void setRows(HashMap<String, Row> rows) {
		this.rows = rows;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public void insertEntry(String rowId,HashMap<String, String> columnMap) {
		if(rows.containsKey(rowId)) {
			System.out.println("Duplicate Entry");
		}else {
			Row r  = new Row(rowId,columnMap);
			rows.put(rowId, r);
			System.out.println("Added row Successfully");
		}
	}
	
	public void deleteEntry(String rowId) {
		if(rows.containsKey(rowId)) {
			rows.remove(rowId);
			System.out.println("Entry Removed Successfully");
		}else {
			System.out.println("No such Entry Found");
		}
	}
	
	public HashMap<String,String> getEntry(String rowId){
		return rows.get(rowId).getColumnValMap();
	}
	
	public void getAllEntry() {
		
		System.out.println("Key    "+ "value");
		rows.forEach((k,v)->{
			Row r = rows.get(k);
			HashMap<String,String> m = r.getColumnValMap();
			m.forEach((key,value)->{
				System.out.println(key+ "    " +value);
			});
			System.out.println();
		});
	}
	
	public void updateEntry(String rowId ,HashMap<String,String>entry) {
		
			if(rows.containsKey(rowId)) {
				Row row =rows.get(rowId);
				
				entry.forEach((k,v)->{
					row.getColumnValMap().put(k,v);
				});
				System.out.println("Row Updated Successfully");
				row.setUpdatedAt(new Date());
				
			}else {
				System.out.println("No such row found");
			}
	}
	
	
}