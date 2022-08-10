package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityInformationPage {

	/* Initialization of Web elements */
	public OpportunityInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(className = "dvHeaderText")
	private WebElement opportunityHeaderText;

	/* Getters method to use it in the Test script */
	public WebElement getOpportunityHeaderText() {
		return opportunityHeaderText;
	}
	
	/* Business logic or Business Libraries */
	/**
	 * This method will return Opportunity HeaderText
	 * @return
	 */
	public String getOpportunityText() {
		return opportunityHeaderText.getText();
	}
}
