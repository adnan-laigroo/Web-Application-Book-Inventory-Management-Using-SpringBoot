package com.magic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookstore/inventory/")
public class LogoutController {
	@RequestMapping("login/logout")
	public String logout(HttpSession ses) {
		ses.invalidate();
		return "home/login";
	}
}
