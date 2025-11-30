package com.raj.sbeans;

public class Employee {

	int id;
	String name;
	double basicSalary;
	double hra;
	double da;
	double texPercentage;
	
	public Employee(int id, String name, double basicSalary, double hra, double da, double texPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.texPercentage = texPercentage;
	}
	
}
