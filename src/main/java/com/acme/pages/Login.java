package com.acme.pages;

import com.acme.selenium.api.base.SeleniumBase;


public class Login extends SeleniumBase {
	
	public Login enterUserName(String username) {
		clearAndType(locateElement("id", "email"), username);
		return this;
		
	}
	
	public Login  enterPassword(String password) {
		clearAndType(locateElement("id", "password"), password);
		return this;
		
	}
	
	public Dashboard clickLogin() {
		click(locateElement("xpath","//button[@class='btn btn-primary']"));
		return new Dashboard();
		
	}

}
