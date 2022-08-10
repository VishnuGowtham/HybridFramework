package com.crm.seleniumframework.opportunities;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.CreateNewOpportunityPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewOrganizationPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.OpportunityInformationPage;
import com.crm.seleniumframework.ObjectRepository.OpportunityPage;
import com.crm.seleniumframework.ObjectRepository.OrganizationInformationPage;
import com.crm.seleniumframework.ObjectRepository.OrganizationPage;

public class CreateOpportunitywithAssignedtoGroupAsSupportGroupTest extends BaseClass {

	@Test(groups = "regressionTest")

	public void createOpportunitywithGroupAsSupportGroup() throws Throwable {

		String ExpectedOrgName = eUtil.getDataFromExcel("Sheet2", 16, 3) + "_" + jUtil.getRandomNum();

		// click on Organization link
		Homepage homepage = new Homepage(driver);
		homepage.clickOnOrgaization();

		// click on "+" image
		OrganizationPage organizationPage = new OrganizationPage(driver);
		organizationPage.clickonAddIcon();

		// Create Organization name and Industry
		CreateNewOrganizationPage createOrg = new CreateNewOrganizationPage(driver);
		createOrg.createOrganization(ExpectedOrgName);

		// Organization information page
		OrganizationInformationPage orgInfoPage = new OrganizationInformationPage(driver);
		String actualOrgName = orgInfoPage.getOrganizationText();

		/* Verification */
		Assert.assertTrue(actualOrgName.contains(ExpectedOrgName));

		// click on Opportunity link
		homepage.clickOnOpportunity();

		// click on "+" image
		OpportunityPage opportunityPage = new OpportunityPage(driver);
		opportunityPage.clickonAddIcon();

		// Create New Opportunity
		String ExpectedOpportunityName = eUtil.getDataFromExcel("Sheet2", 16, 1) + "_" + jUtil.getRandomNum();
		CreateNewOpportunityPage createOpportunityPage = new CreateNewOpportunityPage(driver);
		createOpportunityPage.createOpportunityWithGroupAsSupportGroup(driver, ExpectedOpportunityName,
				ExpectedOrgName);

		// Opportunity Information Page
		OpportunityInformationPage opportunityInfoPage = new OpportunityInformationPage(driver);
		String actualOpportunityName = opportunityInfoPage.getOpportunityText();

		/* Verification for Contact Creation */
		Assert.assertTrue(actualOpportunityName.contains(ExpectedOpportunityName));
		
	}
}