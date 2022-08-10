package selenium_pratice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.crm.genericutility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchOfLastProductInFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       String product = "mobiles";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[ .= '✕']")).click();
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);

		System.out.println("====================");
		System.out.println(driver.getTitle());
		
		  Actions act = new Actions(driver); act.moveByOffset(10, 10).perform();
		  
		  
//		  List<WebElement> phoneNames =
//		  driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//		  
//		  phoneNames.get(phoneNames.size()-1).click();
		 
		
		driver.findElement(By.xpath("//div[text()= 'Infinix HOT 12 Play (Daylight Green, 64 GB)']")).click();
		
	    WebDriverUtility wlib= new WebDriverUtility();
	    wlib.switchToWindow(driver, "Infinix HOT");
	    
		driver.findElement(By.xpath("//button[text() = 'ADD TO CART']")).click();
		
		//driver.switchTo().f
		
	}

}
