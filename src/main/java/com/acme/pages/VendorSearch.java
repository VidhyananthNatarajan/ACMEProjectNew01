package com.acme.pages;

import com.acme.selenium.api.base.SeleniumBase;

public class VendorSearch  extends SeleniumBase {
	
	public VendorSearchResults searchVendor(String vendorName) {
		
		clearAndType(locateElement("id","vendorName"),vendorName);
		
		click(locateElement("id","buttonSearch"));
		
		return new VendorSearchResults();
		
		
		
	}

}
