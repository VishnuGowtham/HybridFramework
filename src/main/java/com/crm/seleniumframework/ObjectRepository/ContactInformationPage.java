package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {

	/* Initialization of Web elements */
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(className =  "dvHeaderText")
	private WebElement contactHeaderText;

	/* Getters method to use it in the Test script */
	public WebElement getContactHeaderText() {
		return contactHeaderText;
	}
     
	/* Business logic or Business Libraries */
	
	public String getContactText() {
		return contactHeaderText.getText();
	}
	
	
}
