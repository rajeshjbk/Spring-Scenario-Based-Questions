package com.raj.sbeans;

public class Vendor {

	int vendorId;
	String vendorName;
	long contactNumber;
	
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public void showVendorDetails() {
		
		System.out.println(" | Vendor: "+vendorName+" ("+contactNumber+")");
	}
}
