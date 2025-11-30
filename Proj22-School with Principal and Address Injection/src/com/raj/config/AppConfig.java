package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Address;
import com.raj.sbeans.Principal;
import com.raj.sbeans.School;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	public AppConfig() {
		
		System.out.println("AppConfig::0-param-constructor");
	}	
	
	@Bean(name="principal")
	public Principal getPrincipalObj() {

		Principal p = new Principal();
		p.setName("Raj");
		p.setExperience(15);
		return p;
	}
	
	@Bean(name="address")
	public Address getAddressObj() {

		Address add = new Address();
		add.setCity("Hyd");
		add.setState("Telengana");
		return add;
	}
	
	@Bean(name="school")
	public  School getSchoolObj() {
		
		School s = new School();
		
		s.setSchoolName("Sunshine High School");
		s.setPrincipal(getPrincipalObj());
		s.setAddress(getAddressObj());
		
		return s;
	}
}
