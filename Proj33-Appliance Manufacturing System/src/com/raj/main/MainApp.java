package com.raj.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.factory.ApplianceFactory;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner scn = new Scanner(System.in);
				){
			
			ApplianceFactory factory = ctx.getBean(ApplianceFactory.class);
			System.out.print("Enter type(Eg:washingMachine or refrigerator ): ");
			String type = scn.nextLine();
			
			factory.getAppliance(type).manufacture();
		}catch (Exception e) {
			
		}
	}
}
