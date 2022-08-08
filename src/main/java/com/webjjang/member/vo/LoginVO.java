package com.webjjang.member.vo;


import lombok.Data;

// lombok 라ㅣ브러리가 정상적으로 등록이 되서 실행되어야 한다.
// 아이디, 비밀번호, 이름, 등급번호, 사진이름
@Data
public class LoginVO {

	private String id;
	private String pw;
	private String name;
	private String email;
	private int gradeNo;
	private String gradeName;
	private String photo;
	// 새로운 메시지를 저장하는 변수 -> 서브쿼리 이용
	// 메세지 시스템에서 새 메시지를 읽으면 세션에 있는 새 메시지 정보를 -1 처리를 해줘야한다.
	private long newMessage;
	
	
}
