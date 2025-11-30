package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.CommercialBilling;
import com.raj.sbeans.ElectricityBillingSystem;
import com.raj.sbeans.IndustrialBilling;
import com.raj.sbeans.ResidentialBilling;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {
     
	
	@Bean(name="residential")
	public ResidentialBilling getResidentialBillingObj() {
		
		return new ResidentialBilling();
	}
	
	@Bean(name="commercial")
	public CommercialBilling getCommercialBillingObj() {
		
		return new CommercialBilling();
	}
	
	@Bean("industrial")
	public IndustrialBilling getIndustrialBilling() {
		
		return new IndustrialBilling();
	}
	
	@Bean(name="billing")
	public ElectricityBillingSystem getElectricityBillingSystemObj() {
		
		return new ElectricityBillingSystem();
	}
		
}
