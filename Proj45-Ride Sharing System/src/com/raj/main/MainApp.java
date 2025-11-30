package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.RideController;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			RideController rideController = ctx.getBean(RideController.class);
			
			rideController.bookCar(2000);
			System.out.println();
			rideController.bookBike(800);
			System.out.println();
			rideController.bookAuto(1200);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
