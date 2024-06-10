package com.example.bufsroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/room")
	@ResponseBody
	public String index() {
		return "";
	}

	@GetMapping("/")
	public String root() {
		return "";
	}
}