package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath ="//input[@id='session_key']")
	private WebElement username;
	
	@FindBy(xpath ="//input[@id='session_password']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@class='sign-in-form__submit-button']")
	private WebElement signin;
	
	
	public LoginPage(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	
	public void email()
	{
		username.sendKeys("ashukalbhor9999@gmail.com");
		
	}
	public void sendpassword()
	{
		password.sendKeys("ashukalbhor22");
		
	}
	public void clickon()
	{
		signin.click();
		
	}
	
	
}
