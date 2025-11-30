package com.raj.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DatabaseStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		
		System.out.println("Storing "+fileName+" in Database.");
		
	}

}
