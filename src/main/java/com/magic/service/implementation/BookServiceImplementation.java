package com.magic.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magic.entities.Book;
import com.magic.repositories.BookRepository;
import com.magic.service.BookService;

@Service
public class BookServiceImplementation implements BookService {

	@Autowired
	private BookRepository bookRepo;

	public List<Book> getBookList() {
		return bookRepo.findAll();
	}

	public void saveBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public Book getBookByID(int bid) {
		return bookRepo.findById(bid).orElse(null);
	}

	public void deleteById(int bid) {
		bookRepo.deleteById(bid);
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		return bookRepo.findByAuthor(author);
		
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookRepo.findByTitle(title);
	}

	@Override 
	public List<Book> getBookByCategory(int cid) {
		return bookRepo.findByCatid(cid);
	}
	@Override 
	public List<Book> getBookByPublisher(int pubid) {
		return bookRepo.findByPubid(pubid);
	}

}
