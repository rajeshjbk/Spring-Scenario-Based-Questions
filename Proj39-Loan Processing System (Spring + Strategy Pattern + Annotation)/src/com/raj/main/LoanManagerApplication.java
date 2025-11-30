package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.LoanApplication;

public class LoanManagerApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			LoanApplication loanApplication = ctx.getBean(LoanApplication.class);
			
		}
	}
}
