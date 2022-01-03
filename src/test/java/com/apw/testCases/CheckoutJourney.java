package com.apw.testCases;

import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.CheckoutPage;
import com.apw.pageObjects.HomePage;
import com.apw.pageObjects.TshirtsPage;

public class CheckoutJourney extends BaseClass{
	@Test
	public void checkoutJourney() throws InterruptedException {

		HomePage homePageObj = new HomePage(driver);
		TshirtsPage tShirtsPageobj = new TshirtsPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);

		homePageObj.clickOnTshirtTab();
		tShirtsPageobj.clickOnFadedShortSleeveTshirtsProduct();
		checkoutPage.clickOnBlueColor();
		checkoutPage.clickOnAddToCartBtn();
		checkoutPage.clickOnProceedToCheckoutBtn();
		checkoutPage.clickOnProceedToCheckoutBtn2();
		checkoutPage.enterCheckoutPageEmailId(username);
		checkoutPage.enterCheckoutPagePassword(password);
		checkoutPage.clickOnCheckoutPageSubmitLoginBtn();
		logger.info("SubmitLogin Btn Clicked");
		Thread.sleep(3000);
		checkoutPage.clickOnproceedToCheckoutBtn3();
		logger.info("Proceed To Checkout Btn Clicked");
		checkoutPage.selectTermsOfServiceCheckBox();
		logger.info("Terms Of Service CheckBox is Selected");
		checkoutPage.clickOnproceedToCheckoutBtn4();
		logger.info("Proceed To Checkout Btn Clicked");
		checkoutPage.clickOnPayByBankWire();
		logger.info("Pay By Bank Wire Clicked");
		checkoutPage.clickOnConfirmMyOrder();
		logger.info("Order Confirmed Btn Clicked");
		System.out.println("-----------------");
		Thread.sleep(3000);
	}
}
