package com.acme.step.definitions;

import org.openqa.selenium.WebElement;

import com.acme.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.Then;

public class VendorSearchResults extends SeleniumBase {
	
	@Then("find the country name based on vendor as (.*)")
	public void getCountryName(String cName) {
	
	//WebElement country = locateElement("xpath","//td[contains(text(),'Romania')]");
		
		WebElement country = locateElement("xpath","//table/tbody/tr[2]/td[5]");
	
	verifyExactText(country,cName);
	
	//WebElement countyname = driver.findElementByXPath("//td[contains(text(),'Blue Lagoon')]/following::td[4]");
	//String name = countyname.getText();
	
	}
     	


}
