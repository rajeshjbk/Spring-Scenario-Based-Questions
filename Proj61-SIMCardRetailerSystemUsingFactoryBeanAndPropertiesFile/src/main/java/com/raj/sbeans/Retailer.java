package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("retailer")
public class Retailer {

	@Value("${retailer.name}")
	String retailer;
	
	@Value("${retailer.location}")
	String location;

	
	@Autowired
	@Qualifier("simFactory")
	ISimCard simCard;
	
	public void showSimInfo() {
		
		System.out.println("Retailer: "+retailer);
		System.out.println("Location: "+location);
		System.out.println(simCard.getSimDetails());
	}
}
