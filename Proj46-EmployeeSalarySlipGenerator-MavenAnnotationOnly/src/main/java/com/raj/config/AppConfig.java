package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Employee;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public Employee getInstance() {
		
		Employee employee = new Employee(50000, "Raj",4000 , 2000, 3000, 10);
		
		return employee;
	}
}
