package com.webjjang.board.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webjjang.board.mapper.BoardMapper;
import com.webjjang.myapp.Service;

import net.webjjang.util.PageObject;

@org.springframework.stereotype.Service
public class BoardListService implements Service{

	private static final Logger log = LoggerFactory.getLogger(BoardListService.class);
	
	private BoardMapper mapper;
	
	@Inject
	public void setMapper(BoardMapper mapper) {
		this.mapper = mapper;
	}



	@Override
	public Object service(Object obj) throws Exception {
		
		PageObject pageObject = (PageObject) obj;
		
		pageObject.setTotalRow((int) mapper.getTotalRow(pageObject));
		
		log.info("pageObject - " + pageObject);
		
		return mapper.list(pageObject);
	}

}
