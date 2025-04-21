package com.fmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.beans.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

	public interface AuthorNameOnly {
	    String getName();
	}
	
	<T> List<T>findByName(String name,Class<T>clx);


	
	
	

}
