package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalarySlipService {

	@Autowired
	Employee employee;
	
	public void generateSlip() {
		
		double grossSalary = employee.basicSalary + employee.hra + employee.da;

		double taxAmount = (grossSalary * employee.texPercentage) / 100.0;

		double netSalary = grossSalary - taxAmount;
		
		System.out.println("Salary Slip for "+employee.name);
		System.out.println("Gross Salary: "+grossSalary);
		System.out.println("Tax Deducted: "+taxAmount);
		System.out.println("Net Salary: "+netSalary);
	}
}
