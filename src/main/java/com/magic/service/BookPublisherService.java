package com.magic.service;

import java.util.List;

import com.magic.entities.BookPublisher;

public interface BookPublisherService {
	List<BookPublisher> getPublisherList();

	void saveBookPublisher(BookPublisher publisher);

	BookPublisher getPublisherByID(int cid);

	void deletePublisherById(int pubid);

}
