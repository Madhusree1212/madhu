package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.pojoclasses.Employee;

public interface EmployeeRepository extends  JpaRepository<Employee, Integer> {

}
