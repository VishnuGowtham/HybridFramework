package selenium_pratice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_PropFile {

	public static void main(String[] args) throws Throwable {
		// Login to vtiger
		FileInputStream fis = new FileInputStream("./src/main/resources/commanData/credentials.properties");
		Properties prop_obj = new Properties();
		prop_obj.load(fis);
		String browser = prop_obj.getProperty("browser");
		String url = prop_obj.getProperty("url");
		String userName = prop_obj.getProperty("username");
		String pwd = prop_obj.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(pwd);
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
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(userName);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		// Signing Out
		WebElement wb = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();

	}

}
