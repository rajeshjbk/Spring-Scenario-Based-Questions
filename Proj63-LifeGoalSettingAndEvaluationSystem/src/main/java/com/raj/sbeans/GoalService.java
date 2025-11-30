package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GoalService {

	@Autowired
	@Qualifier("goal")
	GoalStrategy goalStrategy;
	
	public void getEvaluation(GoalData data) {
		
		System.out.println("Selected Strategy: "+goalStrategy.getClass().getName());
		System.out.println(goalStrategy.evaluateGoalProgress(data));
		
	}
}
