
package com.fmc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	private VehicleBean vehicle;
	
	public void use() {
		System.out.println("Person is drivng the vehicle smoothly");
		vehicle.start();
	}
	

}
