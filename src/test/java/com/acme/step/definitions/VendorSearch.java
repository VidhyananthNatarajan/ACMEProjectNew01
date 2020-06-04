package com.acme.step.definitions;

import com.acme.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.When;

public class VendorSearch  extends SeleniumBase {
	
	
   @When("Click on Search as (.*)")	
	public VendorSearchResults searchVendor(String vendorName) {
		
		clearAndType(locateElement("id","vendorName"),vendorName);
		
		click(locateElement("id","buttonSearch"));
		
		return new VendorSearchResults();
	}
}
