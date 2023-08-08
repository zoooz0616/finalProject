package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TestVO;

public interface ITestService {
	void createTest(TestVO testVO);

	void updateTest(TestVO testVO);

	void deleteTest(String userId);

	List<TestVO> selectTest();

	TestVO getTestVO(String userId);
}