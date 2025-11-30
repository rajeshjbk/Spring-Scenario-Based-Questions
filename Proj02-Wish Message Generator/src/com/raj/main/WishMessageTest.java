package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.WishMessageGenerator;

public class WishMessageTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

		Object obj = ctx.getBean("ctime");

		WishMessageGenerator generator = (WishMessageGenerator)obj;

		String wishMessage = generator.generateWishMessage();
		System.out.println(wishMessage);
	}

}
