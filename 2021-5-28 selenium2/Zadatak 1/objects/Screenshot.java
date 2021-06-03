package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	
	public static final String URL = "https://itbootcamp.rs/?s=testiranje";
	
	public static void screenshot(WebDriver driver) {
	
	TakesScreenshot scrShot = ((TakesScreenshot)driver);
    File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
    File destFile = new File("C:\\Users\\38164\\Desktop\\test.png");
    try {
		FileUtils.copyFile(scrFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
