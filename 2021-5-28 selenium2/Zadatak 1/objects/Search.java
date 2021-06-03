package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search {
	/*
	 * Dokazati da prilikom koriscenja reci “testiranje” u search-u (i trazanja
	 * jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot
	 * stranice. nakon pretrage - istraziti na netu kako.
	 */

	public static final String URL = "https://itbootcamp.rs/";
	
	public static void findSearchButton(WebDriver driver) {
		driver.findElement(By.className("open-search")).click();		
	}
	
	public static void clickSearchField(WebDriver driver) {
		driver.findElement(By.name("s")).click();		
	}
	
	public static void inputSearchField(WebDriver driver, String inputWord) {
		driver.findElement(By.name("s")).sendKeys(inputWord);		
	}
	
	public static void clickEnter(WebDriver driver) {
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);	
	}
}
