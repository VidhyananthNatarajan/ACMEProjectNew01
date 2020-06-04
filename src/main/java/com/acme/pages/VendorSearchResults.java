package com.acme.pages;

import org.openqa.selenium.WebElement;

import com.acme.selenium.api.base.SeleniumBase;

public class VendorSearchResults extends SeleniumBase {
	
	public void getCountryName(String cName) {
	
	WebElement country = locateElement("xpath","//td[contains(text(),'Blue Lagoon')]/following::td[4]");
	
	verifyExactText(country,cName);
	
	//WebElement countyname = driver.findElementByXPath("//td[contains(text(),'Blue Lagoon')]/following::td[4]");
	//String name = countyname.getText();
	
	}
     	


}
