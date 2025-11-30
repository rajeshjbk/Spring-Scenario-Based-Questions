package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Library {

	@Value("${library.name}")
	String name;
	
	@Value("${library.location}")
	String location;
	
	@Value("${library.maxBooks}")
	int maxBook;
	
	@Value("${library.openingHours}")
	String openingTime;
	
	@Value("${library.closedOn}")
	String closedOn;
	
	@Value("${library.contactEmail}")
	String email;
	
	public void displayLibraryInfo() {
		
		System.out.println("Library Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Max Books: "+maxBook);
		System.out.println("OpeningHours: "+openingTime);
		System.out.println("Closed on: "+closedOn);
		System.out.println("Email: "+email);
	}
}
