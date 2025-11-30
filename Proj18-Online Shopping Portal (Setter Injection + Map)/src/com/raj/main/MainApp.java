package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.ECommercePlatform;

public class MainApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		ECommercePlatform ecommerce = (ECommercePlatform)	ctx.getBean("e-commerce");
		ecommerce.displayPlatformInfo();
	}
}
