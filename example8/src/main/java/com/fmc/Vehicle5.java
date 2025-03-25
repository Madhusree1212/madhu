package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class Vehicle5 {
	private String name="car";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle5() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle5 [name=" + name + "]";
	}
	
}
