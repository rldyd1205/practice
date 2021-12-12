package com.example.domain;

import java.util.Date;

import lombok.Data;

// MemberVO 클래스는 객체를 만들기 위한 설계도
@Data
public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String birthday;
	private String gender;
	private String email;
	private String recvEmail;
	private Date   regDate;
}
