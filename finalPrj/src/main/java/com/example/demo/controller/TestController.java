package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ITestService;

@Controller
public class TestController {
	@Autowired
	ITestService testService;
	
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("name","dmswl");
		return "test";
	}
	
	@PostMapping("create")
	public String create() {
		testService.createTest();
		return "redirect:/";
	}
	@PostMapping("update")
	public String update() {
		testService.updateTest();
		return "redirect:/";
	}
	@RequestMapping("delete")
	public String delete() {
		testService.deleteTest();
		return "redirect:/";
	}
	@GetMapping("select")
	public String select() {
		testService.selectTest();
		return "redirect:/";
	}
}
