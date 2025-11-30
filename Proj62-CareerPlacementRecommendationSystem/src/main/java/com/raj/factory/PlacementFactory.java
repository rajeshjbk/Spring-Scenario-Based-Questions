package com.raj.factory;

//Not used 

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.raj.sbeans.CorePlacementStrategy;
import com.raj.sbeans.ITPlacementStrategy;
import com.raj.sbeans.ManagementPlacementStrategy;
import com.raj.sbeans.PlacementStrategy;
@Component("pFactory")
public class PlacementFactory implements FactoryBean<PlacementStrategy> {
	
	@Value("${placement.type}")
	String p_Type;

	@Override
	public PlacementStrategy getObject() throws Exception {
		return switch(p_Type) {
		case "it" -> new ITPlacementStrategy();
		case "core" -> new CorePlacementStrategy();
		case "mg" -> new ManagementPlacementStrategy();
		default -> throw new IllegalArgumentException("Unexpected value: " + p_Type);
		};
	}

	@Override
	public @Nullable Class<?> getObjectType() {
		
		return PlacementStrategy.class;
	}

}
