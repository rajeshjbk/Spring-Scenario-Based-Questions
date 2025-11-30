package com.raj.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ManagementPlacementStrategy implements PlacementStrategy{


	@Value("${mgmt.minCgpa}")
	double minCgpa;
	
	@Value("${mgmt.requiredSkills}")
	List<String> requiredSkills;
	
	@Value("${mgmt.baseSalary}")
	int baseSalary;
	
	@Override
	public String recommendPlacement(Student student) {
		
		System.out.println("Selected Strategy: Management Placement");
		System.out.println((minCgpa>6.0)?"YES":"No");
		System.out.println("Recommended Salary: "+baseSalary);
		System.out.println("Required Skills: "+requiredSkills.toString());
		
		return student.toString();
	}

}
