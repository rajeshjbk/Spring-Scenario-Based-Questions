package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Address;
import com.raj.sbeans.Department;
import com.raj.sbeans.Employee;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {


	@Bean
	public Department getDepartmentObj() {

		Department dept =new Department();
		dept.setDeptId(111);
		dept.setDeptName("IT");
		return dept;
	}

	@Bean
	public Address getAddressObj() {

		Address add = new Address();
		add.setCity("Pune");
		add.setCountry("India");
		return add;
	}

	@Bean
	public Employee getEmployeeObj() {

		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Rohit Sharma");
		emp.setDepartment(getDepartmentObj());
		emp.setAddress(getAddressObj());

		return emp;
	}
}
