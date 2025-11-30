package com.raj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.raj.sbeans.FinancialGoalStrategy;
import com.raj.sbeans.FitnessGoalStrategy;
import com.raj.sbeans.GoalStrategy;
import com.raj.sbeans.SkillGoalStrategy;

@Configuration
@ComponentScan(basePackages = "com.raj")
@PropertySource("com/raj/commons/development.properties")
public class AppConfig {

	@Value("${goal.type}")
	String goalType;
	
	@Bean(name="goal")
	public GoalStrategy getGoalStrategy() {
		
		if(goalType.equalsIgnoreCase("skill")) {

			return new SkillGoalStrategy();
		}else if(goalType.equalsIgnoreCase("financial")) {
			
			return new FinancialGoalStrategy();
			
		}else if(goalType.equalsIgnoreCase("fitness")) {
			
			return new FitnessGoalStrategy();
		}else {
			
			throw new IllegalArgumentException("Invalid input");
		}
	}
}
