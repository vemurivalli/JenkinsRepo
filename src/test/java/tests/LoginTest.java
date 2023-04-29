package tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends BaseTest {
	

	LoginPage loginpage;
	HomePage homepage;
	WebDriver driver;
	
	
	@Parameters ("browser")
	@BeforeMethod
	public void beforeMethod(String browser) throws IOException
	{
		
		driver=getDriver(browser);
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
	
/*	
	@Test
	//Login to SFDC
	
	public void logintoSFDC() throws InterruptedException
	{
	   loginpage.enterUsername();
	   loginpage.enterPassword();
	   loginpage.clickLogin();
	   loginpage.validateHomepage();
	   
	}
	
	@Test
	//Login error message 1
	public void navigateSFDC()
	{
		loginpage.enterUsername();
		loginpage.clearPassword();
		loginpage.clickLogin();
		loginpage.validatepwdErrorMessage();
		
		
	}
	
	@Test
	//Test the remember username check box 
	public void checkRemeberme() throws InterruptedException
	{
		loginpage.enterUsername();
		loginpage.enterPassword();
		
		loginpage.checkRememberme();
		
		loginpage.clickLogin();
		homepage.clickOnUserMenu();
		
		homepage.clickOnLogout();
		loginpage.readUsername();
		loginpage.validateUsername();
		
		   
	}
	
	@Test
	//Forgot Password
	public void forgotPassword()
	{
		loginpage.clickForgotPassword();
		
		
		loginpage.usernameForgotPwdPage();
		
		loginpage.clickOnContinueButton();
		
		
	}
	
	@Test
	//ValidateLoginErrorMessage
	public void validateLoginErrorMessage()
	{
		
		loginpage.enterRandomUsername();
		loginpage.enterRandomPassword();
		loginpage.clickLogin();
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		
	}

	
	


	
	*/

}
