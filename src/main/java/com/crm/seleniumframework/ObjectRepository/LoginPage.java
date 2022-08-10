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

public class LoginPage {

	/* Initialization of Web elements */
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Declaration of Web Elements */
	@FindBy(name = "user_name")
	private WebElement userNameTextField;

	@FindBy(name = "user_password")
	private WebElement passwordTextField;

	@FindBy(id = "submitButton")
	private WebElement loginButton;

	/* Getters method to use it in the Test script */
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	/* Business logic or Business Libraries */
	/**
	 * this method will do the logic action for application
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();

	}

}
