package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.OnlineStore;

public class TestApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");
		
		OnlineStore store = (OnlineStore)ctx.getBean("onlinestore");
        
		store.generateInvoice();
	}

}
