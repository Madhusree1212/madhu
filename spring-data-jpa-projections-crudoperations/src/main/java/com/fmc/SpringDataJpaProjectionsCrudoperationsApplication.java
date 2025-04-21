package com.fmc;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fmc.beans.Author;
import com.fmc.beans.Book;
import com.fmc.repository.AuthorRepository;
import com.fmc.repository.BookRepository;

@SpringBootApplication
public class SpringDataJpaProjectionsCrudoperationsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaProjectionsCrudoperationsApplication.class, args);
	}

	
	@Autowired
	private BookRepository repo;
	
	@Autowired
	private AuthorRepository author;
	
	@Override
	public void run(String... args) throws Exception {
		Author a1=new Author();
		a1.setName(" F. Scott Fitzgerald");
		a1.setCountry("Us");
		
		Author a2=new Author();
		a2.setName("To Kill a Mockingbird");
		a2.setCountry("Canada");
		
		Author a3=new Author();
		a3.setName(" George Orwell");
		a3.setCountry("America");
		
		Author a4=new Author();
		a4.setName("Ravi Mantri");
		a4.setCountry("India");
		
		author.saveAll(Arrays.asList(a1,a2,a3,a4));
		
		Book b1=new Book();
		b1.setTitle("The Great Gatsby");
		b1.setGenre("Fantacy");
		b1.setPrice(50.00);
		b1.setAuthor(a1);
		
		Book b2=new Book();
		b2.setTitle("To Kill a Mockingbird");
		b2.setGenre("Mystery");
		b2.setPrice(55.00);
		b2.setAuthor(a2);
		
		
		Book b3=new Book();
		b3.setTitle("1984");
		b3.setGenre("Thriller");
		b3.setPrice(40.00);
		b3.setAuthor(a3);
		
		
		Book b4=new Book();
		b4.setTitle("Amma Prema ");
		b4.setGenre("Lovely");
		b4.setPrice(150.00);
		b4.setAuthor(a4);
		
		
		repo.saveAll(Arrays.asList(b1,b2,b3,b4));
		
		// using book repository getting author name and title
		List<BookRepository.BookTitleAuthorName>myview=repo.findByTitle("1984", BookRepository.BookTitleAuthorName.class);
		myview.forEach(view->
		System.out.println("Author: "+view.getAuthorName()+" Title: "+view.getTitle()));
		
		//fetching title and price
		
		List<BookRepository.BookSummary>myview1=repo.findByTitle("1984", BookRepository.BookSummary.class);
			myview1.forEach(view->
			System.out.println("Title: "+view.getTitle()+" Price: "+view.getPrice()));
		
	// fetching author details
			List<AuthorRepository.AuthorNameOnly>author1= author.findByName("George Orwell",AuthorRepository.AuthorNameOnly.class );
			author1.forEach(view->
			System.out.println("Name :"+view.getName()));
			
	// here  performing crud operations
		// 1.1 delete by book reference	
			repo.delete(b1);
			repo.save(new Book());
			
		
		
		
	}

}
