package com.acme.step.definitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.acme.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.When;

public class Dashboard  extends SeleniumBase{
	
   @When("Search for Vendors name")
	public VendorSearch selectVendor() {
		WebElement vendorhover = locateElement("xpath","(//button[@class='btn btn-default btn-lg'])[4]");
		Actions builder = new Actions(driver);
		builder.moveToElement(vendorhover).perform();
		
		WebElement vendorsrch = locateElement("xpath","//a[contains(text(),'Search for Vendor')]");
		
		builder.moveToElement(vendorsrch).perform();
		vendorsrch.click();
		
		return new VendorSearch();
	}
	
	

}
