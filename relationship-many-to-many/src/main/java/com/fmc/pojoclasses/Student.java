package com.fmc.pojoclasses;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="student_course",
	joinColumns=@JoinColumn(name="student_id",referencedColumnName = "id"),
	inverseJoinColumns=@JoinColumn(name="course_id", referencedColumnName = "courseId"))
	
	private Set<Course>course;

	

	

	

}
