package com.apw.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.HomePage;

public class VerificationOfHeaderAndFooter extends BaseClass{


	@Test(priority=1)
	public void  homePageTitleVerification() throws IOException {
		if(driver.getTitle().equals(websiteTitle)){
			Assert.assertTrue(true);
			logger.info("title is present");
		} else {
			captureScreen(driver,"homePageVerificationOfHeaderAndFooter");
			Assert.assertTrue(false);
			logger.info("title is not present");
		}
	}
	@Test(priority=2)
	public void  homePageSignInBtnVerification() throws IOException {
		HomePage homePage = new HomePage(driver);
		boolean SignInBtn = homePage.signInBtn();
		if(SignInBtn) {
			Assert.assertTrue(true);
			logger.info("sign button is present");
		} else {
			captureScreen(driver,"homePageSignInBtnVerification");
			Assert.assertTrue(false);
			logger.warn("sign button is not present");
		}
	}
	@Test(priority=3)
	public void  homePageHeaderLogoVerification() throws IOException {
		HomePage homePage = new HomePage(driver);
		boolean HeaderLogo = homePage.headerLogo();
		if(HeaderLogo) {
			Assert.assertTrue(true);
			logger.info("header logo is present");
			System.out.println("Working");
		} else {
			captureScreen(driver,"homePageHeaderLogoVerification");
			Assert.assertTrue(false);
			logger.info("header logo is not present");
		}
	}
	@Test(priority=4)
	public void homePageNewsLetterTextVerification() throws IOException {
		HomePage homePage = new HomePage(driver);
		boolean NewsLetterText = homePage.newsLetterText();
		if(NewsLetterText) {
			Assert.assertTrue(true);
			logger.info("NewsLetter Text is present");
		} else {
			captureScreen(driver,"homePageNewsLetterTextVerification");
			Assert.assertTrue(false);
			logger.warn("NewsLetter Text is not present");
		}
	}
	@Test(priority=5)
	public void  homePageTwitterLogoVerification() throws IOException {
		HomePage homePage = new HomePage(driver);
		boolean TwitterLogo = homePage.twitterLogo();
		if(TwitterLogo) {
			Assert.assertTrue(true);
			logger.info("Twitter Logo is present");
		} else {
			captureScreen(driver,"homePageNewsLetterTextVerification");
			Assert.assertTrue(false);
			logger.warn("Twitter Logo is not present");
		}
	}
}
