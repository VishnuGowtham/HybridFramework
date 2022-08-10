package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchForMobilesInFlipkart {

	@Test
	public void searchMobilePrint() {

		String product = "phones";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[ .= '✕']")).click();
		driver.findElement(By.name("q")).sendKeys(product, Keys.ENTER);

		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).perform();

		List<WebElement> phoneNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> phoneRates = driver.findElements(By.xpath(
				"//div[@class='_4rR01T']/ancestor::div[@class= '_3pLy-c row']/descendant::div[@class = '_30jeq3 _1_WHN1']"));
		
	/*	for (WebElement webElement1 : phoneNames) {
			String phoneName = webElement1.getText();
		       
			   int price3 = 0;  */     
			for (WebElement webElement2 : phoneRates) {
				
				String actphoneprice = webElement2.getText();
				String price = actphoneprice.substring(1);
				String price2 = price.replace(",", "");
		
		         int price3 = Integer.parseInt(price2);
               
			
			
		if (price3 >= 5000 && price3 <= 10000) {

				System.out.println("Price : " + price3);	
		    }
			
	   }
		
		//	driver.close();
	}

}
