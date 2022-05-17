package com.cozentus.testcases;

import org.testng.annotations.AfterSuite;

import com.cozentus.base.Page;

public class BaseTest extends Page {
	
	@AfterSuite
	 public void tearDown() {
		Page.quit();
		
		
		
	}
	

}
