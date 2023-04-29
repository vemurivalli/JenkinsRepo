package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
	}

}
