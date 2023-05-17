package com.magic.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magic.entities.BookPublisher;
import com.magic.repositories.BookPublisherRepository;
import com.magic.service.BookPublisherService;

@Service
public class BookPublisherServiceImplementation implements BookPublisherService {

	@Autowired
	private BookPublisherRepository publisherRepo;

	public List<BookPublisher> getPublisherList() {
		return publisherRepo.findAll();
	}

	public void saveBookPublisher(BookPublisher publisher) {
		publisherRepo.save(publisher);

	}

	@Override
	public BookPublisher getPublisherByID(int pid) {
		return publisherRepo.findById(pid).orElse(null);
	}

	@Override
	public void deletePublisherById(int pubid) {
		publisherRepo.deleteById(pubid);
		
	}
}
