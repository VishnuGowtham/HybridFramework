package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLeastProductInAmazon {

	public static void main(String[] args) {
		
		String searchValue = "T shirts";
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchValue, Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//ul[@class='a-nostyle a-list-link']"
				+ "/descendant::a[@id='s-result-sort-select_1']")).click();
		
		System.out.println("=============");
		
	}
}
