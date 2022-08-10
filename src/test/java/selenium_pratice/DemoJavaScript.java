package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoJavaScript {
	@Test
	public void javascriptScrollaction() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root", Keys.ENTER);
		
		JavascriptExecutor jsExe = (JavascriptExecutor)driver;
		
	   //  jsExe.executeScript("window.scrollBy(" + x + "," + y + ")");
		
		
//		Actions act = new Actions(driver);
//		act.c
//		
	}
}
