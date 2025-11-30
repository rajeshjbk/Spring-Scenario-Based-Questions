package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.InvoiceService;

public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx = 
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		InvoiceService service = ctx.getBean(InvoiceService.class);
    		service.printInvoice();
    		
    	}catch (Exception e) {
	    		
    		e.printStackTrace();
		}
    }
}
