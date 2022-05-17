package com.cozentus.pages;


import org.openqa.selenium.By;

import com.cozentus.base.Page;
import com.cozentus.utilities.Utilities;

public class LoginPage extends Page{
		
	public HomePage doLogin(String Username, String Password) {
		
		type("Username_XPATH",Username);
		type("Password_XPATH",Password);
		click("Checkbox_XPATH");
		driver.findElement(By.xpath("//button[@class=\"p-ripple p-button p-component ng-star-inserted\"]")).click();
		
        return new HomePage();
}
	public RegistrationPage doRegister() {
		driver.findElement(By.xpath("//a[@href=\"#/register\"]")).click();
		return new RegistrationPage();
		
	}
	
	public ForgotPasswordPage forgetPassword() {
		driver.findElement(By.xpath("//a[@href=\"#/forget-password\"]")).click();
		return new ForgotPasswordPage();
		
		
		
		
	}
	
	
	
}
