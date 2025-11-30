package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.Student;

public class App {
    public static void main(String[] args) {
        
    	try(AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(AppConfig.class)){
    		
    		Student student = ctx.getBean(Student.class);
    		student.showResult();
    	}catch (Exception e) {
			
    		e.printStackTrace();
		}
    }
}
