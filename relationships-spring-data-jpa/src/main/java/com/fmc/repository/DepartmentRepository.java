package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.pojoclasses.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
