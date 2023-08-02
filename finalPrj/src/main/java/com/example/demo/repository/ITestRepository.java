package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TestVO;

@Repository
@Mapper
public interface ITestRepository {
	void createTest();
	void updateTest();
	void deleteTest();
	TestVO selectTest(String userId);
}