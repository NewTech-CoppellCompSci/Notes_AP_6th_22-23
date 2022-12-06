package notes06_JSON_Testing;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



/*
 * Example JSON request and parse
 * 
 */


public class JSON_Testing {

	public static void main(String[] args) {
		
		getDaily();
		
	}
	
	
	
	public static void getDaily() {
		
		String joke = "";
		String id = "";
		
		try {
			//create URL object from a string
			URL url = new URL("https://api.chucknorris.io/jokes/random");
			
			//cast URL object to HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");	//we are getting (not sending or downloading)
			conn.connect();

			// Getting the response code
			int responsecode = conn.getResponseCode();
			
			//Check for possible response error codes
			if (responsecode == 429) {
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			} else {

				String rawJSON = "";  //stores JSON as raw text
				Scanner scanner = new Scanner(url.openStream());  //set to scan from the url stream

				// Write all the JSON data into a string using a scanner
				while (scanner.hasNext()) {
					rawJSON += scanner.nextLine();
				}

				// Close the scanner
				scanner.close();
				//System.out.println(rawJSON);
				
				
				JSONParser parse = new JSONParser();  //create the parsing object
				// Using the JSON simple library parse the rawJSON String into a JSON object
				JSONObject json = (JSONObject) parse.parse(rawJSON);
				
				id = (String) json.get("id");
				joke = (String) json.get("value");
				
			}

		} catch (Exception e) {
			e.printStackTrace();  //prints the error codes if the try fails
		}
		
		System.out.println(id);
		System.out.println(joke);
		
		
		
	}
	
	
	
	
}
