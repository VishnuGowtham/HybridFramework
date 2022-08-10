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

public class OrganizationInformationPage {

	/* Initialization of Web elements */
	public OrganizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(className = "dvHeaderText")
	private WebElement organizationHeaderText;

	/* Getters method to use it in the Test script */
	public WebElement getOrganizationHeaderText() {
		return organizationHeaderText;
	}

	/* Business logic or Business Libraries */
	/**
	 * This method will return Organization HeaderText
	 * 
	 * @param orgName
	 * @return
	 */
	public String getOrganizationText() {
		return organizationHeaderText.getText();
	}

}
