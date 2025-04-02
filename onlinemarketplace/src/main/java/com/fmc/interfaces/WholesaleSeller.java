package com.fmc.interfaces;

import org.springframework.stereotype.Component;

@Component
public class WholesaleSeller implements Seller {

	public void addProduct() {
		System.out.println("adding products Wholesale");		
	}

	public void removeProduct() {
		System.out.println("remove products Wholesale");
	}

	public double calculateSales(int unitsSold) {
		return unitsSold*5;
	}

}
