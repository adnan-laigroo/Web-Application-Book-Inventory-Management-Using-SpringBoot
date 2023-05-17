package com.magic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	

	
	//@Query("from Book where author=:arg")
	List<Book> findByAuthor( String author);

	List<Book> findByTitle(String title);

	List<Book> findByCatid(int cid);

	List<Book> findByPubid(int pubid);

}
