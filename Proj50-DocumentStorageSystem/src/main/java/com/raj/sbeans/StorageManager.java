package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class StorageManager {

	@Autowired
	@Qualifier("cloudStorageService")
	StorageService storageService;
	
	public void save(String file) {
		
		System.out.println("StorageManager HashCode: "+this.hashCode());
		System.out.println("StorageService HashCode: "+storageService.hashCode());
		storageService.store(file);
		
	}
}
