package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Librarian {

	Library library;
	String employeeName;
	
	@Autowired
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void manageLibrary() {
		
		System.out.println("=== Library Information System ===");
		System.out.println("Library: "+library.libraryName);
		System.out.println("Managed By: "+employeeName);
		library.showLibraryData();
	}
	
}
