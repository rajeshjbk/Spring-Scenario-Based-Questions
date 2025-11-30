package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Company;

public class MainApp {

	public static void main(String[] args) {
		
		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			     Company company = ctx.getBean(Company.class);
			     company.showDepartments();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
