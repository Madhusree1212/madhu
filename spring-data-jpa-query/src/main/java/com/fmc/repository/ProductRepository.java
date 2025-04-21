package com.fmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fmc.beanclasses.ProductQuery;

public interface ProductRepository extends JpaRepository<ProductQuery, Integer> {
	/*
	 * //Query to fetch all products where vender code is matches or prodcost is
	 * greaterr then a specific value.
	 * 
	 * @Query("select p from product p where p.vendor_Code:a OR p.prod_Cost>:b")
	 * List<ProductQuery>getAllProducts(@Param("a") String vendor_Code,@Param("b")
	 * Double prod_Cost );
	 * 
	 * // Query to fetch anly product code where vendercode matches or prodcost
	 * equals a specific value
	 * 
	 * @Query("select p.venderCode from product p where p.vender_Code=?1 OR  p.prod_Cost=?2"
	 * ) List<ProductQuery>getAllprodCodes(String vender_Code, Double prod_Cost);
	 * 
	 * // Query to fetch product codes and costs for all products
	 * 
	 * @Query("select p.vender_Code,p.prod_Cost from product p")
	 * List<Object[]>getAllProductData();
	 */
	
	// Query to fetch all products where vendorCode matches or prodCost is greater than a specific value
    @Query("SELECT p FROM ProductQuery p WHERE p.vendor_Code = :a OR p.prod_Cost > :b")
    List<ProductQuery> getAllProducts(@Param("a") String vendor_Code, @Param("b") Double prod_Cost);

    // Query to fetch only product codes where vendorCode matches or prodCost equals a specific value
    @Query("SELECT p.vendor_Code FROM ProductQuery p WHERE p.vendor_Code = ?1 OR p.prod_Cost = ?2")
    List<String> getAllProductCodes(String vendor_Code, Double prod_Cost);

    // Query to fetch product codes and costs for all products
    @Query("SELECT p.vendor_Code, p.prod_Cost FROM ProductQuery p")
    List<Object[]> getAllProductData();
}
