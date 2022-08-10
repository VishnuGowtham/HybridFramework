package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericutility.WebDriverUtility;
/**
 * 
 * @author Vishnu
 *
 */

public class CreateNewOrganizationPage extends WebDriverUtility {
	
	/* Initialization of Web elements */
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(name = "accountname")
	private WebElement organizationNameTextField;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement saveButton;

	/* Getters method to use it in the Test script */
	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/* Business logic or Business Libraries */
	
	/**
	 * This method is used to create organization
	 * @param organizationName
	 */
	
	public void createOrganization(String organizationName) {
		organizationNameTextField.sendKeys(organizationName);
		saveButton.click();
	}
	
	/**
	 * This method is used to create organization with industry
	 * @param organizationName
	 * @param dropDownValue
	 */
	
	public void createOrganizationWithIndustry(String organizationName, String dropDownValue) {
		organizationNameTextField.sendKeys(organizationName);
		select(industryDropDown, dropDownValue);
		saveButton.click();
		
	}	
}
