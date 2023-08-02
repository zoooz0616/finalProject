package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.TestVO;
import com.example.demo.service.ITestService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
	@Autowired
	ITestService testService;
	TestVO testVO = new TestVO();

	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("name", "dmswl");
		model.addAttribute("testVO", testVO);
		return "test";
	}

	@GetMapping("/create")
	public String create() {
		return "create";
	}

	@PostMapping("/create")
	public String create(Model model, HttpServletRequest request) {
		TestVO testVO = new TestVO();
		testVO.setUserId(request.getParameter("userId"));
		testVO.setUserPw(request.getParameter("userPw"));
		testVO.setNickname(request.getParameter("nickname"));
		testVO.setPhone(request.getParameter("phone"));
		testVO.setMemo(request.getParameter("memo"));
		model.addAttribute("testVO", testVO);
		System.out.println(testVO);
		testService.createTest(testVO);
		return "redirect:/";
	}

	@GetMapping("/update")
	public String update(Model model) {
		model.addAttribute("testVO", testVO);
		testService.updateTest();
		return "test";
	}

	@GetMapping("/delete")
	public String delete(Model model) {
		model.addAttribute("testVO", testVO);
		testService.deleteTest();
		return "test";
	}

	@GetMapping("/select")
	public String select(Model model) {
		testVO = testService.selectTest("team3");
		if (testVO == null) {
			model.addAttribute("userId", "null");
		} else {
			System.out.println(testVO.getUserId());
			model.addAttribute("userId", testVO.getUserId());
		}
		return "test";
	}
}