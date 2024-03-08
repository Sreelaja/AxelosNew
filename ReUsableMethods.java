package io.restassured1.api;

import io.restassured.path.json.JsonPath;

public class ReUsableMethods {

	//this class with reusable methods for optimising the test
	
	public static JsonPath rawTojson(String response) { // converting the string Raw to Json
		//make it static so you can access with class name without creating object
		
		JsonPath js1 = new JsonPath(response);
		return js1; // here we are returning the object
	}
}
