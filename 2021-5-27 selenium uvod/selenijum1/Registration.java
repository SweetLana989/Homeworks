package selenijum1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String REGISTER_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	public static final String TXT_ADRESS_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input";
	public static final String SELECT_COUNTRY_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(URL);

		WebElement register = driver.findElement(By.xpath(REGISTER_XPATH));
		register.click();

		WebElement name = driver.findElement(By.name("firstName"));
		name.sendKeys("Svetlana");

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Pavlovic");

		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("telefon");

		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("123");

		WebElement addres = driver.findElement(By.xpath(TXT_ADRESS_XPATH));
		addres.sendKeys("adresa");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Beograd");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Srb");

		WebElement postalCode = driver.findElement(By.name("postalCode"));
		postalCode.sendKeys("11000");

		WebElement country = driver.findElement(By.xpath(SELECT_COUNTRY_XPATH));
		country.sendKeys("SERBIA");

		WebElement username = driver.findElement(By.cssSelector("#email"));
		username.sendKeys("lana");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123");

		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("123");

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}