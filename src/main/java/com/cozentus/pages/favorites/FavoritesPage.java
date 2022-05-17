package com.cozentus.pages.favorites;

import org.openqa.selenium.By;

import com.cozentus.base.Page;

public class FavoritesPage extends Page {
	
	public void clickOnID() {
		
	
		driver.findElement(By.cssSelector("#table > div > div.p-datatable-scrollable-wrapper.ng-star-inserted > div > div.p-datatable-scrollable-body.ng-star-inserted > table > tbody > tr:nth-child(1) > td:nth-child(5) > div > a")).click();
		
	}

}
