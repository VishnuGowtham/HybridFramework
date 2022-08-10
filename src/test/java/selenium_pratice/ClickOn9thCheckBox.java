package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOn9thCheckBox {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root", Keys.ENTER);

		driver.findElement(By.linkText("Organizations")).click();

		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[11]/td[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class = 'lvt small']"
				+ "/tbody/tr[11]/td[1]")).click();
		
		driver.findElement(By.linkText("del")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
