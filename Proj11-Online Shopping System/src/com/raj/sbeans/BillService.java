package com.raj.sbeans;

public class BillService {

	double taxPercentage;
	double discountPercentage;
	
	public BillService(double taxPercentage, double discountPercentage) {
		super();
		this.taxPercentage = taxPercentage;
		this.discountPercentage = discountPercentage;
	}
	
	public void calculateTotal(Order order) {
		
		order.showOrderDetails();
		double total = order.quantity*order.product.price;
		System.out.println("Base Amount: ₹"+total);
		
		double tax=(total*18)/100;
		System.out.println("Tax (18%): ₹"+tax);
		
		double discount=(total*10)/100;
		System.out.println("Discount (10%): ₹"+discount);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Final Bill: ₹"+(total+tax-discount));
		System.out.println("Thank you for shopping with us!");
	}
}
