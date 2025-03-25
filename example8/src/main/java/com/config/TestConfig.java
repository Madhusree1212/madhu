package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fmc")
public class TestConfig {
	
	/*@Bean
	public Vehicle5 vehicle() {
		Vehicle5 vehicle=new Vehicle5();
		vehicle.setName("toyato");
		return vehicle;
	}
	
	@Bean
	public Person person() {
		Person person=new Person();
			person.setName("madhu");
			person.setVehicle(vehicle());
		return person;
	}*/
	
}
