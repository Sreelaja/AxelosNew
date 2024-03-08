package io.restassured.restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*; // this will let me use all the methods without creating the object

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestRestAssured {

	@Test
	void testRA() {
		
	Response response=RestAssured.get("https://reqres.in/api/users?page=2");// this is the end point of the API // Response is a class from RestAssured
	
	System.out.println("String is " + response.asString());
	System.out.println("The body of the string is " + response.getBody().asString());
	System.out.println("The status code is " + response.getStatusCode());
	System.out.println("The status line is " + response.getStatusLine());
	System.out.println("The header is  " + response.getHeader("content-type"));
	System.out.println("The time response is " + response.getTime());
	
	int statusCode = response.getStatusCode();
	
	Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void testRA2() {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]",equalTo(9));
		
		
	}
	
	
}
