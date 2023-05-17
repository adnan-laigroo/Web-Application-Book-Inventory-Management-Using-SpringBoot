package com.magic.service;

import java.util.List;

import com.magic.entities.BookCategory;

public interface BookCategoryService {
	List<BookCategory> getCategoryList();


	void saveBookCategory(BookCategory category);


	BookCategory getCategoryByID(int cid);


	void deleteCategorById(int catid);

}
