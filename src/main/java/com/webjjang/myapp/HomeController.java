package com.webjjang.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class HomeController {
	
	@GetMapping("/main")
	public void main() {
		log.info("메인 페이지");
		
	}
	
}
