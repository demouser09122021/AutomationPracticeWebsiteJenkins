package com.apw.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.DressesPage;
import com.apw.pageObjects.HomePage;
import com.apw.pageObjects.TshirtsPage;
import com.apw.pageObjects.WomenPage;

public class NavigateToMultiplePages extends BaseClass{


	@Test(priority=1)
	public void navigateToWomenPage() throws InterruptedException, IOException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnWomenTab();
		//Thread.sleep(3000);
		WomenPage womenPageObj = new WomenPage(driver);
		boolean WomenText = womenPageObj.isWomenTextPresentOnWomenPage();
		if(WomenText) {
			Assert.assertTrue(true);
			logger.info("women page is opened");
		} else {
			captureScreen(driver,"navigateToWomenPage");
			Assert.assertTrue(false);
			logger.warn("women page is not opened");
		}
	}
	@Test(priority=2)
	public void navigateToDressesPage() throws InterruptedException, IOException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnDressesTab();
		//Thread.sleep(3000);
		DressesPage dressesPageObj = new DressesPage(driver);
		boolean DressesText = dressesPageObj.isDressesTextPresentOnWomenPage();
		if(DressesText) {
			Assert.assertTrue(true);
			logger.info("Dresses page is opened");
		} else {
			captureScreen(driver,"navigateToDressesPage");
			Assert.assertTrue(false);
			logger.warn("Dresses page is not opened");
		}
	}
	@Test(priority=3)
	public void navigateToTshirtPage() throws InterruptedException, IOException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnTshirtTab();
		//Thread.sleep(3000);
		TshirtsPage tshirtsPageObj = new TshirtsPage(driver);
		boolean TshirtsText = tshirtsPageObj.isTshirtTextPresentOnWomenPage();
		if(TshirtsText) {
			Assert.assertTrue(true);
			logger.info("Tshirt page is opened");
		} else {
			captureScreen(driver,"navigateToTshirtPage");
			Assert.assertTrue(false);
			logger.warn("Tshirt page is not opened");
		}
	}
	@Test(priority=4)
	public void navigateToHomePage() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.clickOnHeaderLogo();
		//Thread.sleep(3000);


	}



}
