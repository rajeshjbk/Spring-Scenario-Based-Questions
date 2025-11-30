package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class ICICIService implements LoanService{

	String branchCode, managerName;
	int interestRate;
	
	public ICICIService(String branchCode, String managerName, int interestRate) {
		super();
		this.branchCode = branchCode;
		this.managerName = managerName;
		this.interestRate = interestRate;
	}

	@Override
	public void applyLoan() {
		
		System.out.println("ICICIService.applyLoan()");
	}

	@Override
	public void rejectLoan() {
	
		System.out.println("ICICIService.rejectLoan()");
	}

	@Override
	public void viewApplications() {
		
		System.out.println("ICICIService.viewApplications()");
	}

}
