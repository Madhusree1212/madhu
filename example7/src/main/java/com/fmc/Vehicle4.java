package com.fmc;

import org.springframework.stereotype.Component;


public class Vehicle4 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle4() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle4 [name=" + name + "]";
	}
	
	public void printHello() {
		System.out.println("I am using a vehicle");
	}
}
