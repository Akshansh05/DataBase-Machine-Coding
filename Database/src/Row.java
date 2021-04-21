
import java.util.Date;
import java.util.HashMap;

public class Row {
	private String rowId;
	private HashMap<String,String> columnValMap;
	private Date createdAt;
	private Date updatedAt;
	
	public Row(String rowId,HashMap<String,String>columnValMap) {
		this.rowId = rowId;
		this.columnValMap = columnValMap;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public HashMap<String, String> getColumnValMap() {
		return columnValMap;
	}

	public void setColumnValMap(HashMap<String, String> columnValMap) {
		this.columnValMap = columnValMap;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
