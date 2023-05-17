package com.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookstore/inventory/")
public class LoginController {
	@RequestMapping("/")
	public String getLoginView() {
		return "home/login";
	}

	@RequestMapping("login/validate")
	public String getLoginView(String username, String password, Model model) {
		if (username.equals("admin") && password.equals("admin123")) {
			return "home/home-page";
		}
		model.addAttribute("msg", "Wrong Credentials.");
		return "home/login";
	}


}
