package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.PlacementService;
import com.raj.sbeans.Student;

public class App {
	
    public static void main(String[] args) {
      
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		PlacementService placementService = ctx.getBean(PlacementService.class);
    		placementService.getPlacementRecommendation(new Student("Raj", 101, "Hyd"));
    	}catch (Exception e) {
		
    		e.printStackTrace();
    	}
    }
}
