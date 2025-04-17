package com.data_jpa.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer>{
	
}
