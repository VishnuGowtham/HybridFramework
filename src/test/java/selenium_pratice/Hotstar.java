package selenium_pratice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hotstar {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");
		            
		List<WebElement> list = driver.findElements(By.
	    xpath("//div[@class = 'container'and . = 'Latest & Trending']/following-sibling::div[@class = 'slider-container']/descendant::div[@class='description ellipsize']"));
	
		driver.findElement(By.xpath("//div[@class = 'container' and . = 'Latest & Trending']"
				+ "/following-sibling::div[@class = 'slider-container']"
				+ "/descendant::i [@class='right-arrow']")).click();
		
		for (WebElement webElement : list) {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.t(webElement));
			System.out.println(webElement.getText());
		}
	   
				
	}

}
