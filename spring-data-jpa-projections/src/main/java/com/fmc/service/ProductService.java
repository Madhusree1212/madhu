package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fmc.repository.ProductProjectionRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductProjectionRepository repo;
	
	public List<ProductProjectionRepository.MyView>getVendorCodeAndCost(String vendorCode){
		return repo.findByVendorCode(vendorCode,ProductProjectionRepository.MyView.class);
	}
	
	public List<ProductProjectionRepository.MyViewTwo>getProdIdAndCost(String venderCode){
		return repo.findByVendorCode(venderCode,ProductProjectionRepository.MyViewTwo.class);
		
		
		
	}

	
}
