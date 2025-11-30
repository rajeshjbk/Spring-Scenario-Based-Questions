package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.LaptopService;

public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx = 
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		LaptopService laptopService = ctx.getBean(LaptopService.class);
    		laptopService.printLaptopDetails();
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
