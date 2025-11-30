package com.raj.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Company;
import com.raj.sbeans.Department;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public Department getDepartmentObj1() {
		
		 Department dept1 = new Department();
		 dept1.setDeptId(101);
		 dept1.setDeptName("IT");
		 
		 return dept1;
	}

	@Bean
	public Department getDepartmentObj2() {
		
		 Department dept2 = new Department();
		 dept2.setDeptId(102);
		 dept2.setDeptName("HR");
		 
		 return dept2;
	}
	
	@Bean
	public Department getDepartmentObj3() {
		
		 Department dept3 = new Department();
		 dept3.setDeptId(103);
		 dept3.setDeptName("Finance");
		 
		 return dept3;
	}
	
	@Bean
	public Company getCompanyObj() {
		
		List<Department> depts = new ArrayList<>();
		depts.add(getDepartmentObj1());
		depts.add(getDepartmentObj2());
		depts.add(getDepartmentObj3());
		
		Company company = new Company();
		company.setDepartments(depts);
		
		return company;
	}
}
