package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ITestRepository;

@Service
public class TestService implements ITestService {
	@Autowired
	ITestRepository testRepository;

	@Override
	public void createTest() {
		testRepository.createTest();
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
	public void selectTest() {
		testRepository.selectTest();
	}
}
