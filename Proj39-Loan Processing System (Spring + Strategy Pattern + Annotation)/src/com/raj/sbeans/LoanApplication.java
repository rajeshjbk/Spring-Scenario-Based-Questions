package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public final class LoanApplication {

	LoanService loanService;

	@Autowired
	public LoanApplication(LoanService loanService) {
		super();
		this.loanService = loanService;
	}
}
