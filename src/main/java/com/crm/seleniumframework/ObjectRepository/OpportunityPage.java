package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityPage {

	/* Initialization of Web elements */
	public OpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	private WebElement createOpportunityIcon;

	/* Getters method to use it in the Test script */
	public WebElement getCreateOpportunityIcon() {
		return createOpportunityIcon;
	}
	
	/* Business logic or Business Libraries */
	/**
	 * This method will click on Add Icon
	 */
	public void clickonAddIcon() {
		createOpportunityIcon.click();
	}
	
	
	
}
