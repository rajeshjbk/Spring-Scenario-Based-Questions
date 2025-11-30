package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.RentalManager;

public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		RentalManager rentalManager = ctx.getBean(RentalManager.class);
    		rentalManager.showStatus("Raj Kumar");
    	}catch (Exception e) {
			
		}
    }
}
