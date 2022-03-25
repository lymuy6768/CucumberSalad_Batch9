package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class googleResultPage {
	
	public googleResultPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id="result-stats")
	public WebElement resultText;

	@FindBy(xpath="//*[@id='rso']/div")
	public List<WebElement> listOfItems;


}
