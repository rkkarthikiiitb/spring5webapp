package com.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springframework.spring5webapp.model.Author;
import com.springframework.spring5webapp.model.Book;
import com.springframework.spring5webapp.model.BookStore;
import com.springframework.spring5webapp.model.Publisher;
import com.springframework.spring5webapp.repositories.AuthorRepository;
import com.springframework.spring5webapp.repositories.BookRepository;
import com.springframework.spring5webapp.repositories.BookStoreRepository;
import com.springframework.spring5webapp.repositories.PublisherRepository;


@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
	
	AuthorRepository authorRepository;
	BookRepository bookRepository;
	PublisherRepository publisherRepository;
	BookStoreRepository bookStoreRepository;
	
	

	public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, BookStoreRepository bookStoreRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		this.bookStoreRepository = bookStoreRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
		
		
	}

	private void initData() {
		
		Author jk = new Author("JK","Rowling");
		Publisher hc = new Publisher("Harper Collins","221 Aramadale St London");
		Book hp = new Book("Harry Potter","1234322",hc);
		BookStore flipkart = new BookStore("Flipkart","Y",20);
		
		
		jk.getBooks().add(hp);
		hp.getAuthors().add(jk);
		//hp.getPublisher();
		bookStoreRepository.save(flipkart);
		authorRepository.save(jk);
		publisherRepository.save(hc);
		bookRepository.save(hp);
		
		
		Author cd = new Author("Conan","Doyle");
		Publisher bp = new Publisher("Baskerville Publications","123 Collins Sq Leeds");
		Book sh = new Book("Sherlock Holmes","1122321",bp);
		
		cd.getBooks().add(sh);
		sh.getAuthors().add(cd);
		
		authorRepository.save(cd);
		publisherRepository.save(bp);
		bookRepository.save(sh);
		
		}

}
