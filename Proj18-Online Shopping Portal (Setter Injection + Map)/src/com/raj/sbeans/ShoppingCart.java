package com.raj.sbeans;

import java.util.Map;

public class ShoppingCart {

	String cartOwner;
	Map<Product, Vendor> productVendorMap;
	
	public void setCartOwner(String cartOwner) {
		this.cartOwner = cartOwner;
	}
	public void setProductVendorMap(Map<Product, Vendor> productVendorMap) {
		this.productVendorMap = productVendorMap;
	}
	
	public void showCartDetails() {
		
		System.out.println("Cart Owner: "+cartOwner);
		System.out.println("Cart Details: ");
		productVendorMap.forEach((x,y)->{
			x.showProductDetails();
			y.showVendorDetails();
		});
	}
}
