package com.magic.service;

import java.util.List;

import com.magic.entities.Book;

public interface BookService {

	List<Book> getBookList();

	

	void saveBook(Book book);



	Book getBookByID(int bid);



	void deleteById(int bid);



	List<Book> getBookByAuthor(String author);



	List<Book> getBookByTitle(String title);



	List<Book> getBookByCategory(int cid);



	List<Book> getBookByPublisher(int pubid);

}
