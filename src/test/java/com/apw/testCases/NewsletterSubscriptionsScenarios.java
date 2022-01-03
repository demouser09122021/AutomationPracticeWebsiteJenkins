package com.apw.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.HomePage;

public class NewsletterSubscriptionsScenarios extends BaseClass{

	@Test
	public void newsletterSubscription() throws IOException {
		HomePage homePage = new HomePage(driver);
		String email=randomestring()+"@gmail.com";
		homePage.setEmailId(email);
		homePage.submitNewsletterBtn();
		String PassedEmailMessage = homePage.newsletterDangerAlertMessage();
		String FailedEmailMessage = homePage.newsletterDangerAlertMessage();
		System.out.println(PassedEmailMessage);
		System.out.println(FailedEmailMessage);
		if(PassedEmailMessage.equals("You have successfully subscribed to this newsletter.")) {
			Assert.assertTrue(true);
			logger.info("Newsletter : You have successfully subscribed to this newsletter.");
		} else if(FailedEmailMessage.equals("This email address is already registered.")) {
			captureScreen(driver,"newsletterSubscription");
			Assert.assertTrue(false);
			logger.warn(" Newsletter : This email address is already registered.");
		} else if(FailedEmailMessage.equals("Invalid email address.")) {
			captureScreen(driver,"newsletterSubscription");
			Assert.assertTrue(false);
			logger.warn("Invalid email address.");
		}
	}
}
