package selenium_pratice;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectTodayDateTest {
	
    @Test
	public void selectTodayDate()  {
		
		 // Tomorrow date
		 // If u need present date, remove plusDays() method....
		
	     LocalDateTime dateAndTime = LocalDateTime.now().plusDays(1);
	     String month = dateAndTime.getMonth().toString();
	     int date = dateAndTime.getDayOfMonth();
	     int year = dateAndTime.getYear();
	     String actualMonth = month.substring(0, 1)+month.substring(1).toLowerCase();
	     String monthAndYear = actualMonth+ " "+year;
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		Actions action = new Actions(driver);
		action.moveByOffset(50, 30).click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[. = 'DEPARTURE']")).click();
		
        String CalenderXpath = "//div[.='"+monthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[. = '"+date+"']";
        driver.findElement(By.xpath(CalenderXpath)).click();
        
        
	}

}
