package notes07_HashMaps;

import java.util.HashMap;

/*
 * HashMaps Notes
 * 
 * HashMap( <Key> , <Value> ) 
 * 
 * Arrays are an index / value storage system
 * 
 */

public class notes_HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> houseNumbers = new HashMap<String, Integer>();
		
		houseNumbers.put("Erin", 7);
		houseNumbers.put("Joe", 420);
		houseNumbers.put("Jacob", 473);
		
		System.out.println("Erin is at " + houseNumbers.get("Erin"));
		System.out.println("Jacob is at " + houseNumbers.get("Jacob"));
		System.out.println();
		
		
		//Change a value
		houseNumbers.put("Jacob", 6541230);
		System.out.println("Jacob is at " + houseNumbers.get("Jacob"));
		System.out.println();
		
		for (String key : houseNumbers.keySet()) {
			
			System.out.println(key + " = " + houseNumbers.get(key));
			
		}
		System.out.println();
		
		for (int value : houseNumbers.values()) {
			
			System.out.println(value);
			
		}
		System.out.println();
		
		
		//remove a value
		houseNumbers.remove("Jacob");
		for (String key : houseNumbers.keySet()) {
			
			System.out.println(key + " = " + houseNumbers.get(key));
			
		}
		System.out.println();
		
		
		
		
		
		
		
		/*
		 * Id numbers / Names
		 */
		HashMap<Integer, String> studentNames = new HashMap<Integer, String>();
		
		studentNames.put(24685, "Bob");
		studentNames.put(8, "Phil");
		for (int key : studentNames.keySet()) {
			
			System.out.println(key + " = " + studentNames.get(key));
			
		}
		
	}
	
	
	
}
