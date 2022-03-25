package restAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class getTrelloBoards {

	public static void main(String[] args) {
		
		///https://api.trello.com/1/members/me/boards?key={yourKey}&token={yourToken}
		
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		String key = "d4b06f4845e09a9595a7ff9a4c143945";
		String accessToken="2ab92fdd7d6bd0866e6bf9399ef5b5858851c7e76f8ec5bad684a91db986a3db";
		
		Response myResponse = httpRequest.get(RestAssured.baseURI+"?key="+key+"&token="+accessToken);
		
		String prettyFormat = myResponse.asPrettyString();
		
		System.out.println(prettyFormat);
		
		//System.out.println(myResponse.then().log().all());
		
		Assert.assertEquals(myResponse.getStatusCode(), 201);
	}

}
