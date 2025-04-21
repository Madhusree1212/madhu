package com.fmc.repositoryclasses;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.pojo.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
