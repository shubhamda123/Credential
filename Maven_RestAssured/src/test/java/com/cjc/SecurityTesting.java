package com.cjc;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SecurityTesting {

// to check authentication 
//1. basic-auth
	@Test
	public void basicTest()
	{
		Response res=RestAssured.given().auth().basic("postman", "password").when()
				      .get("https://postman-echo.com/basic-auth/");
		
		   int stcode= res.getStatusCode();
		   System.out.println(stcode);
		   Assert.assertEquals(stcode, 200);
		   System.out.println("method passed");
		   String bodyData=res.getBody().asString();
		   System.out.println("Body data is: "+bodyData);	
	}
	
	//2. digest-auth
		@Test
		public void digestTest()
		{
			Response res=RestAssured.given().auth().digest("postman", "password").when()
					      .get("https://postman-echo.com/digest-auth/");
			
			   int stcode= res.getStatusCode();
			   System.out.println(stcode);
			   Assert.assertEquals(stcode, 200);
			   System.out.println("method passed");
			   String bodyData=res.getBody().asString();
			   System.out.println("Body data is: "+bodyData);	
			
		}
		
	
	
	
	

}
