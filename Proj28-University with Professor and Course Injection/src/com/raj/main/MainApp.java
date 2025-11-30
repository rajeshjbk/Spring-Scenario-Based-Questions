package com.raj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raj.config.AppConfig;
import com.raj.sbeans.University;

public class MainApp {

	public static void main(String[] args) {

		try( AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){

			University university = ctx.getBean(University.class);
			university.showDetails();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
