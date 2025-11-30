package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.GoalData;
import com.raj.sbeans.GoalService;

public class App {
	
    public static void main(String[] args) {
       
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		GoalService goalService = ctx.getBean(GoalService.class);
    		goalService.getEvaluation(new GoalData(90.0));
    	}
    }
}
