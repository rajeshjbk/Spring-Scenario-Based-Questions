package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PlacementService {
	
	@Autowired
	@Qualifier("placement")
	PlacementStrategy placementStrategy;

	public void getPlacementRecommendation(Student student) {
		
		String placement = placementStrategy.recommendPlacement(student);
		System.out.println(placement);
	}
}
