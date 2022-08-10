package selenium_pratice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetFlightNameInMakemytrip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");

		Actions action = new Actions(driver);
		action.moveByOffset(50, 30).click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		// Click on From
		driver.findElement(By.xpath("//span[. ='From']")).click();

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai, India");

		driver.findElement(By.xpath("//p[. = 'Chennai, India']")).click();
		
		driver.findElement(By.xpath("//span[. ='To']")).click();

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Coimbatore, India");

		driver.findElement(By.xpath("//p[. = 'Coimbatore, India']")).click();

		// Click on departure Date
		driver.findElement(By.xpath("//span[. = 'DEPARTURE']")).click();

		LocalDateTime dateAndTime = LocalDateTime.now().plusDays(1);
		String month = dateAndTime.getMonth().toString();
		int date = dateAndTime.getDayOfMonth();
		int year = dateAndTime.getYear();
		String actualMonth = month.substring(0, 1) + month.substring(1).toLowerCase();
		String monthAndYear = actualMonth + " " + year;

		String CalenderXpath = "//div[.='" + monthAndYear
				+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[. = '" + date + "']";
		driver.findElement(By.xpath(CalenderXpath)).click();

		driver.findElement(By.xpath("//a[.='Search']")).click();

	    List<WebElement> wb = driver.findElements(By.xpath("//span[@class = 'boldFont blackText airlineName']"));
	    
	    for (WebElement flight : wb) {
	    	
			System.out.println(flight.getText());
		}
	    
	    driver.close();
		

	}

}
