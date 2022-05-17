package com.cozentus.testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.cozentus.pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test
	public void loginTest() {
		
		LoginPage login = new LoginPage();
		login.doLogin("mayank@cozentus.com", "SysteM$@12345678");
		Reporter.log("Login successful");
	
		
		
	}
	
	

}
