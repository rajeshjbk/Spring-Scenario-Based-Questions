package com.raj.sbeans;

public class MenuItem {

	int itemId;
	String itemName;
	double price;
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showItem() {
		
		System.out.println("Item ID: "+itemId+", Name: "+itemName+", Price: "+price);
	}

}
