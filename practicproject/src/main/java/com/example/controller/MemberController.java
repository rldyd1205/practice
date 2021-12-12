package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	// @GetMapping("/login")은 로그인 할 수있는 화면 보여주기
	@GetMapping("/login")
	public String loginForm() {
		System.out.println("로그인 화면 호출됨...");
		return "member/login";
	}// loginForm
	
	// @GetMapping("/login")은 회원가입 할 수있는 화면 보여주기
	@GetMapping("/join")
	public String joinForm() {
		System.out.println("회원가입 화면 호출됨...");
		return "member/join";
	}// joinForm
	
}
