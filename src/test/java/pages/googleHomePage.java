package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class googleHomePage {

	
	public googleHomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(name="q")
	public WebElement searchInputBox;
}
