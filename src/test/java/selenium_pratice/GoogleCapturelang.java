package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleCapturelang {

	@Test
	public void googleLang() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
	   // List<WebElement> list = driver.findElements(By.xpath("//div[@id = 'SIvCob']/a"));
	       String s = driver.findElement(By.id("SIvCob")).getText();
	    
	      System.out.println(s);  
//		for (WebElement webElement : list) {
//			System.out.println(webElement.getText());
//		}
//		  
		  
	}
	
}
