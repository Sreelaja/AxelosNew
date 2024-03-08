package io.restassured.restassuredapi;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForGivenType;

public class TestRAssured_POST {

	//@Test
	public void TestRPOST() {
		
		// create a map
		
		Map<String, Object> map = new HashMap<String, Object>();
		//map.put("\"name\"", "Sree");
//		map.put("name", "Sree");
//		map.put("job", "Tester");
		
		System.out.println(map);
		
		// convert into JSON Object
		
		//JSONObject request = new JSONObject(map); // by creating Map
		
		// Without creating map
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
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
	}
	
	
	//@Test
	public void TestRPUT() {
		
		// Without creating map
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
		.statusCode(200).log().all();
		
	}
	//@Test
	public void testRAPatch() {
		
		// Without creating map
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
				.patch("https://reqres.in/api/users/2")
				.then()
				.statusCode(200).log().all();
			
	}
	@Test
	public void testRADELETE() {
		
		 when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204).log().all();
		
		
	}
}
