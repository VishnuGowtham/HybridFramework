package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {

	/* Initialization of Web elements */
	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(name = "productname")
	private WebElement productNameTextField;
	
	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement saveButton;

	/* Getters method to use it in the Test script */
	public WebElement getProductNameTextField() {
		return productNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	
	/* Business logic or Business Libraries */
	/**
	 * This method is create Product
	 * @param productName
	 */
	public void createProduct(String productName) {
		productNameTextField.sendKeys(productName);
		saveButton.click();
	}
	
	
	
}
