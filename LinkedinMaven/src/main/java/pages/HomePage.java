package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@title ='My Network']")
	private WebElement network;

	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

       //open network	
	public void network() {
		network.click();

	}
	
}
