package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			Vehicle vehicle = ctx.getBean(Vehicle.class);
			vehicle.startVehicle();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
