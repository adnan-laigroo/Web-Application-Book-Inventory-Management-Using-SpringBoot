package com.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookstore/inventory/")
public class HomeController {

	@RequestMapping("login/home")
	public String getHomeView() {
		return "home/home-page";
	}

}
