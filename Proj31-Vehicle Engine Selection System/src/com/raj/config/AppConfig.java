package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.DieselEngine;
import com.raj.sbeans.ElectricEngine;
import com.raj.sbeans.Engine;
import com.raj.sbeans.PetrolEngine;
import com.raj.sbeans.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.raj.sbean")
public class AppConfig {

	@Bean(name="dieselEngine")
	public Engine getDieselEngineObj() {
		
		return new DieselEngine();
	}
	
	@Bean(name="electricEngine")
	public Engine getElectricEngineObj() {
		
		return new ElectricEngine();
	}
	
	@Bean(name="petrolEngine")
	public Engine getPetrolEngineObj() {
		
		return new PetrolEngine();
	}
	
	@Bean
	public Vehicle getVehicleObj() {
		
		return new Vehicle();
	}
}
