package com.fmc.interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class IndividualSeller implements Seller {

	public void addProduct() {
		System.out.println("I am adding the products individually");
	}

	public void removeProduct() {
		System.out.println("I am removing  the products individually");
		
	}

	public double calculateSales(int unitsSold) {
		return unitsSold*10;
		
	}

}
