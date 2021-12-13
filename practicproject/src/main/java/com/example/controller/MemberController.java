package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.sevice.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	
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
	
	@PostMapping("/join")
	public ResponseEntity<String> join(MemberVO memberVO) {
		// 스프링이 사용자가 입력한 값을 가져왔는지 확인하는 출력문
		System.out.println("MemberVO : " + memberVO);
		
		// 1.아이디 중복체크(DB에 있는지 확인 필요)
		// memberVO안에 id가 있으니까 getId로 가져와서 매개변수 id에 담아줌
		String id = memberVO.getId();
		
		
		
		// 2.비밀번호, 비밀번호 확인이 서로 맞는지 체크
		
		// 3.DB에 등록
		
		// 4.회원가입 메세지창 띄우고 메인화면으로 이동
		return null;
	}

	
	
}
