package com.fmc;



public class Vehicle3 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle3() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle3 [name=" + name + "]";
	}
	
	public void printHello() {
		this.name="honda";
	}
	
}
