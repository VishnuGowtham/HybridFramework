package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();

		// click on Organization link
		driver.findElement(By.linkText("Organizations")).click();
		
		// Click on All check boxes in Organization Page
		driver.findElement(By.xpath("//table[@class = 'lvt small']"
				+ "/tbody/tr/td/input[@type = 'checkbox']")).click();

	}

}
