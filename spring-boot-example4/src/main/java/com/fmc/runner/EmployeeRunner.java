package com.fmc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.fmc.beans.Employee;

@Component
@Order(1)
public class EmployeeRunner implements CommandLineRunner {
	
	@Autowired
	private Employee emp;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emp);
	}

}
