package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicSelectAllCheckBoxes {

	public static void main(String[] args) throws Exception {
		
		 WebDriverManager.chromedriver().setup(); 
         WebDriver driver = new ChromeDriver();
         
         driver.get("http://localhost:8888/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  driver.findElement(By.name("user_password")).sendKeys("root", Keys.ENTER);
		  
		  driver.findElement(By.linkText("Organizations")).click();
		  
		 List<WebElement> checkboxes = driver.findElements(By.xpath
		  ("//table[@class = 'lvt small']"
		  		+ "/tbody/tr[@bgcolor='white']/td/input[@name='selected_id']"));
		 
		 
		 for(WebElement ele : checkboxes) {
			 
			 ele.click();
			Thread.sleep(1000);
		 }  
		 
		// driver.close();
	}
}
