package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TestVO;

@Repository
@Mapper
public interface ITestRepository {
	void createTest(TestVO testVO);

	void updateTest();

	void deleteTest(String userId);

	List<TestVO> selectTest();
}