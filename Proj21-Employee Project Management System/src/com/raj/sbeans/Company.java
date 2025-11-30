package com.raj.sbeans;

import java.util.Map;

import org.springframework.stereotype.Component;

public class Company {

	String companyName;
	
	Map<String, Department> departments;
		
	public Company(String companyName, Map<String, Department> departments) {
		super();
		this.companyName = companyName;
		this.departments = departments;
	}

	public void showCompanyInfo() {
		System.out.println("=== Company Structure ===");
		System.out.println("Company: "+companyName);
		departments.forEach((x,y)->{
			y.showDepartmentInfo();
	
		});
	}
}
