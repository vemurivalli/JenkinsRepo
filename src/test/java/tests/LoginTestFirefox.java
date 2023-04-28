package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTestFirefox extends BaseTest{
	
LoginPage loginpage;
	
	

	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		loginpage=new LoginPage(driver);
		
		
	}
	
	
	@Test
	//Login to SFDC
	
	public void logintoSFDC() throws InterruptedException
	{
	   loginpage.enterUsername();
	   loginpage.enterPassword();
	   loginpage.clickLogin();
	}
	
	


}
