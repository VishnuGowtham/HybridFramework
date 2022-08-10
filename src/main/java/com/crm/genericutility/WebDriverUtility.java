package com.crm.genericutility;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Vishnu
 *
 */
public class WebDriverUtility {

	/**
	 * wait for page to load before identifying any synchronized element in DOM
	 * [HTML-Document]
	 * 
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	/**
	 * wait for page to load before identifying any desynchronized [java scripts
	 * actions ] element in DOM [HTML-DOCUMENT]
	 * @param driver
	 */
	public void waitForPagetoLoadForJSElement(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
	

	/**
	 * used to wait for element to be clickable in GUI , & check for specific
	 * element for every 500 milli seconds
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * 
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String wID = it.next();
			driver.switchTo().window(wID);
			String currentWindowTitle = driver.getTitle();
			if (currentWindowTitle.contains(partialWindowTitle)) {
				break;
			}
		}
	}

	/**
	 * used to select the value from the dropDown box based on Index
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	/**
	 * used to select the value from the dropDown box based on value/Option based on
	 * GUI
	 * 
	 * @param element
	 * @param value
	 */
	public void select(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	/**
	 * used to place mouse cursor on the specified element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	
	}
	
	/**
	 * used to switch to Alert Window & click on OK button.
	 * @param driver
	 */
	
	public void switchToAlertWindowAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 *used to switch to Alert Window & click on CANCEL button. 
	 * @param driver
	 */
	
	public void switchToAlertWindowAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method is used to take ScreenShot
	 * @param driver
	 * @param screenshotName
	 * @throws Throwable
	 */
    public String takeScreenshot(WebDriver driver, String testCaseName) throws Throwable {
    	JavaUtility jUtil = new JavaUtility();
    	String filepath = "./errorshot/"+testCaseName+jUtil.getSystemDateAndTime()+ ".png";
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File destination = new File(filepath);
    	FileUtils.copyFile(source, destination);
    	return destination.getAbsolutePath();
    	
    }


}
