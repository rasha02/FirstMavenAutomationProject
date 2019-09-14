package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	static WebDriver driver;

	@BeforeTest
	public void setUp() {
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://automationpractice.com");

		driver.manage().window().maximize();

	}
	
	/*@AfterTest
	public void tearDown() {
		BaseClass.getWebDriver().quit();

	}*/
	
	public static WebDriver getWebDriver()
	{
		return driver;
	}

	

}
