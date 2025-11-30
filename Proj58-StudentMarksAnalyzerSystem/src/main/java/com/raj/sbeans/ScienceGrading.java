package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("science")
public class ScienceGrading implements IGradingSystem {

	@Override
	public String calculateGrade(int[] marks) {
		
		int avg = 0;
		for(int i : marks) {
			avg+=i;
		}
		
		String grade;
		
		avg/=marks.length;
		
		if(avg>=90) {
			grade="A+";
		}else if(avg>=75) {
			grade="A";
		}else if(avg>=60) {
			grade="B";
		}else if(avg>=40) {
			grade="C";
		}else {
			grade="Fail";
		}
		
		return grade;
	}

}
