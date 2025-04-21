package com.fmc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.pojo.College;
import com.fmc.pojo.Student;
import com.fmc.repositoryclasses.CollegeRepository;
import com.fmc.repositoryclasses.StudentRepository;

@SpringBootApplication
public class RelationshipsSpringDataJpaPractiseApplication  implements CommandLineRunner{
	
	@Autowired
	private CollegeRepository repo;

	@Autowired
	private StudentRepository stuRepo;
	public static void main(String[] args) {
		SpringApplication.run(RelationshipsSpringDataJpaPractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student stu=new Student();
		stu.setName("Madhu");
		
		Student stu1=new Student();
		stu1.setName("Gopika");
		
		Student stu2=new Student();
		stu2.setName("Srevan");
		
		College clg=new College();
		clg.setCode(02);
		clg.setName("svdc");
		clg.setStudent(Arrays.asList(stu,stu1));
		
		College clg1=new College();
		clg1.setCode(01);
		clg1.setName("Mtcs");
		clg1.setStudent(Arrays.asList(stu2,stu1));

		//stu1.setCollege(clg);
		//set students to college
		
		  stu.setCollege(clg1); stu1.setCollege(clg); stu2.setCollege(clg1);
		 
		/*
		 * clg.setStudent(Arrays.asList(stu,stu1));
		 * clg1.setStudent(Arrays.asList(stu2,stu1));
		 */
		
		// save all the students
		
		repo.saveAll(Arrays.asList(clg,clg1));
		
	}

}
