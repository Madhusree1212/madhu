package com.fum;

import org.springframework.util.StringUtils;

public class Product {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}

	
	
}
