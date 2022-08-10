package com.crm.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver = null;
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public static WebDriver sDriver;

	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void beforesuite() {
		System.out.println("Database connection");
	}

	@BeforeTest(groups = {"smokeTest","regressionTest"})
	public void beforetest() {
		System.out.println("execute script in parallel mode");
	}
	
	
  //  @Parameters("browser")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void beforeclass() throws Throwable {

		String browser = fUtil.getDataPropertyKeyValue("browser");
		String url = fUtil.getDataPropertyKeyValue("url");

		if (browser.equalsIgnoreCase("chrome")) {
			//WebDriverManager.chrome
			driver = new ChromeDriver();
			System.out.println("launched browser is " + browser);
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("launched browser is " + browser);
		} else {
			System.out.println("Specify valid browser");
		}

		
		driver.get(url);
		driver.manage().window().maximize();
		wUtil.waitForPageToLoad(driver);
		sDriver = driver;
	}

	@BeforeMethod(groups = {"smokeTest","regressionTest"})	
	public void beforeMethod() throws Throwable {

		String username = fUtil.getDataPropertyKeyValue("username");
		String password = fUtil.getDataPropertyKeyValue("password");
		// Login
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(username, password);
	}
	
	@AfterMethod(groups = {"smokeTest","regressionTest"})
	public void aftermethod() {
		Homepage homepage = new Homepage(driver);
		homepage.logout(driver);
	}

	@AfterClass(groups = {"smokeTest","regressionTest"})
	public void afterclasss() {
		driver.quit();
	}
    	
	@AfterTest(groups = {"smokeTest","regressionTest"})
	public void aftertest() {
		System.out.println("close parallel mode execution");
	}
	
	@AfterSuite(groups = {"smokeTest","regressionTest"})
	public void aftersuite() {
		System.out.println("close database connection");
	}
	
}
