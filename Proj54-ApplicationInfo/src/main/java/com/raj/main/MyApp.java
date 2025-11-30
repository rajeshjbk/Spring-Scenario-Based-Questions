package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Application;

public class MyApp {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx = 
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		Application application = ctx.getBean(Application.class);
    		application.printAppDetails();
    		
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
