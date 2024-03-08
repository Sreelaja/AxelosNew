package io.restassured.restassuredapi;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TEST02_get { // pass the end point or the url
	
//	@Test
	public void test_1() {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("data.id[2]", equalTo(9))
		.log().all();
		
	}		
		//POST is used to create a body in the server
		//can use some libraries like gson, jackson,
		
	//	@Test
		public void test01_Post01() {
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "Sree");
			map.put("job", "Teacher");
			
			System.err.println(map);
		
		
		//gson library 
		//json.simple , copy the dependency 
		//jackson library - high performance 
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
		 .header("Content-Type", "application/json")
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON).
		 body(request.toJSONString()).
		when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
		//when keyword marks the premise of your scenario. For example, ‘when’ you get/post/put something, do something else.
		
		//‘Given’ keyword, lets you set a background, here, you pass the request headers, query and path param, 
		//body, cookies. 
		//This is optional if these items are not needed in the request  
	
		}
		@Test
		public void Test_PUT01(){
			
			JSONObject request = new JSONObject();
			request.put("name","Sree");
			request.put("job", "Tester");
			
			System.out.println(request);
			System.out.println(request.toJSONString());
			
			// now that the body is created, create a POST 
			
			given()
			 .header("Content-Type", "application/Json")
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)		 
			.body(request.toJSONString())		
			.when()
			.put("https://reqres.in/api/users/2")
			.then()
			.statusCode(200);

			
		}
		
	}

