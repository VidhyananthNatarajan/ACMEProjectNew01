package com.acme.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.acme.pages.Login;
import com.acme.testng.api.base.ProjectSpecificMethods;

public class TC001_ACMESystem_Country extends ProjectSpecificMethods {
	
	@BeforeTest
	
	public void setData() {
		excelFileName="TC001";
		testcaseName="GetCountryName";
		testcaseDec = "Extract the CountryName";
		author="Vidhyananth";
		category="Functional Test Case";
		
	}
   @Test(dataProvider="fetchData")
	public void runTC001(String username, String password, String vendorName, String cName) {
	   
	   new Login()
	   .enterUserName(username)
	   .enterPassword(password)
	   .clickLogin()
	   .selectVendor()
	   .searchVendor(vendorName)
	   .getCountryName(cName);
   }
}
