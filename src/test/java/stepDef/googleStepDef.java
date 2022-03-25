package stepDef;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import utilities.BaseClass;
import utilities.CommonMethods;

public class googleStepDef extends CommonMethods {
	
	@Given("User is on google HomePage")
	public void user_is_on_google_home_page() {
	   BaseClass.getDriver().get(BaseClass.getProperty("urlGoogle"));
	}

	@Given("I want to search for {string}")
	public void i_want_to_search_for(String string) {
	   ghp.searchInputBox.sendKeys(string,Keys.ENTER);
	}

	@Given("results text is displayed with {string}")
	public void results_text_is_displayed_with(String string) {
		
		Assert.assertTrue(grp.resultText.getText().contains(string));
	  //  Assert.assertTrue(grp.resultText.get);

	}
	@Given("results item consist of {string}")
	public void results_item_consist_of(String string) {
		for(WebElement eachItem: grp.listOfItems) {
		Boolean containText = eachItem.getText().contains(string);
		Assert.assertTrue(containText);
		
	   
	
		}	
	
}
	}
