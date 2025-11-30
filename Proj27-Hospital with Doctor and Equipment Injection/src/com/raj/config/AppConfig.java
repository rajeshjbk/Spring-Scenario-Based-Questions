package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Doctor;
import com.raj.sbeans.Equipment;
import com.raj.sbeans.Hospital;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean 
	public Doctor getDoctorObj() {
     return new Doctor("Dr. Meena Gupta","Cardiologist");
	}
	
	@Bean
	public Equipment getEquipmentObj() {
		
		return new Equipment("ECG Machine",250000);
	}
	
	@Bean
	public Hospital getHospitalObj() {
		
		return new Hospital("City Care Hospital", getDoctorObj(), getEquipmentObj());
	}
}
