package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homePageStepDef {
	


	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	   System.out.println("user is on home page");// stepDef should be clean, all methods should get from
	}

	@When("User navigates to shopPage")
	public void user_navigates_to_shop_page() {
	    System.out.println("user navigates to shoppage");
	}

	@When("searchs for an item")
	public void searchs_for_an_item() {
	   System.out.println("users searchs for an item");
	}

	@Then("results count should be displayed with number")
	public void results_count_should_be_displayed_with_number() {
	    System.out.println("results count should be displayed with number");
	}
	  
	@When("User navigates to serchPage using yellow button")
	    public void user_navigates_to_serch_page_using_yellow_button() {
	        System.out.println("here is the yellow button");


}
	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
	  
	}
	@Given("user enter username {string} and password {string} list")
	public void user_enter_username_and_password_list(String string, String string2) {
		System.out.println("Username-->"+ string);
		System.out.println("Password-->" + string2);
	  
	}
	@Then("I have added wait {int}")
	public void i_have_added_wait(Integer int1) {
	    
	}

}