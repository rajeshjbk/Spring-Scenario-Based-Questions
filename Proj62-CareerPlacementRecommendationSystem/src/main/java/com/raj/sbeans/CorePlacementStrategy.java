package com.raj.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CorePlacementStrategy implements PlacementStrategy {

	@Value("${core.minCgpa}")
	double minCgpa;
	
	@Value("${core.requiredSkills}")
	List<String> requiredSkills;
	
	@Value("${core.baseSalary}")
	int baseSalary;
	
	@Override
	public String recommendPlacement(Student student) {
		
		System.out.println("Selected Strategy: Core Placement");
		System.out.println("Eligible:"+((minCgpa>6.0)?"YES":"No"));
		System.out.println("Recommended Salary: "+baseSalary);
		System.out.println("Required Skills: "+requiredSkills.toString());
		
		return student.toString();
	}

}
