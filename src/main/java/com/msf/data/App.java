package com.msf.data;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		// Connect to mongodb
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);

			// get database
			// if database doesn't exists, mongodb will create it for you
			DB db = mongo.getDB("test_msf");

			// get collection
			// if collection doesn't exists, mongodb will create it for you
			DBCollection collection = db.getCollection("users");

			BasicDBObject document = new BasicDBObject("name", "Fred").append(
					"age", "28");
			collection.insert(document);
			
			System.out.println("Done");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
