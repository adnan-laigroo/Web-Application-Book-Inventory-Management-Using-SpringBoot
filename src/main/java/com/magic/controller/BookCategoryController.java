package com.magic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.magic.entities.BookCategory;
import com.magic.entities.BookPublisher;
import com.magic.service.BookCategoryService;
import com.magic.service.BookPublisherService;

@Controller
@RequestMapping("/bookstore/inventory/")
public class BookCategoryController {
	@Autowired
	private BookCategoryService categoryService;
	@Autowired
	private BookPublisherService publisherService;

	@RequestMapping("login/category/manage/list")
	public String categoryList(Model model) {

		List<BookCategory> list = categoryService.getCategoryList();
		model.addAttribute("clist", list);
		return "category/category-list";
	}

	@RequestMapping("login/category/manage/add")
	public String getAddCategoryView() {
		return "category/add-category";
	}

	@RequestMapping("login/category/manage/save")
	public String saveCategory(BookCategory category, Model model) {
		categoryService.saveBookCategory(category);
		// model.addAttribute("msg", "Category Added");
		List<BookCategory> list = categoryService.getCategoryList();
		model.addAttribute("clist", list);
		return "category/category-list";
	}

	@RequestMapping("login/category/manage/edit")
	public String updateCategoryView(@RequestParam int cid, Model model) {
		BookCategory category = categoryService.getCategoryByID(cid);
		model.addAttribute("cat", category);
		model.addAttribute("catid", cid);
		List<BookCategory> list1 = categoryService.getCategoryList();
		List<BookPublisher> list2 = publisherService.getPublisherList();
		model.addAttribute("plist", list2);
		model.addAttribute("clist", list1);
		return "category/edit-category";
	}

	@RequestMapping("login/category/manage/update")
	public String updateCategory(BookCategory category, Model model) {
		categoryService.saveBookCategory(category);
		List<BookCategory> list = categoryService.getCategoryList();
		model.addAttribute("clist", list);
		return "category/category-list";
	}
	@RequestMapping("login/category/manage/remove")
	public String deleteCategoryById(@RequestParam int cid, Model model) {
		categoryService.deleteCategorById(cid);
		List<BookCategory> list = categoryService.getCategoryList();
		model.addAttribute("clist", list);
		return "category/category-list";
	}
}
