package com.raj.sbeans;

public class Company {

	Department dept1, dept2, dept3;

	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}

	public void setDept2(Department dept2) {
		this.dept2 = dept2;
	}

	public void setDept3(Department dept3) {
		this.dept3 = dept3;
	}
	
	public void showDepartments() {
		System.out.println("Company Details: ");
		dept1.departmentInfo();
		dept2.departmentInfo();
		dept3.departmentInfo();
	}
	
}
