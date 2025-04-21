package com.fmc.repositoryclasses;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.pojo.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
