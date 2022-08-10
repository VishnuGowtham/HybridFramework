package selenium_pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.genericutility.ExcelUtility;
import com.crm.genericutility.FileUtility;
import com.crm.genericutility.JavaUtility;
import com.crm.genericutility.WebDriverUtility;

public class CreateContact {
	
	@Parameters("browser")
	@Test
	public void createContact() throws Throwable {
		
         System.out.println("created contact");
		
		/* Object for Java Utility Class */
		JavaUtility jLib = new JavaUtility();
		int ranNum = jLib.getRandomNum();
		/* Object for File Utility Class */ 
		FileUtility fLib = new FileUtility();
		/* Object for Excel Utility Class */
		ExcelUtility eLib = new ExcelUtility();
		/* Object for WebDriver Utility Class */
		WebDriverUtility wLib = new WebDriverUtility();

		/* read common data from properties file */
		String browser = fLib.getDataPropertyKeyValue("browser");
		String url = fLib.getDataPropertyKeyValue("url");
		String username = fLib.getDataPropertyKeyValue("username");
		String password = fLib.getDataPropertyKeyValue("password");

		// Fetching data from Excel "Sheet2"

		String contactName = eLib.getDataFromExcel("Sheet2", 3, 1) + "_" + ranNum;
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
			driver = new ChromeDriver();
		}

		// Launching browser
		driver.manage().window().maximize();
		driver.get(url);
		wLib.waitForPageToLoad(driver);

		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		// Login
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		// click on Organization link
		driver.findElement(By.linkText("Organizations")).click();
		// click on "+" image
		driver.findElement(By.xpath("//img[@alt = 'Create Organization...']")).click();
		// Create a new Org
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
		// Verification
		String actHeaderMsg = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		if (actHeaderMsg.contains(orgName)) {
			System.out.println(orgName + " creation Successful");
		} else {
			System.out.println(orgName + " creation Failed");
		}

		wLib.waitForElementToBeClickable(driver, driver.findElement(By.linkText("Contacts")));

		// Step 5: Navigate to Contact
		driver.findElement(By.linkText("Contacts")).click();
		// Step 6 : Navigate to create contact page
		driver.findElement(By.xpath("//img[@title ='Create Contact...']")).click();

		// Step 7 : Create a new contact
		driver.findElement(By.name("lastname")).sendKeys(contactName);
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		// Switching to window
		wLib.switchToWindow(driver, "Accounts");

		driver.findElement(By.id("search_txt")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='" + orgName + "']")).click();
		wLib.switchToWindow(driver, "Contacts");

		// Click on Save
		driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
		// Verification
		String actHeaderMsg1 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		if (actHeaderMsg1.contains(contactName)) {
			System.out.println(contactName + " creation Successful");
		} else {
			System.out.println(contactName + " creation Failed");
		}

		// Signing Out
		WebElement wb = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wLib.mouseOverOnElement(driver, wb);
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}
}
