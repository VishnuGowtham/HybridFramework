package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAutoSuggestion {

	@Test
	public void autoSuggest() throws Throwable {
		
		String searchValue = "Asus Laptop";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchValue);
		
		
		//Thread.sleep(3000);
		List<WebElement> listOfAutoSuggestion = driver.findElements
				(By.xpath("//div[@class='autocomplete-results-container']/descendant::div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	
		for (WebElement web : listOfAutoSuggestion) {
			System.out.println("ssss");
			System.out.println(web.getText());
		}
		
		
		driver.quit();
		
	}
	
	
}
