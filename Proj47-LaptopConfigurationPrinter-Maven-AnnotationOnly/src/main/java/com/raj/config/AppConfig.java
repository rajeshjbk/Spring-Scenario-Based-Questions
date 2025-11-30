package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Laptop;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {
	@Bean
	public Laptop getLaptop() {
		
		Laptop laptop = new Laptop("Dell", "Intel i7", "16GB");
		return laptop;
	}
}
