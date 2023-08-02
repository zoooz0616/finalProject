package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TestVO;
import com.example.demo.repository.ITestRepository;

@Service
public class TestService implements ITestService {
	@Autowired
	ITestRepository testRepository;

	@Override
	public void createTest(TestVO testVO) {
		testRepository.createTest(testVO);
	}

	@Override
	public void updateTest() {
		testRepository.updateTest();
	}

	@Override
	public void deleteTest() {
		testRepository.deleteTest();
	}

	@Override
	public TestVO selectTest(String userId) {
		return testRepository.selectTest(userId);
	}

}
