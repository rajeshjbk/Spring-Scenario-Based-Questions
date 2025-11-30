package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class StorageManager {

	@Autowired
	@Qualifier("databaseStorageService")
	StorageService service;
	
	
	public void showStorage(String fileName) {
		
		service.store(fileName);
	}
}
