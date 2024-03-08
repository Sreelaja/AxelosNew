package io.restassured.restassuredapi;

public class RestAssuredPayLoad {
	
	public static String AddPlace() { // static so, need to create object to access this method within the class
		
		return"{\r\n"
				+ "  \"location\": {\r\n"
				+ "  \"lat\": -38.383494,\r\n"
				+ "  \"lng\": 33.427362\r\n"
				+ "},\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Sree Training API\",\r\n"
				+ "  \"phone_number\": \"9876509876\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "     \"shop\"\r\n"
				+ "],\r\n"
				+ " \"website\": \"http://rahulshettyacademy.com\",\r\n"
				+ " \"language\": \"French-IN\"\r\n"
				+ "  \r\n"
				+ "";
		
	}

}
