package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.beans.Employee;
import com.fmc.beans.Student;

@SpringBootApplication
//@EnableConfigurationProperties(Employee.class) 

public class SpringBootExample4Application  {
	
	@Autowired
	private Employee emp;
	
	
	  @Autowired
	  private Student stu;
	 
	
	//@Override
	/*
	 * public void run(String... args) throws Exception {
	 * //System.out.println(stu.getId());
	 * //System.out.println(emp.getProperty("emp.info.id"));
	 * System.out.println(emp); System.out.println(stu);
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample4Application.class, args);
	}

	

}
