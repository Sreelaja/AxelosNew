package io.restassured1.api;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;// this will pull out all the packages in Rest Assured
import static org.hamcrest.Matchers.*;

public class RestAssuredSAmpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().queryParam("key","qaclick123")
				          .header("Content-Type","application/json")
				          .body()
				          .when().post("maps/api/place/add/json")
				          .then()
		

	}

}
