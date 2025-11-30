package com.raj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raj.sbeans.ServiceCenter;

public class MainApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				 new ClassPathXmlApplicationContext("com/raj/cfgs/springConfig.xml");
		
		ServiceCenter serviceCenter = (ServiceCenter)ctx.getBean("serviceCenter");
		serviceCenter.performService();
	}
}
