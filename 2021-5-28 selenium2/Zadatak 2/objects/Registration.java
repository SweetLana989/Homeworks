package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Constants;


public class Registration {
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(Constants.TXTUSERNAME_XPATH)).sendKeys(username);
	}

	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);
		}
	
	public static void inputCofirmPassword(WebDriver driver, String password){
		driver.findElement(By.name("confirmPassword")).sendKeys(password);;
	}
	
	public static void submit(WebDriver driver) {
		driver.findElement(By.name("submit")).click();
	}
	
}
