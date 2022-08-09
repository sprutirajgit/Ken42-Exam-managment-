package GetStudent;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetStudentRest {
	@Test
	public void getRequestAutomation() {
		//https://ken426--playground.lightning.force.com/one/one.app

		
		RestAssured.baseURI="https://ken426--playground.lightning.force.com/lightning/page/home";
		
		RequestSpecification httpRequest = RestAssured.given();
		Response  response = httpRequest.request(Method.GET,"/services/apexrest/StudentData/?nameOrRollNum=KEN4201");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:"+responseBody);
		
		int statusCode = response.getStatusCode();
		System.out.println("status code is :"+statusCode);
		
		
		
		String contentType=response.header("Content-Encoding");
		System.out.println("content Type is :"+contentType);
		//Assert.assertEquals(contentType, "application/json; charset=UTF-8");
		

		
		
	

				
	}

}
