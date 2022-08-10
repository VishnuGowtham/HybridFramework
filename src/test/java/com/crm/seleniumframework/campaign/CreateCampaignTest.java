package com.crm.seleniumframework.campaign;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.CampaignInformationPage;
import com.crm.seleniumframework.ObjectRepository.CampaignPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewCampaignPage;
import com.crm.seleniumframework.ObjectRepository.CreateNewProductPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.ProductInformationPage;
import com.crm.seleniumframework.ObjectRepository.ProductPage;

public class CreateCampaignTest extends BaseClass {
	
	@Test(groups = "smokeTest")
	
	public void createCampaign() throws Throwable {

		// Navigate to Product
		Homepage homepage = new Homepage(driver);
		homepage.clickOnProduct();

		// Click on "+" icon
		ProductPage productpage = new ProductPage(driver);
		productpage.clickOnAddIcon();

		// Create New Product Page
		String ExpectedproductName = eUtil.getDataFromExcel("Sheet2", 10, 2) + "_" + jUtil.getRandomNum();
		CreateNewProductPage createProduct = new CreateNewProductPage(driver);
		createProduct.createProduct(ExpectedproductName);

		// Product Information page
		ProductInformationPage productInfoPage = new ProductInformationPage(driver);
		String actualProductName = productInfoPage.getProductText();

		// Verification
		
		Assert.assertTrue(actualProductName.contains(ExpectedproductName));

		/* Navigate to Campaigns */
		homepage.clickOnCampaign(driver);

		/* Campaign Page */
		/* Click on "+" icon */
		CampaignPage campaignPage = new CampaignPage(driver);
		campaignPage.clickonAddIcon();
		
		/* Create New Campaign */
		/* Fetching data from excel */
		String ExpectedCampaignName = eUtil.getDataFromExcel("Sheet2", 10, 1) + "_" + jUtil.getRandomNum();
		CreateNewCampaignPage createCampaign = new CreateNewCampaignPage(driver);
		createCampaign.createCampaignWithProduct(driver, ExpectedCampaignName, ExpectedproductName);

		/* Campaign Info page */
		CampaignInformationPage campaignInfoPage = new CampaignInformationPage(driver);
		String actualCampaignName = campaignInfoPage.getCampaignText();

		/* Verification */
		
		Assert.assertTrue(actualCampaignName.contains(ExpectedCampaignName));
		

	}

}
