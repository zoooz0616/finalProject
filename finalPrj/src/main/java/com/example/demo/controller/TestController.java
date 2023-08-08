package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/update/{userId}")
	public String update(@PathVariable String userId, Model model) {
		TestVO testVO= testService.getTestVO(userId);
		model.addAttribute("testVO", testVO);
		return "update";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request) {
		TestVO testVO = new TestVO();
		testVO.setUserId(request.getParameter("userId"));
		testVO.setUserPw(request.getParameter("userPw"));
		testVO.setNickname(request.getParameter("nickname"));
		testVO.setPhone(request.getParameter("phone"));
		testVO.setMemo(request.getParameter("memo"));
		testService.updateTest(testVO);
		return "redirect:/select";
	}
	
	@GetMapping("/delete")
	public String delete(Model model) {
		List<TestVO> testVOList = new ArrayList<TestVO>();
		testVOList = testService.selectTest();
		model.addAttribute("testVOList", testVOList);
		return "delete";
	}
	
	@GetMapping("/delete/{userId}")
	public String delete(@PathVariable String userId, Model model) {
		testService.deleteTest(userId);
		return "redirect:/delete";
	}

	@GetMapping("/select")
	public String select(Model model) {
		List<TestVO> testVOList = new ArrayList<TestVO>();
		testVOList = testService.selectTest();
		model.addAttribute("testVOList", testVOList);
		return "read";
	}

}