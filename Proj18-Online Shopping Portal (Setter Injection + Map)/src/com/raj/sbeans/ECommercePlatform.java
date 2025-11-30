package com.raj.sbeans;

import java.util.List;

public class ECommercePlatform {

	String platformName;
	List<ShoppingCart> carts;
	
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public void setCarts(List<ShoppingCart> carts) {
		this.carts = carts;
	}
	
	public void displayPlatformInfo() {
		
		System.out.println("--- Platform: "+platformName+" ---");
		for(ShoppingCart cart:carts) {
			cart.showCartDetails();
			System.out.println();
		}
	}
}
