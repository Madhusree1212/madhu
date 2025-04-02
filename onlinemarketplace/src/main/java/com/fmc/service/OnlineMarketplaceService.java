package com.fmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fmc.interfaces.Seller;

@Component
public class OnlineMarketplaceService {
	
	private Seller seller;
	
	@Autowired
	public OnlineMarketplaceService(@Qualifier("corporateseller")Seller seller) {
		this.seller=seller;
	}
	public void add() {
		seller.addProduct();
	}
	public void remove() {
		seller.removeProduct();
	}
	public void caluclate( int unitsSold) {
		System.out.println("Total sales: "+seller.calculateSales(unitsSold));
	}
	
	
	

}
