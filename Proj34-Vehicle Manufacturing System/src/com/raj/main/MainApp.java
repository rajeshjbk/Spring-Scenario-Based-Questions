package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.factory.VehicleFactory;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner scn = new Scanner(System.in);
				){
			
			VehicleFactory factory = ctx.getBean(VehicleFactory.class);
			System.out.print("Enter type(Car, Bike, Truck): ");
			String type = scn.nextLine();
			
			factory.getVehicle(type).assemble();
		}catch (Exception e) {
			
		}
	}
}
