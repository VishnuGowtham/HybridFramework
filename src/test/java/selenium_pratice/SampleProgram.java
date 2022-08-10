package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleProgram {

	public static void main(String[] args) {

		String orgName = "TestYantraOrg";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");

		// login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		// Navigate into Organization
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt = 'Create Organization...']")).click();
		// adding org
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
		// Org Confirmation msg
		String ActMsg = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		if (ActMsg.contains(orgName)) {
			System.out.println("Organisation Pass");
		} else {
			System.out.println("Orgnisation Fail");
		}
		// Signing Out
		WebElement wb = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
	  //act.dra
		
		driver.quit();

	}

}
