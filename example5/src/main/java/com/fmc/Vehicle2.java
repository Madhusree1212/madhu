package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class Vehicle2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle2() {
		super();
	// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle2 [name=" + name + "]";
	}
	

}
