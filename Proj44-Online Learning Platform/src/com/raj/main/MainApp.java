package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.LearningController;

public class MainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			
			LearningController learningController = ctx.getBean("learn",LearningController.class);
			learningController.enrollJavaCourse();
			learningController.enrollPythonCourse();
			learningController.enrollDataScienceCourse();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
