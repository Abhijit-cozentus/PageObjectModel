package com.cozentus.pages.trackinglist;

import org.openqa.selenium.By;

import com.cozentus.base.Page;

public class TrackingListPage extends Page {
	
	
	public NdsList goToNotDepartedShipments() {
	driver.findElement(By.id("p-tabpanel-2-label")).click();	
		return new NdsList();
		
	}
public void goToInTransitShipment() {
		
	
	}
public void goToArrivedShipment() {
	
	
}
public void goToAllShipment() {
	
	
}
public void goToLiveTrackPending() {
	
	
}
}
