package restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

import org.junit.Assert;

public class getTesting {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
		
		Response response = given().contentType(ContentType.JSON)
		.param("postId", "2")
        .when()
        .get("/comments")
        .then()
        .extract()
        .response();
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		
		Assert.assertEquals(200,response.statusCode());
		Assert.assertEquals("Meghan_Littel@rene.us",response.jsonPath().getString("email[3]"));
		Assert.assertEquals("eaque et deleniti atque tenetur ut quo ut", response.jsonPath().getString("name[4]"));
	}

	
	

}
