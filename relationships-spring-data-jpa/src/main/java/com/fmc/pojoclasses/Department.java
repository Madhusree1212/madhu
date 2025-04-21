package com.fmc.pojoclasses;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
	private List<Employee> employees;

	/*
	 * public void setName(String string) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	

}
