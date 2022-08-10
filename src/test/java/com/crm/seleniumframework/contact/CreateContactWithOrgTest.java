package com.crm.seleniumframework.contact;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.ContactInformationPage;
import com.crm.seleniumframework.ObjectRepository.ContactPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewContactPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewOrganizationPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.OrganizationInformationPage;
import com.crm.seleniumframework.ObjectRepository.OrganizationPage;

public class CreateContactWithOrgTest extends BaseClass {

	@Test(groups = "regressionTest")
	public void createContactwithOrg() throws Throwable {

		// Fetching data from Excel "Sheet2"

		String ExpectedContactName = eUtil.getDataFromExcel("Sheet2", 4, 1) + "_" + jUtil.getRandomNum();
		String ExpectedOrgName = eUtil.getDataFromExcel("Sheet2", 4, 2) + "_" + jUtil.getRandomNum();

		/* click on Organization link */
		Homepage homepage = new Homepage(driver);
		homepage.clickOnOrgaization();

		/* click on "+" image */
		OrganizationPage organizationPage = new OrganizationPage(driver);
		organizationPage.clickonAddIcon();

		/* Create a new Organization */
		CreateNewOrganizationPage createOrg = new CreateNewOrganizationPage(driver);
		createOrg.createOrganization(ExpectedOrgName);

		/* Organization information page */
		OrganizationInformationPage orgInfoPage = new OrganizationInformationPage(driver);
		String actualOrgName = orgInfoPage.getOrganizationText();

		/* Verification for Organization creation */
		Assert.assertTrue(actualOrgName.contains(ExpectedOrgName));
		/*
		 * if (actualOrgName.contains(ExpectedOrgName)) {
		 * 
		 * System.out.println("Organization is created sucessfully"); } else {
		 * System.out.println("Organization creation Failed!!!"); }
		 */
		// Step 5: Navigate to Contact
		homepage.clickOnContacts();

		// Step 6 : Navigate to create contact page
		ContactPage contactPage = new ContactPage(driver);
		contactPage.clickonAddIcon();

		// Step 7 : Create a new contact
		CreateNewContactPage createContact = new CreateNewContactPage(driver);
		createContact.createContactWithOrganization(driver, ExpectedContactName, ExpectedOrgName);

		// Contact Information page
		ContactInformationPage contactInfoPage = new ContactInformationPage(driver);
		String actualContactName = contactInfoPage.getContactText();

		/* Verification for Contact Creation */
		Assert.assertTrue(actualContactName.contains(ExpectedContactName));
		

	}

}
