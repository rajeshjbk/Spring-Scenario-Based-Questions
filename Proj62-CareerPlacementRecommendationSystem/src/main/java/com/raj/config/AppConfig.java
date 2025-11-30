package com.raj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.raj.sbeans.CorePlacementStrategy;
import com.raj.sbeans.ITPlacementStrategy;
import com.raj.sbeans.ManagementPlacementStrategy;
import com.raj.sbeans.PlacementStrategy;

@Configuration
@ComponentScan(basePackages = "com.raj")
@PropertySource("com/raj/commons/PlacementInfo.properties")
public class AppConfig {

	@Value("${placement.type}")
	private String placementType;
	
	@Bean(name="placement")
	public PlacementStrategy getInstance() {
		
		if(placementType.equals("it")) {
			
			return new ITPlacementStrategy();
			
		}else if(placementType.equals("core")) {
			
			return new CorePlacementStrategy();
			
		}else if(placementType.equals("mgmt")){
			
			return new ManagementPlacementStrategy();
			
		}else {
			throw new IllegalArgumentException("Invalid input");
		}
	}
}
