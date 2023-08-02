package com.example.demo.service;

import com.example.demo.model.TestVO;

public interface ITestService {
	void createTest(TestVO testVO);

	void updateTest();

	void deleteTest();

	TestVO selectTest(String userId);
}