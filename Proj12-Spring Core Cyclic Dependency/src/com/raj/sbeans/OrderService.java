package com.raj.sbeans;

public class OrderService {

	int orderId;
	PaymentService paymentService;
	
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}


	public void processOrder() {
		System.out.println("Order placed successfully.");
		paymentService.processPayment();
	}
}
