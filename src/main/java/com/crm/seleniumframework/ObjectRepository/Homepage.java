package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericutility.WebDriverUtility;

/**
 * 
 * @author Vishnu
 *
 */
public class Homepage extends WebDriverUtility {

	/* Initialization of Web elements */
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(linkText = "More")
	private WebElement moreLink;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;

	@FindBy(xpath = "//img[@src = 'themes/softed/images/user.PNG']")
	private WebElement signOutIconImage;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	/* Getters method to use it in the Test script */

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}
	
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}
	
	public WebElement	 getSignOutIconImage() {
		return signOutIconImage;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	/* Business logic or Business Libraries */
	/**
	 * This method will click on Organization
	 * 
	 */
	public void clickOnOrgaization() {
		organizationsLink.click();
	}

	/**
	 * This method will click on Contacts
	 * 
	 */
	public void clickOnContacts() {
		contactsLink.click();
	}

	/**
	 * This method will click on Products
	 * 
	 */
	public void clickOnProduct() {
		productsLink.click();
	}
     
	/**
	 * This method will click on Opportunity
	 */
	public void clickOnOpportunity() {
		opportunitiesLink.click();
	}
	
	public void clickOnCampaign(WebDriver driver) {
		mouseOverOnElement(driver, moreLink);
		campaignsLink.click();
	}
	
	/**
	 * This method will logout the application
	 * 
	 */
	public void logout(WebDriver driver) {
		mouseOverOnElement(driver, signOutIconImage);
		signOutLink.click();
	}

}
