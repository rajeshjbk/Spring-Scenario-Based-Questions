package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.School;

public class MainApp {

	public static void main(String[] args) {

		try(  AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);){		

			 School school = ctx.getBean(School.class);
			 school.showSchoolDetails();
			 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	

}
