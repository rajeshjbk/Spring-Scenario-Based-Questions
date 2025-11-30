package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Restaurant;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			Restaurant restaurant = ctx.getBean(Restaurant.class);
			
			restaurant.showMenu();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
