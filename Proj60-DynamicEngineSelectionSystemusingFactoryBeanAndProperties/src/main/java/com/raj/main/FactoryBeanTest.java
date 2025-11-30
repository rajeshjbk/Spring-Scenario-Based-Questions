package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Car;

public class FactoryBeanTest {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		Car car = ctx.getBean(Car.class);
    		car.showCarDetails();
    		
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
