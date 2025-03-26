package com.fmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Product1 {
	private String name;
	private Shop shop;
	
	public Product1(@Qualifier("shop")Shop shop) {
	System.out.println("person bean created ");
	this.shop=shop;
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", shop=" + shop + "]";
	}

	
	

}
