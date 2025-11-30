package com.raj.sbeans;

public class Product {

	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public void showProductDetails() {
		
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
		System.out.println();
	}
}
