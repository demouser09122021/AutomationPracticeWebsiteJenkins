package com.apw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsPage {
	WebDriver ldriver;
	public TshirtsPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[contains(text(),'T-shirts  ')]")
	@CacheLookup
	WebElement tShirtTextOnWomenPage;

	@FindBy(linkText="Faded Short Sleeve T-shirts")
	@CacheLookup
	WebElement fadedShortSleeveTshirtsProduct;
	
	
	
	public boolean isTshirtTextPresentOnWomenPage() {
		return tShirtTextOnWomenPage.isDisplayed();
	}
	public void clickOnFadedShortSleeveTshirtsProduct() {
		fadedShortSleeveTshirtsProduct.click();
	}
	
}
