package io.restassured1.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;// this will pull out all the packages in Rest Assured
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RestAssuredBase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//validate if Addplace API is working as expected 
		// Add place-> Update place with new address -> Get place to validate if new address is present in response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	  String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Files.readAllBytes(Paths.get("C:\\Users\\Sreelaja.Mukunda-Kum\\Downloads\\addPlaceJson.json"))).when().post("maps/api/place/add/json") // use static package called Files. Readallbytes method can read the content of the path provided here
		//Now we have successfully converted read this file and converted into Bytes, inorder to read this into String
		
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		              .header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		//we store the value as string in a variable called response and then we are sending it into json path and then we extract the value by parsing the json
		System.out.println("The response is  " + response); 
		
		// if we need to just extract Place Id, there is a class called JasonPath 
		
	//	JsonPath js=new JsonPath(response);  // this will take import as String
		JsonPath js = ReUsableMethods.rawTojson(response);
		// for parsing json
	String placeId=js.getString("place_id");
	System.out.println("The placeId is  " + placeId);
	
	//UPDATE PLACE
	
	String newAddress = "70 Queens Walk, USA";
	
	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\": \""+placeId+"\",\r\n" // this will tell Java that the placeId is not a string but a variable
			+ "\"address\": \""+newAddress+"\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "\r\n"
			+ "}")
	.when().put("maps/api/place/update/json")
	.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	//GETPLACE
	
    String getPlaceResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId)//There is no body or header required for GETPLACE API
	.when().get("maps/api/place/get/json")
	.then().assertThat().log().all().statusCode(200).extract().response().asString();

//JsonPath class accept the string and it has the ability to parse and convert into Json
 //Json is a class that expects string

//JsonPath js1 = new JsonPath(getPlaceResponse);

JsonPath js1 = ReUsableMethods.rawTojson(getPlaceResponse);
String actualAddress = js1.getString("address");
// we need an assertion to compare the actual address with the one thats in the response.
System.out.println("The actual address is " + actualAddress);
Assert.assertEquals(actualAddress, newAddress);
// Once you get the response in string, we convert Raw string into Json file, js1/js is the object. from that json we extract that particular path
//when you have any java logic happening, move it to this reUsable methods.java

//there is a method that can convert the content of the file into Byte ->byte data to string. Ultimately we should get the file in sring 

	
	
	
	}

}
