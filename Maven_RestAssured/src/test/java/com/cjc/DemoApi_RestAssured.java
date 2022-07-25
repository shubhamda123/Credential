package com.cjc;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoApi_RestAssured {

//1.Get
//	@Test
//	public void getTest()
//	{	
//		RestAssured.baseURI="https://reqres.in/";
//	    Response res=	RestAssured .request(Method.GET,"/api/users?page=2");
//		
//		int statusCode=	res.getStatusCode();
//		System.out.println(statusCode);
//		
//		Assert.assertEquals(statusCode, 200);
//		
//	String body=res.getBody().asString();
//		System.out.println("body data is="+body);	
//	}
	
//--------------------------------------------------
//2. Post
//	@Test
//	public void postMethod()
//	{
//	   RequestSpecification req=RestAssured.given();
//	   req.header("Content-type","application/json");
//	   
//	   JSONObject jobj=new JSONObject();
//	   jobj.put("name", "cjc");
//	   jobj.put("job", "SE");
//	   req.body(jobj.toJSONString());
//	   
//	   Response res=req.post("https://reqres.in/api/users");
//	   
//	  int stcode= res.getStatusCode();
//	   System.out.println(stcode);
//	   
//	   Assert.assertEquals(stcode, 201);
//	   System.out.println("method passed");
//	   String bodyData=res.getBody().asString();
//	   System.out.println("Body data is: "+bodyData);
//	
//	}
//	
//--------------------------------------------------
//3. Put
//		@Test
//		public void putMethod()
//		{
//		   RequestSpecification req=RestAssured.given();
//		   req.header("Content-type","application/json");
//		   
//		   JSONObject jobj=new JSONObject();
//		   jobj.put("name", "Punecjc");
//		   jobj.put("job", "SE");
//		   req.body(jobj.toJSONString());
//		   
//		   Response res=req.put("https://reqres.in/api/users/2");
//		   
//		  int stcode= res.getStatusCode();
//		   System.out.println(stcode);
//		   
//		   Assert.assertEquals(stcode, 200);
//		   System.out.println("method passed");
//		   String bodyData=res.getBody().asString();
//		   System.out.println("Body data is: "+bodyData);
//		
//		}	
//	
		//--------------------------------------------------
 //4. Patch
//		@Test
//		public void patchMethod()
//			{
//			   RequestSpecification req=RestAssured.given();
//				  req.header("Content-type","application/json");
//				   
//				  JSONObject jobj=new JSONObject();
//				   jobj.put("name", "Punecjc");
//				   jobj.put("job", "SEe");
//				   req.body(jobj.toJSONString());
//				   
//				   Response res=req.patch("https://reqres.in/api/users/2");
//				   
//				  int stcode= res.getStatusCode();
//				   System.out.println(stcode);
//				   
//				   Assert.assertEquals(stcode, 200);
//				   System.out.println("method passed");
//				   String bodyData=res.getBody().asString();
//				   System.out.println("Body data is: "+bodyData);			
//			}	
				
//5.delete--------------------------------------------------------	
	
		@Test
		public void deleteMethod()
			{
			   RequestSpecification req=RestAssured.given();
			   Response res=req.delete("https://reqres.in/api/users/2");
				   
			   int stcode= res.getStatusCode();
			   System.out.println(stcode);
			   Assert.assertEquals(stcode, 204);
			   System.out.println("method passed");
			   String bodyData=res.getBody().asString();
			   System.out.println("Body data is: "+bodyData);		
			   
			}
	
	
	
	
	
	
	
	
	
}
