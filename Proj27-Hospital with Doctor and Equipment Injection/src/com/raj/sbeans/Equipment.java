package com.raj.sbeans;

public class Equipment {

	String equipmentName;
	double cost;
	
	public Equipment(String equipmentName, double cost) {
		super();
		this.equipmentName = equipmentName;
		this.cost = cost;
	}

    public void showEquipment() {
    	
    	System.out.println("Equipment: "+equipmentName+" (Cost: ₹"+cost+")");
    }
}
