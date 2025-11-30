package com.raj.sbeans;

public class Customer {

	int customerId;
	String customerName;
	String address;
	
	public Customer(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}
	
	public void showCustomerInfo() {
		
		System.out.println("Customer ID: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Address: "+address);
		System.out.println();
	}
	
}
