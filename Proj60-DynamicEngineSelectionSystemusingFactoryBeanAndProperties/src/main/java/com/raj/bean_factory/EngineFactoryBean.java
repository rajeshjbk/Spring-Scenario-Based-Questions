package com.raj.bean_factory;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.raj.sbeans.DieselEngine;
import com.raj.sbeans.ElectricEngine;
import com.raj.sbeans.IEngine;
import com.raj.sbeans.PetrolEngine;

@Component("eFactory")
public class EngineFactoryBean implements FactoryBean<IEngine> {

	@Value("${engine.type}")
	private String type;
	
	@Override
	public IEngine getObject() throws Exception {
				
		switch(type) {
		
		case "petrol":
			return new PetrolEngine();
			
		case "diesel":
			return new DieselEngine();
			
		case "electrical": 
			return new ElectricEngine();
		
		default:
			throw new IllegalArgumentException("Invalid engine type");
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		
		return IEngine.class;
	}

	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
