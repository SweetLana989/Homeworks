package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Screenshot;

public class ScreenshotTest {
	
	public static WebDriver driver;
	

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	 @Test
	 public void testTakeScreenShot() throws Exception{
		 driver.get(Screenshot.URL);
		 Screenshot.screenshot(driver);
		 }

}
