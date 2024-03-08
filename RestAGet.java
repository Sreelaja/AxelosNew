package io.restassured1.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import junit.framework.Assert;

import org.testng.annotations.Test;



public class RestAGet {
	
	@Test
	void test_01() {
		
	Response response = RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println("The sring is " +  response.asString());
	System.out.println("The status code is " + response.getStatusCode());
	System.out.println("The body is " + response.getBody());
	System.out.println("The statusline is " + response.statusLine());
	System.out.println("The headers is " + response.getHeaders());
	
	int statuscode = response.getStatusCode();
	Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void test_02() {
		
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		
	}

}
