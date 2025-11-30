package com.raj.sbeans;

public class Hospital {

	String hospitalName;
	Doctor doctor;
	Equipment equipment;
	
	public Hospital(String hospitalName, Doctor doctor, Equipment equipment) {
		super();
		this.hospitalName = hospitalName;
		this.doctor = doctor;
		this.equipment = equipment;
	}
	
    public void showDetails() {
    	System.out.println("Hospital: "+hospitalName);
    	doctor.showDoctor();
    	equipment.showEquipment();
    }
}
