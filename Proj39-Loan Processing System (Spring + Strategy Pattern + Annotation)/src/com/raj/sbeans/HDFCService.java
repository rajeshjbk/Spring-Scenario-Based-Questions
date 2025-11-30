package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component

public final class HDFCService implements LoanService{

	String branchCode, managerName;
	int interestRate;
	
	public HDFCService(String branchCode, String managerName, int interestRate) {
		super();
		this.branchCode = branchCode;
		this.managerName = managerName;
		this.interestRate = interestRate;
	}

	@Override
	public void applyLoan() {
		
		System.out.println("HDFCService.applyLoan()");
	}

	@Override
	public void rejectLoan() {
	
		System.out.println("HDFCService.rejectLoan()");
	}

	@Override
	public void viewApplications() {
		
		System.out.println("HDFCService.viewApplications()");
	}

}
