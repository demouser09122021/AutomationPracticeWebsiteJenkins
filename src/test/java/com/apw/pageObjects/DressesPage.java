package com.apw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage {
	WebDriver ldriver;
	public DressesPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[contains(text(),'Dresses  ')]")
	@CacheLookup
	WebElement dressesTextOnWomenPage;
	
	@FindBy(linkText="Summer Dresses")
	@CacheLookup
	WebElement summerDressesLink;
	
	@FindBy(id="selectProductSort")
	@CacheLookup
	WebElement selectProductSort;
	
	@FindBy(id="layered_id_attribute_group_1")
	@CacheLookup
	WebElement sizeCheckBox1;
	
	public boolean isDressesTextPresentOnWomenPage() {
		return dressesTextOnWomenPage.isDisplayed();
	}
	public void clickOnsummerDressesLink() {
		summerDressesLink.click();
	}
	public void clickOnSizeCheckBox1() {
		sizeCheckBox1.click();
	}
}
