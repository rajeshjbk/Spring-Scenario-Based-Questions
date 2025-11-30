package com.raj.sbeans;

public class OnlineStore {

	Order order;
	BillService billService;
	
	public OnlineStore(Order order, BillService billService) {
		super();
		this.order = order;
		this.billService = billService;
	}
	
	public void generateInvoice() {
		
		System.out.println("=== INVOICE ===");
		billService.calculateTotal(order);
		
	}
}
