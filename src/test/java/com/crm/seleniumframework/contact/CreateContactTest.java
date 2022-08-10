 package com.crm.seleniumframework.contact;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.ContactInformationPage;
import com.crm.seleniumframework.ObjectRepository.ContactPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewContactPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;


public class CreateContactTest extends BaseClass {
	
	@Test(groups = "smokeTest")
	public void createcontact()  throws Throwable {

		// Fetching data from Excel "Sheet2"

		String ExpectedContactName = eUtil.getDataFromExcel("Sheet2", 4, 1) + "_" + jUtil.getRandomNum();

		/* click on Contact link */
		Homepage homepage = new Homepage(driver);
		homepage.clickOnContacts();

		// Step 6 : Navigate to create contact page
		ContactPage contactPage = new ContactPage(driver);
		contactPage.clickonAddIcon();

		// Step 7 : Create a new contact
		CreateNewContactPage createContact = new CreateNewContactPage(driver);
		createContact.createContact(ExpectedContactName);

		// Contact Information page
		ContactInformationPage contactInfoPage = new ContactInformationPage(driver);
		String actualContactName = contactInfoPage.getContactText();

		/* Verification for Contact Creation */
		
		Assert.assertTrue(actualContactName.contains(ExpectedContactName));
		

	}

}
