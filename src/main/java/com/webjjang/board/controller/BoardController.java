package com.webjjang.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.board.vo.BoardVO;
import com.webjjang.myapp.Service;

import net.webjjang.util.PageObject;

// 자동 생성 - @Controller, @Service, @Repository - DAO, @Conponent,  @RestController
			// 단, servlet-content.xml에서 component-scan 태그에서 base-package 안에 작성되어 있어야 함!
@Controller
@RequestMapping("/board")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	private Service boardListService;
	private Service boardViewService;
	private Service boardWriteService;
	private Service boardUpdateService;
	private Service boardDeleteService;
	
	@Autowired
	public void setBoardListService(Service boardListService) {
		this.boardListService = boardListService;
	}
	
	@Autowired
	public void setBoardViewService(Service boardViewService) {
		this.boardViewService = boardViewService;
	}
	
	@Autowired
	public void setBoardWriteService(Service boardWriteService) {
		this.boardWriteService = boardWriteService;
	}
	
	@Autowired
	public void setBoardUpdateService(Service boardUpdateService) {
		this.boardUpdateService = boardUpdateService;
	}
	
	@Autowired
	public void setBoardDeleteService(Service boardDeleteService) {
		this.boardDeleteService = boardDeleteService;
	}
	
	// 게시판 리스트
	@GetMapping("/list.do")
	public String list(@ModelAttribute PageObject pageObject, Model model) throws Exception {
		
		log.info("게시판 리스트 처리");
		
		model.addAttribute("list", boardListService.service(pageObject));
		model.addAttribute("pageObject", pageObject);
		return "board/list";
		
	}
	
	// 게시판 글보기
	@GetMapping("/view.do")
	public String view(long no, int inc, Model model) throws Exception {
		
		log.info("게시판 글보기 - no :" + no + ", inc : " + inc);
		
		model.addAttribute("vo", boardViewService.service(new Object[] {no, inc}));
		
		return "board/view";
		
	}
	
	// 게시판 글쓰기 폼
	@GetMapping("/write.do")
	public String writeForm() throws Exception {
			
		log.info("게시판 글쓰기 폼");
			
		return "board/write";
			
	}
	
	// 게시판 글쓰기 처리
	@PostMapping("/write.do")
	public String write(BoardVO vo) throws Exception {
			
		log.info("게시판 글쓰기 처리 - vo : " + vo);
			
		boardWriteService.service(vo);
		
		return "redirect:list.do";
			
	}
	
	
	// 게시판 수정 폼
	@GetMapping("/update.do")
	public String updateForm(long no, Model model) throws Exception {
			
		log.info("게시판 수정 폼 - no :" + no);
		
		// 수정할 데이터를 가져온다. - boardViewService
		
		model.addAttribute("vo", boardViewService.service(new Object[] {no, 0}));
		
		return "board/update";
			
	}
	
	// 게시판 수정 처리
	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception {
			
		log.info("게시판 수정 처리 - vo : " + vo);
		boardUpdateService.service(vo);
		
		return "redirect:view.do?no="+vo.getNo()+"&inc=0";
			
	}
	
	// 게시판 글삭제
	@GetMapping("/delete.do")
	public String delete(long no) throws Exception {
			
		log.info("게시판 글삭제 처리 - no : " + no);
		
		boardDeleteService.service(no);
		
		return "redirect:list.do";
			
	}
}
