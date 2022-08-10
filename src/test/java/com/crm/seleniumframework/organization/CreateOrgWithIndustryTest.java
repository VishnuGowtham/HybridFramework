package com.crm.seleniumframework.organization;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.CreateNewOrganizationPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.OrganizationInformationPage;
import com.crm.seleniumframework.ObjectRepository.OrganizationPage;

public class CreateOrgWithIndustryTest extends BaseClass {
	
	@Test(groups = "regressionTest")
	public void createOrganizationWithIndustry() throws Throwable {
        		
		/* read common data from Excel file */
		String ExpectedOrgName = eUtil.getDataFromExcel("Sheet2", 1, 1) + "_" + jUtil.getRandomNum();
		String industryName = eUtil.getDataFromExcel("Sheet2", 1, 2);

		// click on Organization link
		Homepage homepage = new Homepage(driver);
		homepage.clickOnOrgaization();

		// click on "+" image
		OrganizationPage organizationPage = new OrganizationPage(driver);
		organizationPage.clickonAddIcon();

		// Create Organization name and Industry 
		CreateNewOrganizationPage createOrg = new CreateNewOrganizationPage(driver);
		createOrg.createOrganizationWithIndustry(ExpectedOrgName, industryName);

		// Organization information page
		OrganizationInformationPage orgInfoPage = new OrganizationInformationPage(driver);
		String actualOrgName = orgInfoPage.getOrganizationText();

		/* Verification */
		
		Assert.assertTrue(actualOrgName.contains(ExpectedOrgName));
		

	}

}
