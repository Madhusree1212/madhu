package com.fmc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fmc.instructor.Instructor;
import com.fmc.material.Material;


@Component
public class CourseService {
	
	private Instructor instructor;
	private Material meterial;
	@Autowired
	public CourseService(@Qualifier("john")Instructor instructor,@Qualifier("videomaterial")Material meterial) {
		this.instructor=instructor;
		this.meterial=meterial;
		
	}
	public void study() {
		meterial.provideMaterial();
	}
	public void learn() {
		instructor.teach();
	}
	

}
