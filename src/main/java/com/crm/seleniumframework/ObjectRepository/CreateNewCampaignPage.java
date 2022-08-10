package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericutility.ExcelUtility;
import com.crm.genericutility.WebDriverUtility;

/**
 * 
 * @author Vishnu
 *
 */

public class CreateNewCampaignPage extends WebDriverUtility {

	/* Initialization of Web elements */
	public CreateNewCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(name = "campaignname")
	private WebElement campaignNameTextField;

	@FindBy(xpath = "//img[@title = 'Select']")
	private WebElement productLookUpImage;

	@FindBy(id = "search_txt")
	private WebElement searchTextField;

	@FindBy(name = "search")
	private WebElement searchButton;

	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement saveButton;

	/* Getters method to use it in the Test script */
	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getProductLookUpImage() {
		return productLookUpImage;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	/* Business logic or Business Libraries */
	/**
	 * This method is used to create Campaign with Product
	 * 
	 * @param driver
	 * @param campaignName
	 * @param productName
	 * @throws Throwable 
	 */

	public void createCampaignWithProduct(WebDriver driver, String campaignName, String productName) throws Throwable {
		campaignNameTextField.sendKeys(campaignName);
		productLookUpImage.click();
		/* Fetching data from Excel sheet */
		ExcelUtility eLib = new ExcelUtility();
		String childWindowID = eLib.getDataFromExcel("Sheet2", 10, 3);
		switchToWindow(driver, childWindowID);
		searchTextField.sendKeys(productName);
		searchButton.click();
		driver.findElement(By.xpath("//a[text()='" + productName + "']")).click();
		/* Fetching data from Excel sheet */
		String mainWindowID = eLib.getDataFromExcel("Sheet2", 11, 3);
		switchToWindow(driver, mainWindowID);
		saveButton.click();
	}

}
