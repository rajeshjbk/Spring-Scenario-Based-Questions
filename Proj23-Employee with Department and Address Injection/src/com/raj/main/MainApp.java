package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			Employee employee = ctx.getBean(Employee.class);
			employee.showEmployeeDetails();
			
		}catch (Exception e) {
		   
			e.printStackTrace();
		}
	}
}
