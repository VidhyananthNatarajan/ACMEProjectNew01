package com.acme.step.definitions;

import com.acme.selenium.api.base.SeleniumBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class Login extends SeleniumBase {
	
	@Given("Enter the username as(.*)")
	public Login enterUserName(String username) {
		clearAndType(locateElement("id", "email"), username);
		return this;
		
	}
	
	@Given("Enter the password as(.*)")
	public Login  enterPassword(String password) {
		clearAndType(locateElement("id", "password"), password);
		return this;
		
	}
	
	
	@When("Login successful")
	public Dashboard clickLogin() {
		click(locateElement("xpath","//button[@class='btn btn-primary']"));
		return new Dashboard();
		
	}

}
