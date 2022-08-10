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

public class CampaignPage {
	
	/* Initialization of Web elements */
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement createCampaignIcon;
	
	/* Getters method to use it in the Test script */
	public WebElement getCreateCampaignIcon() {
		return createCampaignIcon;	
	}
	
	
	/* Business logic or Business Libraries */
	/**
	 * This method will click on Add Icon
	 */
	public void clickonAddIcon() {
		createCampaignIcon.click();
	}
	
}
