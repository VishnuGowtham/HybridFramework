package selenium_pratice;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFilePrg {

	public static void main(String[] args)  {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");
		 
		  List<WebElement> headertext = driver.findElements(By.xpath("//div[@id = 'main_navbar']"));
		 
		 for (WebElement webElement : headertext) {
			System.out.println(webElement.getText());
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
