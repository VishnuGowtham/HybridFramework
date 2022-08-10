package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OyoCalenderPopupTest {

	public static void main(String[] args) {

		String Month = "July";
		String CheckIndate = "20";
		String CheckOutdate = "24";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.oyorooms.com/");
		// Clicking on Calendar
		driver.findElement(By.xpath("//span[@class='datePickerDesktop__checkInOutText']/parent::div")).click();

		String MonthXpath = "//span[text() = '" + Month + "']/ancestor::div[@class = 'DateRangePicker__Month']";

		String ChechInDateXpath = "//table[@class = 'DateRangePicker__MonthDates']/tbody/tr[*]"
				+ "/td[contains(.,'"+CheckIndate + "')]";
		
		String ChechOutDateXpath = "//table[@class = 'DateRangePicker__MonthDates']/tbody/tr[*]"
				+ "/td[contains(.,'"+ CheckOutdate + "')]";
		/* clicking on a specified date by user */
		//
		  for (;;) { 
		  try { 
		  driver.findElement(By.xpath((MonthXpath)+(ChechInDateXpath))).click(); 
		  driver.findElement(By.xpath((MonthXpath)+(ChechOutDateXpath))).click();
		  break;

		  } catch (Exception e) {
		      driver.findElement(By.xpath("//div[@class ='DateRangePicker__PaginationArrowIcon DateRangePicker__PaginationArrowIcon--next']")).click();
		  
		  }
		  
		}
	// driver.quit();    
	}
}