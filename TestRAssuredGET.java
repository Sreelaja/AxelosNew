package io.restassured.restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*; // this will let me use all the methods without creating the object

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestRAssuredGET {
	
	@Test
	public void TestR2() {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200)
		.body("data.id[2]", equalTo(9))
		.body("data.first_name",hasItems("Michael","Lindsay","Tobias"))
		.log().all(); // print the entire response
		
		
	}

	
}
