package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.SalarySlipService;

public class App {
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){

			 SalarySlipService salarySlipService = ctx.getBean(SalarySlipService.class);
			 
			 salarySlipService.generateSlip();
		}catch (Exception e) {

            e.printStackTrace();
		}

	}
}
