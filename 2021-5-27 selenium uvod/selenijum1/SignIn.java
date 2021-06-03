package selenijum1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		
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
