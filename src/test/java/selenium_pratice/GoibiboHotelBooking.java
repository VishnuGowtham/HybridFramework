package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoibiboHotelBooking {

	@Test
	
	public void goibiboHotelBooking() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/hotels/");
		
		driver.findElement(By.xpath("//input[@type='radio']"
				+ "/parent::div/label/following::h4[contains(.,'India')]")).click();
		
//		driver.findElement
//		(By.xpath("//input[@data-testid='home-autosuggest-input']")).sendKeys("Bengaluru");
//		
		
		  driver.findElement(By.xpath("//div[@data-testid ='openCheckinCalendar']")).click(); 
		  String currentMonthXpath ="//span[ . = 'March 2022']";
		  
		  String CheckInDate = "//ul/li[@class = 'date_is_selectable_true']/child::span[contains(. , '31')]";
		  
		  String nextMonthXpath = "//span[. = 'April 2022']";
		  
		  String CheckOutDate = "//ul/li[@class = 'date_is_selectable_true']/child::span[contains(. , '1') and @class='partial']"; 
		  
		  driver.findElement(By.xpath(currentMonthXpath+CheckInDate)).click();
		  driver.findElement(By.xpath(nextMonthXpath+CheckOutDate)).click();
		 // driver.close();
		 
		 
		
		
		
	}
}
