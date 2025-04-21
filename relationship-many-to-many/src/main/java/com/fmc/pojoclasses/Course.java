package com.fmc.pojoclasses;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
/*
 * @Setter
 * 
 * @Getter
 */
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long courseId;
	private String title;
	
	@ManyToMany(mappedBy="course",cascade=CascadeType.ALL)
	private Set<Student>student;
	
	
	/*
	 * public Long getId() { return id; }
	 * 
	 * public void setId(Long id) { this.id = id; }
	 * 
	 * public String getTitle() { return title; }
	 * 
	 * public void setTitle(String title) { this.title = title; }
	 * 
	 * public Set<Student> getStudent() { return student; }
	 * 
	 * public void setStudent(Set<Student> student) { this.student = student; }
	 */


	
	
	
}
