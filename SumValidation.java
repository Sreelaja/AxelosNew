package io.restassured1.api;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class SumValidation {
	
	@Test
	public void sumofCourses() {
		
		int sum = 0;
		
		
		JsonPath js = new JsonPath(RAPayload.CoursePrice()); 
        int count=js.getInt("courses.size()");
		for(int i=0;i<count;i++) {
			
		int totalprice = js.getInt("courses["+i+"].price");
		int totalcopies = js.getInt("courses["+i+"].copies");
		int totalamount = totalprice*totalcopies;
		System.out.println("Total amount is " + totalamount);
	    sum = sum + totalamount;
		
		
		}
		System.out.println("the purchase amount is " + sum);
	
		int purchase_amount = js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchase_amount);
	}

}
