package com.msf.data;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;

/**
 * Hello world!
 * 
 */
public class DataServiceUseTest {
	
	public static void main(String[] args) {
		try {
			 DataService ds = new DataService();
			 
			 // Test createRecord (map addition)
			 Map<String, Object> map = new HashMap<String, Object>();
			 map.put("name", "Department A");
			 map.put("name2", "Department B");
			 ds.createRecord("test_msf", "users", map);
			 
			 // Test createRecord (dbobject addition)
			 BasicDBObject document = new BasicDBObject("name", "newewewe").append(
						"age", "28");
			 ds.createRecord("test_msf", "users", document);
			 
			 // Test deleteRecord
			 
			 
			 // Test getCollection
			 
			 
			 // Test getRecord
			 
			 
			 // Test updateRecord
			
		
		
			 
			 
			
			System.out.println("Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

	
}





