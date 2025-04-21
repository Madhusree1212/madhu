package com.fmc.repositoryclasses;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.pojoclasses.Course;

public interface CourseRepository  extends JpaRepository<Course, Integer>{

}
