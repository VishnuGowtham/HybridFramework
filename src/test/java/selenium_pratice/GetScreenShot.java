package selenium_pratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetScreenShot {

	@Test
	
	public void takeScreenShot() throws Throwable {
		
		String screenshotName = "vtigerloginpage";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		 File source = screenshot.getScreenshotAs(OutputType.FILE);
		 
		 File destionation =  new File("./screenshot/"+screenshotName+".png");
		 
		 FileUtils.copyFile(source, destionation);
		
		
	}
}
