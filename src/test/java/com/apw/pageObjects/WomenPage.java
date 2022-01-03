package com.apw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {

	WebDriver ldriver;
	public WomenPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[contains(text(),'Women  ')]")
	@CacheLookup
	WebElement womenTextOnWomenPage;

	@FindBy(xpath="//*[@class='price product-price']")
	@CacheLookup
	WebElement productPrice;



	public boolean isWomenTextPresentOnWomenPage() {
		return womenTextOnWomenPage.isDisplayed();
	}
	
	
}
