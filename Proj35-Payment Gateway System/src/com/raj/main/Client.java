package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.factory.PaymentFactory;

public class Client {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner scn = new Scanner(System.in)){
			
			PaymentFactory paymentFactory = ctx.getBean(PaymentFactory.class);
			System.out.print("Enter Payment type(upiProcessor,payPalProcessor,creditCardProcessor): ");
			String type = scn.nextLine();
			
			paymentFactory.getPaymentProcessorObj(type).processPayment(30000);;
			
		}catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
