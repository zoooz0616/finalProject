package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.TestVO;
import com.example.demo.service.ITestService;

@Controller
public class TestController {
   @Autowired
   ITestService testService;
   TestVO testVO = new TestVO();
   @GetMapping("/")
   public String test(Model model) {
      model.addAttribute("name","dmswl");
      model.addAttribute("testVO", testVO);
      return "test";
   }
   
   @GetMapping("/create")
   public String create(Model model) {
      model.addAttribute("testVO", testVO);
      testService.createTest();
      return "test";
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
         model.addAttribute("userId","null");
      }else {
         System.out.println(testVO.getUserId());
         model.addAttribute("userId",testVO.getUserId() );
      }
      return "test";
   }
}