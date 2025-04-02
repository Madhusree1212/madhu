package com.fmc.interfaces;

import org.springframework.stereotype.Component;

@Component("corporateseller")
public class CorporateSeller  implements Seller{

	public void addProduct() {
		System.out.println(" CorporateSeller adds products ");
	}

	public void removeProduct() {
		System.out.println(" CorporateSeller removes products ");

	}

	public double calculateSales(int unitsSold) {
		return unitsSold*20;
	}

}
