package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Contact;

public class ContactTest {

	// https://itbootcamp.rs/kontakt/

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void testContactBut() {
		driver.navigate().to(Contact.URL);
		Contact.clickContacBut(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://itbootcamp.rs/kontakt/";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
}
