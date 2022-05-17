package com.cozentus.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cozentus.pages.favorites.FavoritesPage;
import com.cozentus.pages.trackinglist.TrackingListPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void goToHome(){
		
	}
	
	public TrackingListPage goToTrackingList() {
		driver.findElement(By.cssSelector(".p-menubar-root-list > li:nth-child(2) > a:nth-child(1)")).click();
		return new TrackingListPage();
	}
	
	public FavoritesPage goToFavorites() {
		driver.findElement(By.cssSelector(".p-menubar-root-list > li:nth-child(3) > a:nth-child(1)")).click();
		return new FavoritesPage();
	}
	
	public void goToDataManagment() {
		
		
	}

	public void UserManagment() {
		
		driver.findElement(By.cssSelector("")).click();

	}
}
