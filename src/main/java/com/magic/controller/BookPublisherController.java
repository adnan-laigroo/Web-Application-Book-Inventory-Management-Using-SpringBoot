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
public class BookPublisherController {
	@Autowired
	private BookPublisherService publisherService;
	@Autowired
	private BookCategoryService categoryService;

	@RequestMapping("login/publisher/manage/list")
	public String publisherList(Model model) {
		List<BookPublisher> list = publisherService.getPublisherList();
		model.addAttribute("plist", list);
		return "publisher/publisher-list";
	}

	@RequestMapping("login/publisher/manage/add")
	public String getAddPublisheriew() {
		return "publisher/add-publisher";
	}

	@RequestMapping("login/publisher/manage/save")
	public String savePublisher(BookPublisher publisher, Model model) {
		publisherService.saveBookPublisher(publisher);
		// model.addAttribute("msg", "Publisher Added");
		List<BookPublisher> list = publisherService.getPublisherList();
		model.addAttribute("plist", list);
		return "publisher/publisher-list";
	}
	@RequestMapping("login/publisher/manage/edit")
	public String updatePublisherView(@RequestParam int pid, Model model) {
		BookPublisher publisher = publisherService.getPublisherByID(pid);
		model.addAttribute("pub", publisher);
		model.addAttribute("pubid", pid);
		List<BookCategory> list1 = categoryService.getCategoryList();
		List<BookPublisher> list2 = publisherService.getPublisherList();
		model.addAttribute("plist", list2);
		model.addAttribute("clist", list1);
		return "publisher/edit-publisher";
	}

	@RequestMapping("login/publisher/manage/update")
	public String updatePublisher(BookPublisher publisher, Model model) {
		publisherService.saveBookPublisher(publisher);
		List<BookPublisher> list = publisherService.getPublisherList();
		model.addAttribute("plist", list);
		return "publisher/publisher-list";
	}

	@RequestMapping("login/publisher/manage/remove")
	public String deletePublisherById(@RequestParam int pid, Model model) {
		publisherService.deletePublisherById(pid);
		List<BookPublisher> list = publisherService.getPublisherList();
		model.addAttribute("plist", list);
		return "publisher/publisher-list";
	}


}
