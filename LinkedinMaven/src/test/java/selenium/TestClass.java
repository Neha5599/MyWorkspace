package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.MyNetwork;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.linkedin.com/");
		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.email();
		loginpage.sendpassword();
		loginpage.clickon();

		HomePage homepage = new HomePage(driver);
		homepage.network();

		MyNetwork mynetwork = new MyNetwork(driver);
		mynetwork.connetions();
		mynetwork.contact();
		mynetwork.people();

		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.me();
		logoutPage.signout();

	}
	
}
