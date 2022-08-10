package com.crm.seleniumframework.organization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.CreateNewOrganizationPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.OrganizationInformationPage;
import com.crm.seleniumframework.ObjectRepository.OrganizationPage;

@Listeners(com.crm.genericutility.ListernerImplementationClass.class)
public class CreateOrgTest extends BaseClass {
	
	@Test(groups = "smokeTest")
	public void createOrganization() throws Throwable {

		/* read common data from Excel file */
		String ExpectedOrgName = eUtil.getDataFromExcel("Sheet2", 1, 1) + "_" + jUtil.getRandomNum();

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
		
		
	}
}
