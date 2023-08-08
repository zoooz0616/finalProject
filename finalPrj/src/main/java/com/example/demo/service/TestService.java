package com.example.demo.service;

import java.util.List;

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
	public void updateTest(TestVO testVO) {
		testRepository.updateTest(testVO);
	}

	@Override
	public void deleteTest(String userId) {
		testRepository.deleteTest(userId);
	}

	@Override
	public List<TestVO> selectTest() {
		return testRepository.selectTest();
	}

	@Override
	public TestVO getTestVO(String userId) {
		return testRepository.getTestVO(userId);
	}
}