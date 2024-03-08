package io.restassured1.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stubcoogle Maps is working as expected
		
		//Given - all input details
		//When - Submit the API - resource and http method should go under When method
		//Then - validate the response
		
		//set your Base URL first
		
		//Add Place ->Update place with New Address -> Get Place  
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	    String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json") // chaining up all info with Given method
		.body("{\r\n" // accepts body in Jason format)
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
				+ "}").when().log().all().post("maps/api/place/add/json") // this resource name will get concatenated with Base URL
		         .then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP")) //validate if the status code went through successfully. 
		    //equalTo belong to Hamcrest package
		          // validate the server name
		         .header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString(); //Save it to the variable
	             System.out.println("Here's the response ---  " +  response); 
	           // now you need to get a specific place id out of the response - json Parsing  
	             
	             JsonPath js=new JsonPath(response); // for parsing Jason. 
	             //Creating an object for the class JsonPath which takes string as input and convert to json which parse json
                 //js variable has the knowledge of your json
	            String placeId= js.getString("place_id");// store this in a variable
	            System.out.println("here's the Place Id -- > " + placeId);
	      //    String location_lat=js.getString("location.lat");
	        //  System.out.println("Here's the location lat -->" + location_lat);
	            
	            //Update Place
	          given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
	          .body("{\r\n"
	          		+ "\"place_id\": \""+placeId+"\",\r\n"
	          		+ "\"address\": \"70 Summer Walk, USA\",\r\n"
	          		+ "\"key\":\"qaclick123\"\r\n"
	          		+ "\r\n"
	          		+ "}")
	          .when().put("/maps/api/place/update/json")
	          .then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
	      //    .header(placeId, isEmptyOrNullString())
	           
	           //Get Place
	           // there is no header for Get BUT specifically mention the PlaceID
	           
	           String newAddressResponse = "70 Summer Walk, USA";
	           
	           String getPlaceResponse= given().log().all().queryParam("key","qaclick123")
	           .queryParams("place_id",placeId)
	           .when().get("/maps/api/place/get/json")
	           .then().assertThat().log().all().statusCode(200).extract().response().asString();
	       
	           // now we need to extract the NewAddress using json Path
	           
	          JsonPath js1 = new JsonPath(getPlaceResponse);
	          String actualAddress = js1.getString("address");
	          System.out.println(actualAddress);
	          
	          
	           
	           	           
	}

}
