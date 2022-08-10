package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.genericutility.JavaUtility;
import com.crm.genericutility.WebDriverUtility;

public class CreateOrganizationAndDelete {

	@Test
	public void createOrganization() {
		JavaUtility jLib = new JavaUtility();
		int ranNum = jLib.getRandomNum();
		WebDriverUtility wLib = new WebDriverUtility();

		String orgName = "Sibi_Constructions" + "_" + ranNum;
		System.out.println(orgName);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();

		// click on Organization link
		driver.findElement(By.xpath("//a[. ='Organizations']")).click();
		// click on "+" image
		driver.findElement(By.xpath("//img[@alt = 'Create Organization...']")).click();
		// enter Organization name
		driver.findElement(By.name("accountname")).sendKeys(orgName);

		driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();

		driver.navigate().refresh();

		driver.findElement(By.xpath("//a[. ='Organizations']")).click();

		System.out.println("===========================");

		for (;;) {

			try {
				
			driver.findElement(By.xpath("//a[text()='"+orgName+"' and @title='Organizations']")).click();
				
				break;

			} catch (Exception e) {

				driver.findElement(By.xpath("//img[@src='themes/images/next.gif']")).click();

			}

		}
		
		driver.findElement(By.xpath("//input[@title= 'Delete [Alt+D]']")).click();
		wLib.switchToAlertWindowAndAccept(driver);
		//driver.switchTo().
		System.out.println("================Org deleted Successfully======");

	}
}
