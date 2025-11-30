package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.beans.PaymentProcessor;
import com.raj.config.AppConfig;

public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		PaymentProcessor paymentProcessor = ctx.getBean(PaymentProcessor.class);
    		paymentProcessor.processPayment("Raj", 5000.0);
    	}
    }
}
