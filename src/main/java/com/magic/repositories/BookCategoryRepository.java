package com.magic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magic.entities.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{

}
