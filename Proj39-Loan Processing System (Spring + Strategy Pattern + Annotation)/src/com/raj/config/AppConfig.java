package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.HDFCService;
import com.raj.sbeans.ICICIService;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean(name="hdfc")
	public HDFCService getHdfcServiceObj() {
		
		return new HDFCService("HDFC42332","Rajesh",14);
	}
	
	@Bean(name="icici")
	public ICICIService getIciciServiceObj() {
		
		return new ICICIService("ICI0987", "Scott", 16);
	}
	
	
}
