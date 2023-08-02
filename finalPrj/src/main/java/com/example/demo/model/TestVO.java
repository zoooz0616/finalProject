package com.example.demo.model;

import java.sql.Date;

import lombok.Data;

@Data
public class TestVO {
	String userId;
	String userPw;
	String nickname;
	String phone;
	Date joinDate;
	Date updateDate;
	String memo;
}
