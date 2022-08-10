 package com.crm.seleniumframework.product;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.seleniumframework.ObjectRepository.CreateNewProductPage;
import com.crm.seleniumframework.ObjectRepository.Homepage;
import com.crm.seleniumframework.ObjectRepository.ProductInformationPage;
import com.crm.seleniumframework.ObjectRepository.ProductPage;

public class CreateProductTest extends BaseClass {
	
	@Test(groups = "regressionTest")

	public void createProduct() throws Throwable {

		String ExpectedProductName = eUtil.getDataFromExcel("Sheet2", 7, 1) + "_" + jUtil.getRandomNum();
		
		// Navigate to Product
		Homepage homepage = new Homepage(driver);
		homepage.clickOnProduct();
		
		// Click on "+" icon
		ProductPage productpage = new ProductPage(driver);
		productpage.clickOnAddIcon();
        
		//Create a New Product
		
        CreateNewProductPage createProduct = new CreateNewProductPage(driver);	
        createProduct.createProduct(ExpectedProductName);
        
		//Product Information page
         ProductInformationPage productInfoPage = new ProductInformationPage(driver);
        String actualProductName = productInfoPage.getProductText();
        
        //Verification
        
        Assert.assertTrue(actualProductName.contains(ExpectedProductName));
		

	}

}
