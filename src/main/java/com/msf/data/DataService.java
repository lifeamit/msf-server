package com.msf.data;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class DataService {

	
	public DBCollection getCollection(String db_name, String collection_name) {
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);

			// get database
			// if database doesn't exists, mongodb will create it for you
			DB db = mongo.getDB(db_name);

			// get collection
			// if collection doesn't exists, mongodb will create it for you
			DBCollection collection = db.getCollection(collection_name);
			
			return collection;
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void sayHello() {
		System.out.println("hello");
	}
	
	public void createRecord(String db_name, String collection_name, Map<String, Object> data) {
		this.createRecord(db_name, collection_name, new BasicDBObject(data));
	}
	
	public void createRecord(String db_name, String collection_name, BasicDBObject data) {
		DBCollection collection = this.getCollection(db_name, collection_name);
		collection.insert(data);
	}
	
	public HashMap<String, Object> getRecord(String db, String collection, String condition) {
		HashMap<String, Object> hm = new HashMap<String,Object>();
		return hm;
	}
	
	public void updateRecord(String db, String collection, String condition, HashMap<String, Object> data) {
		
	}
	
	public void deleteRecord(String db, String collection, String condition) {
		
	}
	
	public void emptyCollection(String db_name, String collection_name) {
		
	}
}
