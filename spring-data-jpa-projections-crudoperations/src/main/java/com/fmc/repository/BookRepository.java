package com.fmc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.beans.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
	
	interface BookTitleAuthorName{
		String getTitle();
		String getAuthorName();
	}
	 interface BookSummary{
		String getTitle();
		Double getPrice();
		
	}
	<T> List<T> findByTitle(String title,Class<T>clz) ;
	

}
