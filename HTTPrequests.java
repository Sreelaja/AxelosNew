package io.restassured1.api;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;
import org.hamcrest.Matcher;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HTTPrequests {
	
	//Automate basic HTTP request using rest assured 
	//get - Single user
	//post
	//put
	//delete
	
	// Three methods used in RestAssured
	//given() - prerequisites
	//when() - resource and http requests
	//then() - validation
	
	@Test
	void getUser() 
	
	{ //Test methods
		
		//add 3 static packages from static imports.
		
		given()
		
		.when()
		
		.then();
		
		
	}
	
	
	
	

}
