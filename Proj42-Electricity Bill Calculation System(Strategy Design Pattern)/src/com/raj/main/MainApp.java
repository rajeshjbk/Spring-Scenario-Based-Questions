package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.BillingStrategy;
import com.raj.sbeans.ElectricityBillingSystem;

public class MainApp {

	private static Object bean;

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);
			AnnotationConfigApplicationContext ctx = 
					new AnnotationConfigApplicationContext(AppConfig.class)){
			
			System.out.print("Enter customer type (residential/commercial/industrial): ");
			String cType = sc.nextLine().toLowerCase();
			
			System.out.print("Enter total units consumed: ");
			double units = Double.parseDouble(sc.nextLine());
			int rate=0;
			
			switch(cType) {
			
			case "industrial":
				rate=10;
				break;
			case "commercial":
				rate=8;
				break;
			case "residential":
				rate=5;
				break;
			default:
				throw new IllegalAccessException("Invalid Input");
			}
			
			BillingStrategy billingStrategy = ctx.getBean(cType,BillingStrategy.class);
			
			ElectricityBillingSystem billingSystem = new ElectricityBillingSystem();
			billingSystem.setBillingStrategy(billingStrategy);
				
			System.out.println("Customer Type: "+cType);
			System.out.println("Units Consumed: "+units);
			System.out.println("Rate per Unit: ₹"+rate);
			
			billingSystem.showBill(units);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
       
		
				
	}
}
