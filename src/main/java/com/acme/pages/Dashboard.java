package com.acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.acme.selenium.api.base.SeleniumBase;

public class Dashboard  extends SeleniumBase{
	
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
