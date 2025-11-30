package com.raj.sbeans;

public class Order {

	int orderId;
	Customer customer;
	Product product;
	int quantity;
	
	public Order(int orderId, Customer customer, Product product, int quantity) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	public void showOrderDetails() {
		customer.showCustomerInfo();
		product.showProductDetails();
		System.out.println();
		System.out.println("Quantity: "+quantity);
		System.out.println("----------------------------------");
	}
}
