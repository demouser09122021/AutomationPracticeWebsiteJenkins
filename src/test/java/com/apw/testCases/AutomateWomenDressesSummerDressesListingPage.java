package com.apw.testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.DressesPage;
import com.apw.pageObjects.HomePage;

public class AutomateWomenDressesSummerDressesListingPage extends BaseClass{


	@Test(priority=1)
	public void verifySorting() throws InterruptedException, IOException {
		HomePage homePageObj = new HomePage(driver);
		homePageObj.clickOnWomenTab();
		logger.info("WomenPage Opened");
		homePageObj.clickOnDressesLink();
		logger.info("Clicked Dresses");
		DressesPage dressesPage = new DressesPage(driver);
		dressesPage.clickOnsummerDressesLink();
		logger.info("Clicked SummerDresses");
		Select drpCountry = new Select(driver.findElement(By.id("selectProductSort")));
		drpCountry.selectByVisibleText("In stock");
		List<WebElement> list = driver.findElements(By.xpath("//img[contains(@src,'http://automationpractice.com/img/loader.gif')]"));
		int count = list.size();
		Thread.sleep(2000);
		if(count<=1) {
			logger.info("Sorting feature is Working");
			Assert.assertTrue(true);
		} else if(count>1) {
			logger.warn("Sorting feature is Not Working");
			captureScreen(driver,"verifySorting");
			Assert.assertTrue(false);
		}
	}

	@Test(priority=2)
	public void verifyFilters() throws IOException, InterruptedException {
		HomePage homePageObj = new HomePage(driver);
		homePageObj.clickOnWomenTab();
		logger.info("WomenPage Opened");
		homePageObj.clickOnDressesLink();
		logger.info("Clicked Dresses");
		DressesPage dressesPage = new DressesPage(driver);
		dressesPage.clickOnsummerDressesLink();
		logger.info("Clicked SummerDresses");
		dressesPage.clickOnSizeCheckBox1();
		logger.info("Clicked on size S");
		List<WebElement> list = driver.findElements(By.xpath("//img[contains(@src,'http://automationpractice.com/img/loader.gif')]"));
		int count = list.size();
		Thread.sleep(2000);
		if(count<=1) {
			logger.info("Filters feature is Working");
			Assert.assertTrue(true);
		} else if(count>1) {
			logger.warn("Filters feature is Not Working");
			captureScreen(driver,"verifyFilters");
			Assert.assertTrue(false);
		}
	}
}
