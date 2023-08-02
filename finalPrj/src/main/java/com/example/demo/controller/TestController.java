package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class TestController {
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("name","dmswl");
		return "test";
	}
}
