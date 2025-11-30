package com.raj.sbeans;

import java.util.List;

public class City {

	String  cityName;
	List<Library> libraries;
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setLibraries(List<Library> libraries) {
		this.libraries = libraries;
	}
	
	public void showCityLibraries() {
		
		System.out.println("--- City: "+cityName+" ---");
		
		for(Library lib:libraries) {
			lib.displayLibraryInfo();
			System.out.println();
		}
	}
}
