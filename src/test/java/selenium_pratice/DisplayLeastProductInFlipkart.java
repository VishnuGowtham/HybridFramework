package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayLeastProductInFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String product = "t shirts";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[ .= '✕']")).click();
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);

		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).perform();	
		
		driver.findElement(By.xpath("")).click();
		
		
	}

}
