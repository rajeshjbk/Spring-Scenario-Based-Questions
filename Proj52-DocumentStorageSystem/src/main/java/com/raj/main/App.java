package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.StorageManager;


public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		StorageManager storageManager = ctx.getBean(StorageManager.class);
    		storageManager.showStorage("CollegeDoc.pdf");
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
