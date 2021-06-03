package selenijum1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOn {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String SIGN_ON_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		WebElement signOn = driver.findElement(By.xpath(SIGN_ON_XPATH));
		signOn.click();
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("lana");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
