package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.OrderService;
import com.raj.sbeans.PaymentService;

public class TestCyclicApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		OrderService order = (OrderService)ctx.getBean("order");
		order.processOrder();
//		PaymentService payment = (PaymentService)ctx.getBean("payment");
//		payment.processPayment();
	}
}
