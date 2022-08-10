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
public class CreateNewContactPage extends WebDriverUtility {

	/* Initialization of Web elements */
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(name = "lastname")
	private WebElement contactLastNameTextField;

	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img")
	private WebElement organizationLookUpImage;

	@FindBy(id = "search_txt")
	private WebElement searchTextField;

	@FindBy(name = "search")
	private WebElement searchButton;

	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement saveButton;

	/* Getters method to use it in the Test script */

	public WebElement getContactLastNameTextField() {
		return contactLastNameTextField;
	}

	public WebElement getOrganizationLookUpImage() {
		return organizationLookUpImage;
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
	 * This method is create Contact
	 * 
	 * @param contactName
	 */

	public void createContact(String contactName) {
		contactLastNameTextField.sendKeys(contactName);
		saveButton.click();
	}

	/**
	 * This method is used to create Contact with Organization
	 * 
	 * @param contactName
	 * @param organizationName
	 * @throws Throwable 
	 */

	public void createContactWithOrganization(WebDriver driver, String contactName, String organizationName) throws Throwable {

		contactLastNameTextField.sendKeys(contactName);
		organizationLookUpImage.click();
		/* Fetching data from Excel sheet */
		ExcelUtility eLib = new ExcelUtility();
		String childWindowID = eLib.getDataFromExcel("Sheet2", 4, 3);
		switchToWindow(driver, childWindowID);
		searchTextField.sendKeys(organizationName);
		searchButton.click();
		driver.findElement(By.xpath("//a[text()='"+organizationName+"']")).click();
		/* Fetching data from Excel sheet */
		String mainWindowID = eLib.getDataFromExcel("Sheet2", 5, 3);
		switchToWindow(driver, mainWindowID);
		saveButton.click();
	}

}
