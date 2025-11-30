package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("commerce")
public class CommerceGrading implements IGradingSystem {

	@Override
	public String calculateGrade(int[] marks) {
		
		double avg = 0;
		for(int i : marks) {
			avg+=i;
		}
		
		String grade;
		
		avg/=marks.length;
		
		if(avg>=85) {
			grade="A+";
		}else if(avg>=70) {
			grade="A";
		}else if(avg>=55) {
			grade="B";
		}else if(avg>=35) {
			grade="C";
		}else {
			grade="Fail";
		}
		
		return grade;
	}

}
