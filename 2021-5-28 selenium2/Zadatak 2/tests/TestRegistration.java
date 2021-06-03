package tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Registration;
import resources.Constants;

public class TestRegistration {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//clean kod je princip da se kod pise jasno i izdvaja u posebne funkcije, tezi se da metode budu sto krace i posebne, jedna funkcija jedna funkcionalnost
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.URL_HOME);
		Home.clickRegBtn(driver);
		String currentUrl = driver.getCurrentUrl();
		String expctedUrl = Constants.URL_REGISTER;
		Assert.assertEquals(currentUrl, expctedUrl);
	}
	
	@Test
	public void testFormReg() {
		driver.navigate().to(Constants.URL_REGISTER);
		Registration.inputUsername(driver, "svetlana");
		Registration.inputPassword(driver, "123");
		Registration.inputCofirmPassword(driver, "123");
		Registration.submit(driver);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		Assert.assertEquals(currentUrl, expectedUrl);
	}
	
}
