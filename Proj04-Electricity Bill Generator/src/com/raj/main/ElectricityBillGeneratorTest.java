package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.ElectricityBillGenerator;

public class ElectricityBillGeneratorTest {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				  new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
	    ElectricityBillGenerator billGen= (ElectricityBillGenerator)ctx.getBean("billGenerator");
	    
	    billGen.generateBill();
	}
	
}
