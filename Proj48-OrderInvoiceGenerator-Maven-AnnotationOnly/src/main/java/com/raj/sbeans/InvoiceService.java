package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvoiceService {

	@Autowired
	Product product;

	@Autowired
	TaxCalculator calculator;

	public void printInvoice() {

		System.out.println("Product: "+product.name);
		System.out.println("Quantity: "+product.price);
		double total = product.price * product.quantity;
		double tax = calculator.calculateTax(total);
		System.out.println("Total (before tax): "+total);
		double finalAmount = total + tax;
		System.out.println("Tax: "+tax);
		System.out.println("Final Amount: "+finalAmount);
	}
}
