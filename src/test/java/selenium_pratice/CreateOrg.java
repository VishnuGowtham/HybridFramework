package selenium_pratice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.genericutility.ExcelUtility;
import com.crm.genericutility.FileUtility;
import com.crm.genericutility.JavaUtility;
import com.crm.genericutility.WebDriverUtility;

public class CreateOrg {
		
	@Test
	public void createOrg() throws Throwable {
		
		System.out.println("created organization");

		/* Object for Java Utility Class */
		JavaUtility jLib = new JavaUtility();
		int ranNum = jLib.getRandomNum();
		/* Object for File Utility Class */
		FileUtility fLib = new FileUtility();
		/* Object for Excel Utility Class */
		ExcelUtility eLib = new ExcelUtility();
		WebDriverUtility wLib = new WebDriverUtility();

		/* read common data from properties file */
		String browser = fLib.getDataPropertyKeyValue("browser");
		String url = fLib.getDataPropertyKeyValue("url");
		String username = fLib.getDataPropertyKeyValue("username");
		String password = fLib.getDataPropertyKeyValue("password");
		
		/* read common data from Excel file */
		String orgName = eLib.getDataFromExcel("Sheet2", 3, 0) + "_" + ranNum;

		// Run time Polymorphism
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("launched browser is " + browser);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("launched browser is " + browser);
		} else {
			System.out.println("Specify valid browser");
		}

		// Launching browser
		driver.manage().window().maximize();
		driver.get(url);
		wLib.waitForPageToLoad(driver);
		// Login
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		// click on Organization link
		driver.findElement(By.linkText("Organizations")).click();
		// click on "+" image
		driver.findElement(By.xpath("//img[@alt = 'Create Organization...']")).click();
		// enter Organization name
		driver.findElement(By.name("accountname")).sendKeys(orgName);

		// Selecting Industry type
		WebElement noofindustry = driver.findElement(By.name("industry"));
		String industryName = eLib.getDataFromExcel("Sheet1", 1, 3);
		wLib.select(noofindustry, industryName);

		// Click on Save
		driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
		/*Logout*/
		WebElement wb = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOverOnElement(driver, wb);
		driver.findElement(By.linkText("Sign Out")).click();
		// Close the browser
		driver.quit();

	}
}
