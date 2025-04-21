package com.fmc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.beanclasses.Product;

import java.util.Collection;
import java.util.List;


public interface ProductRepository  extends JpaRepository<Product, Integer>{
	
	// select * from prodtab where prod code=prodcode;
	Product  findByProdCode(String prodCode);
	
	//select * from prodtab where prod_code like prodcode
	List<Product> findByProdCodeLike(String pc);
	
	//select * from prodtab where prod codeis null
	List<Product>findByProdCodeIsNull();
	
	// select * from prodtab where prod_cost>cost;
	List<Product> findByProdCostGreaterThan(Double cost);
	
	//select  * from prodtab where prod_code in (cost)
	List<Product>findByProdCostIn(Collection<Double> prodCost);
	
	//select * from prodtab where pid=?Or pcost=?
	List<Product> findByProdIdOrProdCost(Integer prodId,Double prodCost);
	
	//select * from prodtab where pid between pid1 and pid2
	List<Product>findByProdIdBetween(Integer pid1,Integer pid2);
	
	//select * from prodtab where prod_cost<cost
	List<Product>findByProdCostLessThan(Double prodCost);
	
	List<Product> findByProdNameStartingWith(String prodName);

    List<Product> findByProdNameEndingWith(String prodName);
	
	//select * from  protab where name starting with
	/*
	 * List<Product> findByProdNameStartingWithList(String prodName);
	 * 
	 * // select * from protab where name endwith List<Product>findByProdName(String
	 * prodName);
	 */	
}
