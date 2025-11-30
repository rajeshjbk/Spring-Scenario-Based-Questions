package com.raj.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.raj.sbeans.City;

public class MainApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/com/raj/cfgs/applicationContext.xml");

        City city = (City)ctx.getBean("city");
        city.showCityLibraries();
	}

}
