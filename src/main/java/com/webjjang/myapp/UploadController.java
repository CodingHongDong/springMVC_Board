package com.webjjang.myapp;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UploadController {
	
	@GetMapping("/uploadForm")
	// url에 jsp의 정보가 다 존재한다. 그럴 때 리턴 타입을 String대신에 void를 사용할 수 있다.
	public void uploadForm() {
		log.info("uploadForm()");
	}
	
	@PostMapping("/uploadFormAction")
	public void uploadFormAction(MultipartFile uploadFile, Model model, HttpServletRequest request) throws Exception {
		log.info(uploadFile);
		log.info(uploadFile.getOriginalFilename());
	
		// 저장 위치 - 서버 기준의 상대 위치 -> 실제적으로 저장할 때는 절대 위치가 필요!
		String path = "/upload";
		
		// request를 이용해서 절대 위치를 구한다.
		String savePath = request.getServletContext().getRealPath(path);
		log.info(savePath);
		
		// 파일을 저장해 보자. - 원래 파일명으로 저장한다. 파일명이 같으면 덮어쓰기 된다.
		uploadFile.transferTo(new File(savePath, uploadFile.getOriginalFilename()));
	
		// DB에 저장이 될 파일 정보
		String fileName = path + "/" + uploadFile.getOriginalFilename();
		log.info(fileName);
		
		model.addAttribute("fileName",fileName);
	}
	
	// 파일 첨부를 여러개 해서 받아 보자~~
	@GetMapping("/uploadForms")
	// url에 jsp의 정보가 다 존재한다. 그럴 때 리턴 타입을 String대신에 void를 사용할 수 있다.
	public void uploadForms() {
		log.info("uploadForms()");
	}
	
	@PostMapping("/uploadFormActions")
	public void uploadFormActions(List<MultipartFile> uploadFiles, Model model, HttpServletRequest request) throws Exception {
		log.info(uploadFiles);
		
		// 들어오는 모든 파일 이름 출력해 보기
		for(MultipartFile uploadFile : uploadFiles) {
			log.info(uploadFile.getOriginalFilename());
		}
		
	
		// 저장 위치 - 서버 기준의 상대 위치 -> 실제적으로 저장할 때는 절대 위치가 필요!
		String path = "/upload";
		
		// request를 이용해서 절대 위치를 구한다.
		String savePath = request.getServletContext().getRealPath(path);
		log.info(savePath);
		
		// 파일을 저장해 보자. - 원래 파일명으로 저장한다. 파일명이 같으면 덮어쓰기 된다.
//		uploadFiles.transferTo(new File(savePath, uploadFiles.getOriginalFilename()));
//	
//		// DB에 저장이 될 파일 정보
//		String fileName = path + "/" + uploadFiles.getOriginalFilename();
//		log.info(fileName);
		
		// model.addAttribute("fileName",fileName);
	}
	
	
}
