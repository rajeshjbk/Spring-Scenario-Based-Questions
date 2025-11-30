package com.raj.main;

public class EmployeeValidator {

	public boolean isValidName(String name) {
		
		if(name==null || name.equalsIgnoreCase(" ")) {
			
			return false;
			
		}else {
			
			return true;
		}
	}
	
	public boolean isValidSalary(double salary) {
		
		if(salary>=10000)
			return true;
		else
			return false;
	}
	
}
