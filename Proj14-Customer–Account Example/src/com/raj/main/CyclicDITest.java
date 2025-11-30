package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.Customer;

public class CyclicDITest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		Customer customer = (Customer) ctx.getBean("cust");
		customer.displayCustomerInfo();
	}
}
