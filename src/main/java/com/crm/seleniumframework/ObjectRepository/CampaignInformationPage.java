package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformationPage {

	/* Initialization of Web elements */
	public CampaignInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(className = "dvHeaderText")
	private WebElement campaignHeaderText;

	/* Getters method to use it in the Test script */
	public WebElement getCamapignHeaderText() {
		return campaignHeaderText;
	}

	/* Business logic or Business Libraries */

	/**
	 * This method will return Campaign Header Text
	 * 
	 * @return
	 */

	public String getCampaignText() {
		return campaignHeaderText.getText();
	}

}
