package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.StorageManager;

public class App {
    public static void main(String[] args) {
       
    	try(AnnotationConfigApplicationContext ctx = 
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		StorageManager manager1 = ctx.getBean(StorageManager.class);
    		manager1.save("Books.pdf");
    		
    		System.out.println();
    		
    		StorageManager manager2 = ctx.getBean(StorageManager.class);
    		manager2.save("JavaNotes.pdf");
    		
    		System.out.println();
    		
    		System.out.println("manager1 hashcode: "+manager1.hashCode());
    		System.out.println("manager2 hashcode: "+manager2.hashCode());
    	
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
