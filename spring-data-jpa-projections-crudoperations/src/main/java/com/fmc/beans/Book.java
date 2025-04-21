package com.fmc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long Id;
	private String title;
	private String genre;
	private Double price;
	
	
	@ManyToOne
	@JoinColumn(name="author_id") 
	private Author author;
	
	
	
}
