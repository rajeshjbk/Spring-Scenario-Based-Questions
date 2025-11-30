package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.comps.BillingService;
import com.raj.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			BillingService billingService = ctx.getBean("bs",BillingService.class);
			billingService.generateBill(5000);
		}catch (Exception e) {
			
		}
	}
}
