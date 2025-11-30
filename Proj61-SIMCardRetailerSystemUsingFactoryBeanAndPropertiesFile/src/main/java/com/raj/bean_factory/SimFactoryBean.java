package com.raj.bean_factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.raj.sbeans.AirtelSim;
import com.raj.sbeans.ISimCard;
import com.raj.sbeans.JioSim;
import com.raj.sbeans.ViSim;

import io.micrometer.common.lang.Nullable;

@Component("simFactory")
public class SimFactoryBean implements FactoryBean<ISimCard> {

	@Value("${sim.type}")
	private String simType;
	
	@Override
	public ISimCard getObject() throws Exception {

		switch(simType) {
		
		case "jio":
			return new JioSim();
			
		case "airtel":
			return new AirtelSim();
			
		case "vi":
			return new ViSim();
			
		default:
			throw new IllegalArgumentException("Invalid SIM type");
		}
	}

	@Override
	public @Nullable Class<?> getObjectType() {

		return ISimCard.class;
	}

	@Override
	public boolean isSingleton() {

		return true;
	}
}
