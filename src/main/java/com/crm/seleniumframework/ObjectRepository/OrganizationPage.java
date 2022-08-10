package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Vishnu
 *
 */

public class OrganizationPage {

	/* Initialization of Web elements */
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationIcon;

	/* Getters method to use it in the Test script */
	public WebElement getCreateOrganizationIcon() {
		return createOrganizationIcon;
	}

	/* Business logic or Business Libraries */
	
	/**
	 * This method will click on Add Icon
	 */
	public void clickonAddIcon() {
		createOrganizationIcon.click();
	}

}
