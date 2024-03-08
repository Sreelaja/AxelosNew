package io.restassured1.api;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

    @Test(dataProvider="BooksData") //Go and search for a dataprovider named BooksData, then it will see how many arrays are there to be run
	public void AddBook(String isbn,String aisle) { //parameters should be given as arguments
		
		RestAssured.baseURI = "http://216.10.245.166";
	    String response = given().header("Content-Type","application/json").
		body(RAPayload.addBook(isbn,aisle)).  ////Those Two variables we are sending via test, the AddBook method dynamically creates a new json and sending it back
		//parameterising the value
		when()
		.post("/Library/Addbook.php")
		.then().assertThat().statusCode(200)
		.extract().response().asString();
	
	 JsonPath js = ReUsableMethods.rawTojson(response);
	 String id = js.getString("ID");
	 System.out.println(id);
		
		// Now convert this string to Json		
		
	}
    
    //parameterise different values  for which you require multi dimensional arrays 
    
    @DataProvider (name="BooksData") // DataProvider is a Utility 
    public Object[][] getData() {
    	
    	//set of data you need for test, you must put it as multi dimensional array
    	//array is a collection of elements
    	//Multi dimension array - collection of arrays 
    	
    	//each array will have information about one book
    	// when @Test is linked with this @Dataprovider, each array will pick one book. if you ahve 10 arrays, the test will run 10 times and all the elemets available 
    	// in that array will be available for the test
    	
    return	new Object[][] {{"bsid","9090"},{"cwtete", "5656"},{"iutu","6554"}};// this is an object for multidimensional array
    	//now I have to return the object
    			
    		
    		
    			
    }
    

	

}
