package com.fmc.beanclasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductQuery {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer prod_Id;
	private String prod_Name;
	private String prod_Code;
	private Double prod_Cost;
	private String vendor_Code;
	
}
