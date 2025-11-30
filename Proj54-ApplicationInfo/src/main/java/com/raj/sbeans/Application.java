package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("app")
public class Application {

	@Value("${app.name}")
	String appName;
	
	@Value("${app.version}")
	String ver;
	
	@Value("${app.description}")
	String description;
	
	@Value("${app.author}")
	String author;
	
	@Value("${support@myspringapp.com}")
	String email;
	
	@Value("${app.maxUsers}")
	int maxUsers;
	
	public void printAppDetails() {
		
		System.out.println("App Name: "+appName);
		System.out.println("Version: "+ver);
		System.out.println("Description: "+description);
		System.out.println("Author: "+author);
		System.out.println("Email: "+email);
		System.out.println("Max User: "+maxUsers);
	}
}
