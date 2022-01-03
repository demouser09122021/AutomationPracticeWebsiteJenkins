package com.apw.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apw.core.BaseClass;
import com.apw.pageObjects.HomePage;

public class VerifyDefaultSortingResults extends BaseClass{



	@Test(priority = 1)
	public void verifyDefaultSortingResultsProductPrice() throws InterruptedException, IOException {
		List<String> unsortedOriginalList = new ArrayList<String>();
		List<String> sortedOriginalList = new ArrayList<String>();
		HomePage homePageObj = new HomePage(driver);
		homePageObj.clickOnWomenTab();
		// Original List
		List<WebElement> originalList = driver.findElements(By.xpath("//*[@class='price product-price']"));
		int ListSize = originalList.size();
		System.out.println(ListSize);
		for(WebElement options : originalList){
			System.out.println(options.getText());
		}
		//Original UnSorted List of Product Prices
		int i = 1;
		for(WebElement options : originalList) {
			if(i % 2 == 0) {
				//System.out.println("Even No"+i);
				System.out.println(options.getText());
				String Text = options.getText();
				unsortedOriginalList.add(Text);
			} 
			i++;
		}
		//Original Sorted List of Product Prices
		sortedOriginalList.addAll(unsortedOriginalList);
		Collections.sort(sortedOriginalList);
		for(String options : sortedOriginalList){
			System.out.println(options);
		}

		if(unsortedOriginalList.equals(sortedOriginalList)) {
			logger.warn("Product Price is in order");
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"verifyDefaultSortingResultsProductPrice");
			logger.warn("Product Price is not in order");
			Assert.assertTrue(false);
		}


	}
	@Test(priority = 2)
	public void verifyDefaultSortingResultsProductName() throws IOException {
		List<String> unsortedOriginalList = new ArrayList<String>();
		List<String> sortedOriginalList = new ArrayList<String>();
		HomePage homePageObj = new HomePage(driver);
		homePageObj.clickOnWomenTab();
		List<WebElement> originalList = driver.findElements(By.xpath("//*[@class='product-name']"));
		int ListSize = originalList.size();
		System.out.println(ListSize);
		for(WebElement options : originalList){
			System.out.println(options.getText());
		}
		//Original UnSorted List of Product Name
		int i = 1;
		for(WebElement options : originalList) {
			if(i>2) {
				//System.out.println("Even No"+i);
				System.out.println(options.getText());
				String Text = options.getText();
				unsortedOriginalList.add(Text);
			} 
			i++;
		}
		//Original Sorted List of Product Prices
		sortedOriginalList.addAll(unsortedOriginalList);
		Collections.sort(sortedOriginalList);
		for(String options : sortedOriginalList){
			System.out.println(options);
		}

		if(unsortedOriginalList.equals(sortedOriginalList)) {
			logger.warn("Product Price is in order");
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"verifyDefaultSortingResultsProductName");
			logger.warn("Product Name is not in order");
			Assert.assertTrue(false);
		}
	}

}



