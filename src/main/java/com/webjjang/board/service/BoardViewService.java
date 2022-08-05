package com.webjjang.board.service;

import javax.inject.Inject;

import com.webjjang.board.mapper.BoardMapper;
import com.webjjang.myapp.Service;

@org.springframework.stereotype.Service
public class BoardViewService implements Service {
	
	private BoardMapper mapper;
	
	@Inject
	public void setMapper(BoardMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public Object service(Object obj) throws Exception {
		
		Object[] objs = (Object[]) obj;
		long no = (long) objs[0];
		int inc = (Integer) objs[1];
		
		if(inc == 1) mapper.increase(no);
		
		return mapper.view(no);
	}

}
