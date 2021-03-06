package com.example.sevice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.MemberVO;
import com.example.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	
	private MemberMapper memberMapper;

	public MemberService(MemberMapper memberMapper) {
		super();
		this.memberMapper = memberMapper;
	}
	
 	public MemberVO getMemberId(String id) {
 		return memberMapper.getMemberById(id);
 	}
}
