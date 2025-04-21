package com.fmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fmc.beanclasses.ProductProjections;



public interface ProductProjectionRepository  extends JpaRepository<ProductProjections, Integer>{
	
	// projections for vendercode and prodcost
	interface MyView{
	String getVendorCode();
	Double getProdCost();	
		
	}

	// projections for Prodid and prodcost
	interface MyViewTwo{
		Integer getProdId();
		Double getProdCost();
	}
	
	// Dynamic projection method

	<T> List<T> findByVendorCode(String vc,Class<T> clz);
}
