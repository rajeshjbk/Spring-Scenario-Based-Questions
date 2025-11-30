package com.raj.sbeans;

public class Account {

	String accountNumber;
	double balance;
	Customer customer;
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void displayAccountInfo() {
		
		System.out.println("Account "+accountNumber +" belongs to "+customer.customerName);
	}
}
