package com.apw.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver ldriver;
	public CheckoutPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="color_14")
	@CacheLookup
	WebElement blueColor;

	@FindBy(xpath="//*[text()='Add to cart']")
	@CacheLookup
	WebElement addToCartBtn;

	@FindBy(linkText="Proceed to checkout")
	@CacheLookup
	WebElement proceedToCheckoutBtn;

	@FindBy(xpath="//*[text()='Proceed to checkout']")
	@CacheLookup
	WebElement proceedToCheckoutBtn2;

	@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
	@CacheLookup
	WebElement proceedToCheckoutBtn3;
	
	@FindBy(xpath="//*[@class='button btn btn-default standard-checkout button-medium']")
	@CacheLookup
	WebElement proceedToCheckoutBtn4;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement checkoutPageEmailID;

	@FindBy(id="passwd")
	@CacheLookup
	WebElement checkoutPagePassword;

	@FindBy(id="SubmitLogin")
	@CacheLookup
	WebElement checkoutPageSubmitLogin;

	@FindBy(id="cgv")
	@CacheLookup
	WebElement selectTermsOfServiceCheckBox;

	@FindBy(xpath="//*[@class='bankwire']")
	@CacheLookup
	WebElement clickOnPayByBankWire;

	@FindBy(xpath="//*[@class='button btn btn-default button-medium']")
	@CacheLookup
	WebElement clickOnConfirmMyOrder;
	
	
	
	public void clickOnBlueColor() {
		blueColor.click();
	}
	public void clickOnAddToCartBtn() {
		addToCartBtn.click();
	}
	public void clickOnProceedToCheckoutBtn() {
		proceedToCheckoutBtn.click();
	}
	public void clickOnProceedToCheckoutBtn2() {
		proceedToCheckoutBtn2.click();
	}
	public void clickOnproceedToCheckoutBtn3() {
		proceedToCheckoutBtn3.click();
	}
	public void clickOnproceedToCheckoutBtn4() {
		proceedToCheckoutBtn4.click();
	}
	
	public void enterCheckoutPageEmailId(String email) {
		checkoutPageEmailID.sendKeys(email);
	}
	public void enterCheckoutPagePassword(String password) {
		checkoutPagePassword.sendKeys(password);
	}
	public void clickOnCheckoutPageSubmitLoginBtn() {
		checkoutPageSubmitLogin.click();
	}
	public void selectTermsOfServiceCheckBox() {
		selectTermsOfServiceCheckBox.click();
	}
	public void clickOnPayByBankWire() {
		clickOnPayByBankWire.click();
	}
	public void clickOnConfirmMyOrder() {
		clickOnConfirmMyOrder.click();
	}
	
}
