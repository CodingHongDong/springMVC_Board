package com.webjjang.member.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String pw;
	private String name;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth;
	private String tel;
	private String email;
	private Date regDate;
	private Date conDate; // 접속날짜
	private String status; // 상태
	private int gradeNo;
	private String gradeName;
	private String photo;
	
	// 사용자가 올린 사진을 저장하는 변수
	// 회원가입 폼의 jsp에서 name="photoFile"로 준다.
	// post이고 enctype="multipart/form-data" 지정해야만 한다.
	private MultipartFile photoFile;
	private String deleteFileName;
	
}
