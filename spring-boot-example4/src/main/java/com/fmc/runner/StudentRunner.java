package com.fmc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.fmc.beans.Student;

@Component
public class StudentRunner implements CommandLineRunner,Ordered {
	
	@Autowired
	private Student stu;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(stu);
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 16;
	}

}
