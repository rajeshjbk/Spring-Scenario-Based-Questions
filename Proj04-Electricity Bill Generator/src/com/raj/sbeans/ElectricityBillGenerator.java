package com.raj.sbeans;

public class ElectricityBillGenerator {

	int unitsConsumed;

	double ratePerUnit;

	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public void generateBill() {
		
		System.out.println("Total Electricity Bill: "+unitsConsumed*ratePerUnit);
	}

}
