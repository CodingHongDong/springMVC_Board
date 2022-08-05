package com.webjjang.member.mapper;

import java.util.List;

import com.webjjang.member.vo.LoginVO;
import com.webjjang.member.vo.MemberVO;

import net.webjjang.util.PageObject;

public interface MemberMapper {

	// 게시판 리스트
	public List<MemberVO> list(PageObject pageObject) throws Exception;
	
	// 전체 데이터 개수 가져오기
	public long getTotalRow(PageObject pageObject) throws Exception;
	
	// 보기
	public MemberVO view(long no) throws Exception;
	
	// 쓰기
	public int write(MemberVO vo) throws Exception;
	
	// 수정
	public int update(MemberVO vo) throws Exception;
	
	// 탈퇴
	public int delete(long no) throws Exception;
	
	// 로그인처리
	public LoginVO login(LoginVO invo) throws Exception;
	
	// 아이디 중복 체크
	public String idCheck(String id);
}
