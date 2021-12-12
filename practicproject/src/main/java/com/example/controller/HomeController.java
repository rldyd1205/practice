package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	// index화면 보여주기
	@GetMapping(value = {"/","/index"})
	public String home() {
		// 출력되는지 확인 출력문
		System.out.println("메인페이지 호출됨...");
		// 제일 기본페이지(index)로 이동
		return "index";
	}
	
}
