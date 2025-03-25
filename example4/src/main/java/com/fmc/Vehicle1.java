package com.fmc;

import org.springframework.stereotype.Component;

@Component

public class Vehicle1 {
	private String name="madhu";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "VehicleDemo [name=" + name + "]";
	}

	public Vehicle1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void printHello(){
        System.out.println("Printing Hello from Component Vehicle Bean");
	}
	
}
