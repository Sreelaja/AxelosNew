package io.restassured.restassuredapi;

import org.asynchttpclient.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
//import io.restassured.response.Response;
//import io.restassured.response.Response;

@Test
public class TC001_GET {
	
	void getweatherDetails() {
		
		//specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		//request object
		RequestSpecification httpRequest = RestAssured.given(); // using this object we send a request to the server. 
		
		//the response for the above request will be stored in the Request object
		
	//	Response response =  httpRequest.request(Method.GET, "/Hyderabad"); // this will also be send to the server and the response will be stored in the response variable.
	  //  String responseBody=response.getResponseBody();
	    
	  //  System.out.println("Response Body is:  " +responseBody);
	}
	
	@Test
	void test_TC01() {
	
			
	}

}
