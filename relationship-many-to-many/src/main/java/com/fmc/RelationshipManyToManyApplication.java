package com.fmc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.pojoclasses.Course;
import com.fmc.pojoclasses.Student;
import com.fmc.repositoryclasses.CourseRepository;

@SpringBootApplication
public class RelationshipManyToManyApplication implements CommandLineRunner {

	@Autowired
	 private CourseRepository repo;
	//private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(RelationshipManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student();
		s1.setName("Madhu");

		Student s2 = new Student();
		s2.setName("Gayathri");

		Student s3 = new Student();
		s3.setName("Likith");

		Student s4 = new Student();
		s4.setName("Gopika");

		Course c1 = new Course();
		c1.setTitle("Java");

		Course c2 = new Course();
		c2.setTitle("Spring");
		  
		  // setting values to many to many to courses 
		  c1.setStudent(new HashSet<>(Set.of(s1,s4))); 
		  c2.setStudent(new HashSet<>(Set.of(s2,s3)));
		  //setting values to many to many to students
		  s1.setCourse(Set.of(c1));
		  s2.setCourse(Set.of(c2));
		  s3.setCourse(Set.of(c2));
		  s4.setCourse(Set.of(c1));
		  
		  // saving all the values
		  
		  repo.saveAll(Arrays.asList(c1, c2));
		 
		
		
		

	}

}
