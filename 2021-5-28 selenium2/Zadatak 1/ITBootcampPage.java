package domaciSelenijum2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ITBootcampPage {
	public static void main(String[] args) {
		/*
		 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na
		 * stranicu IT Bootcamp-a Primeniti metode- get URL i Title, navigate - refresh,
		 * to, back, forward U kodu treba da se prozor maksimizuje, a pre zatvaranja
		 * drajvera vrati na prvobitnu velicinu.
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://itbootcamp.rs//";
		driver.get(url);

		String title = driver.getTitle();
		System.out.println("Title is: " + title);

		driver.navigate().refresh();

		driver.navigate().to("https://itbootcamp.rs/dostupno-znanje/");

		driver.navigate().back();

		driver.navigate().forward();

		Dimension initialSize = driver.manage().window().getSize();

		driver.manage().window().maximize();

		driver.manage().window().setSize(initialSize);

		driver.close();

	}
}
