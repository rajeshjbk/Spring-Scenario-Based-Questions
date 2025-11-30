package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("financial")
public class FinancialGoalStrategy implements GoalStrategy {

	@Value("${financial.targetAmount}")
	int targetAmount;
	
	@Value("${financial.monthlyRate}")
	int monthlyRate;
	
	@Value("${financial.deadlineMonths}")
	int deadlineMonths;
	
	@Override
	public String evaluateGoalProgress(GoalData data) {
		
		double progress = data.getWorkDone() / targetAmount * 100;
        return String.format("Progress: %.0f%%\nStay disciplined with savings!", progress);
	}

}
