package com.magic.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magic.entities.BookCategory;
import com.magic.repositories.BookCategoryRepository;
import com.magic.service.BookCategoryService;

@Service
public class BookCategoryServiceImplementation implements BookCategoryService {

	@Autowired
	private BookCategoryRepository categoryRepo;

	public List<BookCategory> getCategoryList() {
		return categoryRepo.findAll();
	}

	public void saveBookCategory(BookCategory category) {
		categoryRepo.save(category);

	}
	public BookCategory getCategoryByID(int cid) {
		return categoryRepo.findById(cid).orElse(null);
	}

	@Override
	public void deleteCategorById(int catid) {
		categoryRepo.deleteById(catid);
		
	}
}
