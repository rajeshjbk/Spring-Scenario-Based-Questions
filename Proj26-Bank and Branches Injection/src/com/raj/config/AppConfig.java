package com.raj.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Bank;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public Bank getBankObj() {
		
		Bank bank = new Bank();
		bank.setBankName("Axis Bank");
		Map<String,String> branches = new HashMap<>();
		branches.put("B001", "Hyderabad");
		branches.put("B002", "Chennai");
		branches.put("B003", "Pune");
		
		bank.setBranches(branches);
		
		return bank;
	}
}
