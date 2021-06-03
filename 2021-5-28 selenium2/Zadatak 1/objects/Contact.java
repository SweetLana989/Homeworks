package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contact {

	public static final String URL = "https://itbootcamp.rs//";

	public static final String LINK_CONTACT_XPATH = "//*[@id=\"menu-item-4141\"]/a";

	public static void clickContacBut(WebDriver driver) {
		driver.findElement(By.xpath(LINK_CONTACT_XPATH)).click();
	}
}