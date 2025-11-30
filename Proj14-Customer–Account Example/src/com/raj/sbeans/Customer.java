package com.raj.sbeans;

public class Customer {

	int customerId;
	String customerName;
	
	Account account;

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void displayCustomerInfo() {
		
		System.out.println("Customer "+customerName +" owns account "+account.accountNumber);
		account.displayAccountInfo();
	}
}
