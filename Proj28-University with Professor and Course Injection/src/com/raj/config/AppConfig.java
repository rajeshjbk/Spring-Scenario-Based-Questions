package com.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.raj.sbeans.Course;
import com.raj.sbeans.Professor;
import com.raj.sbeans.University;

@Configuration
@ComponentScan(basePackages = "com.raj.sbeans")
public class AppConfig {

	@Bean
	public Professor getProfessorObj() {

		return new Professor("Dr. Suresh Iyer", 15);
	}

	@Bean
	public Course getCourseObj() {

		return new Course("Data Science", 6);
	}

	@Bean
	public University getUniversityObj() {

		return new University("National Institute of Technology", getProfessorObj(), getCourseObj());
	}
}
