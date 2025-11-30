package com.raj.sbeans;

public class PaymentService {

	int paymentId;
	OrderService orderService;
	
	public PaymentService(int paymentId, OrderService orderService) {
		super();
		this.paymentId = paymentId;
		this.orderService = orderService;
	}

	public void processPayment() {
		
		System.out.println("Payment processed successfully.");
	}
}
