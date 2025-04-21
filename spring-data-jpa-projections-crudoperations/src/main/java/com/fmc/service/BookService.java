package com.fmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fmc.repository.BookRepository;

public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public List<BookRepository.BookTitleAuthorName>getTitleAndAuthorName(String title) {
		return repo.findByTitle(title, BookRepository.BookTitleAuthorName.class);
	}
	
	public List<BookRepository.BookSummary>getTitleAndPrice(String title){
		return repo.findByTitle(title, BookRepository.BookSummary.class);
	}


}
