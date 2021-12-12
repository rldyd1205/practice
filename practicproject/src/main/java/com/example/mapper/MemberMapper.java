package com.example.mapper;

import com.example.domain.MemberVO;

public interface MemberMapper {

	// =========== select ===========
	
	// MemberVO안에서 id를 가져오는 코드,
	// 이게 어떤 sql문인지를 명세를 해줘야 한다.
	// 그건 MemberMapper.xml파일을 만들어서 해줘야 함
	MemberVO getMemberById(String id);
	
	// =========== insert ===========
	
	// =========== update ===========
	
	// =========== delete ===========
}
