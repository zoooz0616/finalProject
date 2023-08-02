package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TestVO;

public interface ITestService {
	void createTest(TestVO testVO);

	void updateTest();

	void deleteTest();

	List<TestVO> selectTest();
}