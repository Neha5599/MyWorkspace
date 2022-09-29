package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyNetwork {

	@FindBy(xpath ="//div[text()='Connections']")
	private WebElement connections;
	
	@FindBy(xpath ="//div[text()='Contacts']")
	private WebElement contact;
	
	@FindBy(xpath ="//div[text()='People I Follow']")
	private WebElement people;
	
	public MyNetwork(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
}
	public void connetions()
	{
		connections.click();
		
	}
	
	public void contact()
	{
		contact.click();
		
	}
	public void people()
	{
		people.click();
		
	}
	
}
