package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ITestRepository;

@Service
public class TestService implements ITestService {
	@Autowired
	ITestRepository testRepository;
}
