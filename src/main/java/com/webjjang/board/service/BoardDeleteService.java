package com.webjjang.board.service;

import javax.inject.Inject;

import com.webjjang.board.mapper.BoardMapper;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.myapp.Service;

@org.springframework.stereotype.Service
public class BoardDeleteService implements Service {

	private BoardMapper mapper;
	
	@Inject
	public void setMapper(BoardMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public Object service(Object obj) throws Exception {
		
		long no = (long) obj;
		
		return mapper.delete(no);
	}

}
