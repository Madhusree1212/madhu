package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name="liki";
	
	// it is constructor injection-->@Autowired is optional inn consructor injection
	//@Autowired 
	/*public Person(Vehicle5 vehicle) {
		System.out.println("person bean created ");
		this.vehicle=vehicle;
	}*/
	// it is field injection
	//@Autowired
	private Vehicle5 vehicle;
	
	
	public String getName() {
		return name;
	}
	 public void setName(String name) {  
	        this.name = name;
	 }
	public Vehicle5 getVehicle() {
		return vehicle;
	}
	
	//I am using Setter injection here
	@Autowired
	public void setVehicle(Vehicle5 vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	
}
