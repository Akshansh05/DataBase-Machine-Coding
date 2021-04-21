import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Manager Object
		DatabaseManager manager = new DatabaseManager();
		
		//create Database db1
		Database db1 =manager.createDatabase("db1");
		
		//create table 
		Table emp  = db1.createTable("Employee");
		
		//create Entry 
		
		// Abhay map with row Id 1
		HashMap<String,String>m1  = new HashMap<String,String>();
		
		m1.put("Name", "Abhay");
		m1.put("Age", "34");
		m1.put("Gender","Male")	;
		m1.put("City", "Banaglore");
		
		emp.insertEntry("1", m1);
		
	    // Reeta map with row Id 1
		HashMap<String,String>m2  = new HashMap<String,String>();
				
		m2.put("Name", "Reeta");
	    m2.put("Age", "22");
	    m2.put("Gender","Female")	;
		m2.put("City", "Mumbai");
				
		emp.insertEntry("2", m2);
		
		//select Statement 
		emp.getAllEntry();
		
		//delete Entry
		emp.deleteEntry("2");
		
		//select Statement 
		emp.getAllEntry();

		
	}

}
