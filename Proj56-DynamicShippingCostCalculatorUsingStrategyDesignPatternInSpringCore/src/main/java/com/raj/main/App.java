package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.ShippingService;

public class App {
	
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		ShippingService shippingService = ctx.getBean(ShippingService.class);
    		double shippingCost = shippingService.getShippingCost("air", 5);
    		
    		System.out.println("Shipping Cost: "+shippingCost);
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
