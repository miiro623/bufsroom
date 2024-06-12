package com.example.bufsroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login_form";
	}

	@GetMapping("/signup")
	public String signup() {
		return "page2";
	}

}