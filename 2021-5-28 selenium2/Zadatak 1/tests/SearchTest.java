package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Search;

public class SearchTest {
	

	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSearch() {
		driver.navigate().to(Search.URL);
		Search.findSearchButton(driver);
		Search.clickSearchField(driver);
		Search.inputSearchField(driver, "testiranje");
		Search.clickEnter(driver);
		String curentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://itbootcamp.rs/?s=testiranje";
		Assert.assertEquals(curentUrl, expectedUrl);
		
	}
}
