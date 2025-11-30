package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Bank;

public class MainApp {

	public static void main(String[] args) {
		 
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			Bank bank = ctx.getBean(Bank.class);
			bank.showBranches();
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
