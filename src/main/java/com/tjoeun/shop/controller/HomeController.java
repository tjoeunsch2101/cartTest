package com.tjoeun.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// url pattern / 이면 index.html 을 찾아감
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/git")
	public String git() {
		return "git";
	}

	@GetMapping("/branch")
	public String branch() {
		return "branch";
	}

}
