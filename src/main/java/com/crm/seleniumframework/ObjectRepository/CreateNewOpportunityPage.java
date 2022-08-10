package com.crm.seleniumframework.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericutility.ExcelUtility;
import com.crm.genericutility.WebDriverUtility;

public class CreateNewOpportunityPage extends WebDriverUtility{

	/* Initialization of Web elements */
	public CreateNewOpportunityPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/* Declaration of Web Elements */
	@FindBy(name = "potentialname")
	private WebElement opportunityNameTextField;
	
	@FindBy(xpath = "//input[@name='related_to_display']/following-sibling::img")
	private WebElement opportunityLookUpImage;
	
	@FindBy(id = "search_txt")
	private WebElement searchTextField;
	
	@FindBy(name = "search")
	private WebElement searchButton;
	
	@FindBy(xpath = "//input[@name='assigntype']/following-sibling::input")
	private WebElement groupRadioButton;
	
	@FindBy(xpath = "//select[@name = 'assigned_group_id']")
	private WebElement groupDropDown;
	
	@FindBy(xpath = "//input[@title ='Save [Alt+S]']")
	private WebElement saveButton;
	
     // Getters Method
	public WebElement getOpportunityNameTextField() {
		return opportunityNameTextField;
	}

	public WebElement getOpportunityLookUpImage() {
		return opportunityLookUpImage;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}
	
	public WebElement getGroupDropDown() {
		return groupDropDown;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/* Business logic or Business Libraries */
	/**
	 * This method use to create Opportunity with GroupAs Marketing Group
	 * @param driver
	 * @param opportunityName
	 * @param organizationName
	 * @throws Throwable 
	 */
	
	public void createOpportunityWithGroupAsMarketingGroup
	(WebDriver driver , String opportunityName, String organizationName) throws Throwable {
		
		opportunityNameTextField.sendKeys(opportunityName);
		opportunityLookUpImage.click();
		/* Fetching data from Excel sheet */
		ExcelUtility eLib = new ExcelUtility();
		String childWindowID = eLib.getDataFromExcel("Sheet2", 13, 4);
		switchToWindow(driver, childWindowID);
		searchTextField.sendKeys(organizationName);
		searchButton.click();
		driver.findElement(By.xpath("//a[text()= '"+organizationName+"']")).click();
		/* Fetching data from Excel sheet */
		String mainWindowID = eLib.getDataFromExcel("Sheet2", 14, 4);
		switchToWindow(driver, mainWindowID);
		groupRadioButton.click();
		/* Fetching data from Excel sheet */
		String assignedToGroup = eLib.getDataFromExcel("Sheet2", 13, 2);
		select(groupDropDown, assignedToGroup);
		saveButton.click();		
	}
	
	/**
	 * This method use to create Opportunity with GroupAs Team Selling
	 * @param driver
	 * @param opportunityName
	 * @param organizationName
	 * @throws Throwable 
	 */
	public void createOpportunityWithGroupAsSupportGroup
	(WebDriver driver , String opportunityName, String organizationName) throws Throwable {
		
		opportunityNameTextField.sendKeys(opportunityName);
		opportunityLookUpImage.click();
		/* Fetching data from Excel sheet */
		ExcelUtility eLib = new ExcelUtility();
		String childWindowID = eLib.getDataFromExcel("Sheet2", 16, 4);
		switchToWindow(driver, childWindowID);
		searchTextField.sendKeys(organizationName);
		searchButton.click();
		driver.findElement(By.xpath("//a[text()= '"+organizationName+"']")).click();
		/* Fetching data from Excel sheet */
		String mainWindowID = eLib.getDataFromExcel("Sheet2", 17, 4);
		switchToWindow(driver, mainWindowID);
		groupRadioButton.click();
		/* Fetching data from Excel sheet */
		String assignedToGroup = eLib.getDataFromExcel("Sheet2", 16, 2);
		select(groupDropDown, assignedToGroup);
		saveButton.click();	
			
	}
}
