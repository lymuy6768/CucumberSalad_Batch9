package restAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class TaskCreateABoard {

	public static void main(String[] args) {
		
		//RestAssured_API_Trello_CreateABoard
		RestAssured.baseURI="https://api.trello.com/1/boards";
		
		//create request
		RequestSpecification httpRequest= RestAssured.given();
		
		String key = "d4b06f4845e09a9595a7ff9a4c143945";
		
		String accessToken = "2ab92fdd7d6bd0866e6bf9399ef5b5858851c7e76f8ec5bad684a91db986a3db";
		
		// specify content_type as part of header as Json format
		httpRequest.header("Content-Type","application/json");

		//httpRequest.header("name","createBoardViaAutomationEclipe")
		String boardName = "AppleTeam";
		
		// Response object
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+key+"&token="+accessToken);
	
		System.out.println(myResponse.then().log().all());
		
		int statusCode = myResponse.getStatusCode();
		
		Assert.assertEquals(200, statusCode);
		

		System.out.println("Test Passed and Board created with "+ statusCode);	
		
	}

}
