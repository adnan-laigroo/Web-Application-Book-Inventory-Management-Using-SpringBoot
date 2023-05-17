package com.magic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magic.entities.Book;
import com.magic.entities.BookCategory;
import com.magic.entities.BookPublisher;
import com.magic.service.BookCategoryService;
import com.magic.service.BookPublisherService;
import com.magic.service.BookService;

@Controller
@RequestMapping("/bookstore/inventory/")
public class BookController {
	@Autowired
	private BookService bookService;
	@Autowired
	private BookCategoryService categoryService;
	@Autowired
	private BookPublisherService publisherService;

	@RequestMapping("login/book/manage/list")
	public String bookList(Model model) {
//		model.addAttribute("pn", 1);
//		model.addAttribute("tp", 1);
		List<Book> list = bookService.getBookList();
		model.addAttribute("blist", list);
		return "book/book-list";
	}

	@RequestMapping("login/book/manage/add")
	public String getAddBookView(Model model) {
		List<BookCategory> list1 = categoryService.getCategoryList();
		List<BookPublisher> list2 = publisherService.getPublisherList();
		model.addAttribute("plist", list2);
		model.addAttribute("clist", list1);
		return "book/add-book";
	}

	@RequestMapping("login/book/manage/save")
	public String saveCategory(Book book, Model model) {
		bookService.saveBook(book);
		model.addAttribute("pn", 1);
		model.addAttribute("tp", 1);
		List<Book> list = bookService.getBookList();
		model.addAttribute("blist", list);
		return "book/book-list";
	}

	@RequestMapping("login/book/manage/edit")
	public String updateBookView(@RequestParam int bid, Model model) {
		Book book = bookService.getBookByID(bid);
		model.addAttribute("book", book);
		model.addAttribute("bid", bid);
		List<BookCategory> list1 = categoryService.getCategoryList();
		List<BookPublisher> list2 = publisherService.getPublisherList();
		model.addAttribute("plist", list2);
		model.addAttribute("clist", list1);
		return "book/edit-book";
	}

	@RequestMapping("login/book/manage/update")
	public String updateBook(Book book, Model model) {
		bookService.saveBook(book);
		model.addAttribute("pn", 1);
		model.addAttribute("tp", 1);
		List<Book> list = bookService.getBookList();
		model.addAttribute("blist", list);
		return "book/book-list";
	}

	@RequestMapping("login/book/manage/remove")
	public String deleteById(@RequestParam int bid, Model model) {
		bookService.deleteById(bid);
		model.addAttribute("pn", 1);
		model.addAttribute("tp", 1);
		List<Book> list = bookService.getBookList();
		model.addAttribute("blist", list);
		return "book/book-list";
	}

}
