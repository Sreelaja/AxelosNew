package io.restassured1.api;

public class RAPayload {
	
	public static String addPlace() { // no need to create object
		return "{\r\n"
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
				+ "}";
		
	}
	
	public static String CoursePrice() {
		
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}";
		
	}

	public static String addBook(String aisle, String isbn) {
		return "{\r\n"
				+ "\r\n"
				+ "\"name\" : \"Learn Appium Automation with Java\" ,\r\n"
				+ "\"isbn\" : \""+isbn+"\",\r\n" //make it a variable
				+ "\"aisle\": \""+aisle+"\",\r\n"
				+ "\"author\":\"John Foe\"\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "}";
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
