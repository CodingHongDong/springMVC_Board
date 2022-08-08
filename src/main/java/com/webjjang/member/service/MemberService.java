package com.webjjang.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.webjjang.member.mapper.MemberMapper;
import com.webjjang.member.vo.LoginVO;
import com.webjjang.member.vo.MemberVO;

@Service
public class MemberService {

	@Inject
	private MemberMapper mapper;	
	
	public int write(MemberVO vo) throws Exception {
		return mapper.write(vo);
	}
	
	
	// 로그인
	public LoginVO login(LoginVO invo) throws Exception {
		return mapper.login(invo); 
	}

	// 아이디 중복 체크
	public String idCheck(String id) throws Exception{
		
		return mapper.idCheck(id);
	}
	
}
