package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Retailer;

public class FactoryBeanTest {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		Retailer retail = ctx.getBean(Retailer.class);
    		retail.showSimInfo();
    		
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
