package com.raj.sbeans;

import java.util.List;

public class Restaurant {

	String restaurantName;
	List<MenuItem> menuItems;
	
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public void showMenu() {
		
		System.out.println("Restaurant: "+restaurantName);
		System.out.println("Menu: ");
		menuItems.forEach(item-> item.showItem());
	}
}
