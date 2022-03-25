package restAssuredAutomation;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	public static void main(String[] args) {

		// specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";

		// Request object
		RequestSpecification httpRequest = RestAssured.given();

		// prepare post parameter,request pay_load or body sending along with post
		// request
//		JSONObject requestParams = new JSONObject();
//
//		requestParams.put("FirstName", "Kiwi");
//		requestParams.put("LastName", "Juicy");
//		requestParams.put("UserName", "Kiwi123");
//		requestParams.put("Password", "Kiwi888$");
//		requestParams.put("Email", "Kiwi123@gamil.com");
//
//		// specify content_type as part of header as Json format
//		httpRequest.header("Content-Type", "application/json");
//
//		httpRequest.body(requestParams.toJSONString());// attch above data to the request

		// Response object
		Response response = httpRequest.request(Method.POST, "/Register");

		// print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);

		// status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		Assert.assertEquals(statusCode, 201);
		
		//success code balidation
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");

	}

}
