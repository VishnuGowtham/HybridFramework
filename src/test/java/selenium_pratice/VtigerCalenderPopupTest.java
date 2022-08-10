package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerCalenderPopupTest {

	public static void main(String[] args) {
//		String monthAndYear = "May 2022";
//		String Date = "5";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");

		// Login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		// Step 5: Navigate to Contact
		driver.findElement(By.linkText("Contacts")).click();
		// Step 6 : Navigate to create contact page
		driver.findElement(By.xpath("//img[@title ='Create Contact...']")).click();
		// Step 7 : Create a new contact
		driver.findElement(By.name("lastname")).sendKeys("Ashok");
		// Calendar Popup
		driver.findElement(By.id("jscal_trigger_birthday")).click();
		
		
		

		
		
		
		
	}

}