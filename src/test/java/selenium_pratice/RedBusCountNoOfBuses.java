package selenium_pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusCountNoOfBuses {

	@Test
	public void redbus() throws InterruptedException {

		String month = "Aug 2022";
		String date = "2";

		String from = "Mumbai";
		String To = "Bangalore";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("src")).sendKeys(from);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/child::li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys(To);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/child::li[1]")).click();

		driver.findElement(By.id("onward_cal")).click();

		 while(true) {  //while(true) for (;;)
			try {
				driver.findElement(
						By.xpath("//table[@class='rb-monthTable first last']" + "/tbody/tr/td[contains(text(),'" + month
								+ "')]" + "/following::tr/td[contains(text(),'" + date + "')]"))
						.click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//table[@class = 'rb-monthTable first last']/tbody/tr/td[@class='next']")).click();

			}
		}
		driver.findElement(By.xpath("//button[. ='Search Buses']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> list;
		List<WebElement> list1;

		while (true) {
			list = driver.findElements(By.xpath("//div[@class='clearfix bus-item']"));
			js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
			list1 = driver.findElements(By.xpath("//div[@class='clearfix bus-item']"));

			if (list.size() == list1.size()) {
				break;
			}
		}

		System.out.println(list.size());

	}
}
