package com.raj.sbeans;

public class Product {

	int productId;
	String productName;
	double price;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showProductDetails() {
		
		System.out.print("Product: "+productName+" (₹"+price+")");
	}
}
