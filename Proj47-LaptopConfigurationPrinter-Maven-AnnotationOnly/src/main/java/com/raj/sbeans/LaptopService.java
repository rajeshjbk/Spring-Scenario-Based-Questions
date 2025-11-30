package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LaptopService {

	@Autowired
	Laptop laptop;
	
	public void printLaptopDetails() {
		
		System.out.println("Laptop Brand: "+laptop.brand);
		System.out.println("Processor: "+laptop.processor);
		System.out.println("RAM: "+laptop.ram);
	}
}
