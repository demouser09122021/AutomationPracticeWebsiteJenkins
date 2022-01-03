package com.apw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public HomePage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	// WebElements in Header

	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	@CacheLookup
	WebElement signIn;

	@FindBy(xpath="//*[@id='header_logo']")
	@CacheLookup
	WebElement headerLogo;

	@FindBy(linkText="Women")
	@CacheLookup
	WebElement womenTab;

	@FindBy(linkText="Dresses")
	@CacheLookup
	WebElement dressesTab;

	@FindBy(linkText="T-SHIRTS")
	@CacheLookup
	WebElement tShirtsTab;

	@FindBy(xpath="//*[@class='alert alert-success']")
	@CacheLookup
	WebElement newsletterSuccessAlertMessage;

	@FindBy(xpath="//*[@class='alert alert-danger']")
	@CacheLookup
	WebElement newsletterDangerAlertMessage;

	@FindBy(xpath="//*[@name='submitNewsletter']")
	@CacheLookup
	WebElement submitNewsletterBtn;

	@FindBy(linkText="Dresses")
	@CacheLookup
	WebElement dressesLink;

	
	// WebElement in Footer

	@FindBy(xpath="//h4[contains(text(),'Newsletter')]")
	@CacheLookup
	WebElement newsLetterText;

	@FindBy(xpath="//*[@class='twitter']")
	@CacheLookup
	WebElement twitterLogo;

	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	WebElement emailField;
	//Action Methods

	public boolean signInBtn () {
		return signIn.isDisplayed();
	}
	public boolean headerLogo() {
		return headerLogo.isDisplayed();
	}
	public void clickOnHeaderLogo() {
		headerLogo.click();
	}
	public void clickOnWomenTab() {
		womenTab.click();
	}
	public void clickOnDressesTab() {
		dressesTab.click();
	}
	public void clickOnTshirtTab() {
		tShirtsTab.click();
	}
	public void submitNewsletterBtn() {
		submitNewsletterBtn.click();
	}
	public String newsletterSuccesAlertMessage() {
		return newsletterDangerAlertMessage.getText();
	}
	public String newsletterDangerAlertMessage() {
		return newsletterSuccessAlertMessage.getText();
	}
	public void clickOnDressesLink() {
		dressesLink.click();
	}

	
	
	public boolean newsLetterText() {
		return newsLetterText.isDisplayed();
	}

	public boolean twitterLogo() {
		return twitterLogo.isDisplayed();
	}

	public void setEmailId(String EmailID) {
		emailField.sendKeys(EmailID);
	}
	
}
