package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.PaymentProcessor;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			PaymentProcessor paymentProcessor = ctx.getBean(PaymentProcessor.class);
			paymentProcessor.processPayment(3000);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
