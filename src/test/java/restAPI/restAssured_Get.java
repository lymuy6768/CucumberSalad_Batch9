package restAPI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class restAssured_Get {

	public static void main(String[] args) {
		
		
		//https://reqres.in/api/users?page1
		//set the base URL
		RestAssured.baseURI="https://reqres.in/api/users?page1";
		
		//create request object, specify an object httpRequest to send request
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object, send Get request, and store response in myResponse
		Response myResponse = httpRequest.request(Method.GET);
		
		System.out.println(myResponse.then().log().all());
		
		int statusCode=myResponse.getStatusCode();
		
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
	}

}
