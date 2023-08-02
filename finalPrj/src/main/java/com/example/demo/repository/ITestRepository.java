package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ITestRepository {
	void createTest();
	void updateTest();
	void deleteTest();
	void selectTest();
}
