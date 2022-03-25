package restAPI;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITrelloCreateABoard {

	public static void main(String[] args) {
		
	    
		
		RestAssured.baseURI = "https://api.trello.com/1/boards";
		
		//Create Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		String key ="d4b06f4845e09a9595a7ff9a4c143945";
		
		String accessToken ="2ab92fdd7d6bd0866e6bf9399ef5b5858851c7e76f8ec5bad684a91db986a3db";
		
		httpRequest.header("Content-Type", "application/json");
		
		//httpRequest.header("name","createBoardViaAutomationEclipe")
		
		String boardName = "BoardViaEclipse";
		
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+key+"&token="+accessToken);
		
		System.out.println(myResponse.then().log().all());
		
		int statusCode = myResponse.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
		
		System.out.println("Test Passed and Board created with "+ statusCode);
		
	        
	        
	 
	}
}
