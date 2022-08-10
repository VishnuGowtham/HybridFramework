package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {
	
	/* Initialization of Web elements */
	public ProductInformationPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);	
	}
	
	/* Declaration of Web Elements */
	@FindBy(className = "lvtHeaderText")
	private WebElement productHeaderText;
	
	/* Getters method to use it in the Test script */
	public WebElement getProductHeaderText() {
		return productHeaderText;
	}
	
	
	/* Business logic or Business Libraries */
	/**
	 * This method will return Product HeaderText
	 * @return
	 */
	public String getProductText() {
		return productHeaderText.getText();
	
	}
}
