package com.raj.sbeans;

import java.util.Map;

public class Bank {

	String bankName;
	Map<String, String> branches ;
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}
	
	
	public void showBranches() {
		
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Details: ");
		branches.forEach((x,y)->{
			System.out.println("Code: "+x+" -> "+y);

		});
	}
	
}
