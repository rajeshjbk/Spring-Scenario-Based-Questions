package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Hospital;

public class MainApp {

	public static void main(String[] args) {
		
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);){
			
			    Hospital hospital = ctx.getBean(Hospital.class);
			    hospital.showDetails();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
