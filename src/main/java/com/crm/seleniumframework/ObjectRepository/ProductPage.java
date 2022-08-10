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
public class ProductPage {

	/* Initialization of Web elements */
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(xpath = "//img[@alt ='Create Product...']")
	private WebElement createProductIcon;

	/* Declaration of Web Elements */
	public WebElement getCreateProductIcon() {
		return createProductIcon;
	}
	
	/* Business logic or Business Libraries */
	/**
	 * This method will click on Add Icon
	 */
	
	public void clickOnAddIcon() {
		createProductIcon.click();
	}
	
	
}
