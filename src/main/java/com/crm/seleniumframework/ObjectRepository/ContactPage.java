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
public class ContactPage {
	
	/* Initialization of Web elements */
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(xpath = "//img[@title ='Create Contact...']")
	private WebElement createContactIcon;

	
	/* Getters method to use it in the Test script */
	public WebElement getCreateContactIcon() {
		return createContactIcon;
	}
	
	/* Business logic or Business Libraries */
	/**
	 * This method will click on Add Icon
	 */
	public void clickonAddIcon() {
		createContactIcon.click();
	}
	

	
	
	
	
	
	

}
