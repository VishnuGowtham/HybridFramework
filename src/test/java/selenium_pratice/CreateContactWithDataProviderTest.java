package selenium_pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactWithDataProviderTest {

	@Test(dataProvider = "getData")
	public void createContact(String name, String mobileNum) {
		//to excute the same script with multiple data
		// use @DataProvider annotation ==> it will provide data to @Test annotated method

		//Launching Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
        //Login 
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		// click on contact link
		driver.findElement(By.xpath("//a[. ='Contacts']")).click();
		// click on "+" image
		driver.findElement(By.xpath("//img[@alt = 'Create Contact...']")).click();
		// enter contact name
		driver.findElement(By.name("lastname")).sendKeys(name);
        driver.findElement(By.id("mobile")).sendKeys(mobileNum);
	    driver.findElement(By.xpath("//input[@title ='Save [Alt+S]']")).click();
         driver.close();
	    
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objArray = new Object[5][2];

		objArray[0][0] = "Saravanan";
		objArray[0][1] = "7894563212";

		objArray[1][0] = "Arvindhan";
		objArray[1][1] = "8667254410";

		objArray[2][0] = "SibiPrasanth";
		objArray[2][1] = "7744552233";

		objArray[3][0] = "Azar";
		objArray[3][1] = "6356214598";

		objArray[4][0] = "Gowtham";
		objArray[4][1] = "6321986757";

		return objArray;

	}
}
