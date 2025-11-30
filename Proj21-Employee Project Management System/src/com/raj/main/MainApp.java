package com.raj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raj.sbeans.Company;

public class MainApp {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/raj/cfgs/springConfig.xml")){
			
			Company company = ctx.getBean(Company.class);
			company.showCompanyInfo();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
