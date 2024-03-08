package io.restassured1.api;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we need to parse the response of json in string format into argument
		
		JsonPath js = new JsonPath(RAPayload.CoursePrice()); // we need to pass the response of Json in string format into argument
	
		//print the number of courses returned by API
		
		int courseCount = js.getInt("courses.size()"); // size is a method used in json path to get the count
		System.out.println("The Coursecount is " + courseCount);
		
		//print the purchase amount
		
	    int totalAmount = js.getInt("dashboard.purchaseAmount");
	    System.out.println("The Purchase amount is " + totalAmount);
	    
	    //print the title of the first course
	    
	    String title =   js.getString("courses[0].title");
	    // multiple elements can be present in one array
	    
	    System.out.println(title);
	    
	    // print all titles and its prices
	    // for n number of courses, use a for loop
	
	    
	    //Print prices
	    
	    for(int i=0;i<courseCount;i++) {
	    	
	    System.out.println(js.getInt("courses ["+i+"].price"));
	    }
		//print no of copies sold by RPA
	    
	   for(int i=0;i<courseCount;i++) {
	    	
		    String courseTitles = js.getString("courses["+i+"].title");
		    
		    if(courseTitles.equalsIgnoreCase("Cypress")) {
		    	
		    	int copiesCount = js.getInt("courses ["+i+"].copies");
		    	System.out.println("Copies Count is " + copiesCount);
		    	break;
		    	
		    	//verify if Sum of all Course prices matches with Purchase Amount
		    }
		    	    
		    }
	
	}

}
