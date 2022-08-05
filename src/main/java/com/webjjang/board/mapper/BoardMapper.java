package com.webjjang.board.mapper;

import java.util.List;

import com.webjjang.board.vo.BoardVO;

import net.webjjang.util.PageObject;

public interface BoardMapper {

	// 게시판 리스트
	public List<BoardVO> list(PageObject pageObject) throws Exception;
	
	// 전체 데이터 개수 가져오기
	public long getTotalRow(PageObject pageObject) throws Exception;
	
	// 조회수 1 증가
	public int increase(long no) throws Exception;
	
	// 게시판 글보기
	public BoardVO view(long no) throws Exception;
	
	// 게시판 글쓰기
	public int write(BoardVO vo) throws Exception;
	
	// 게시판 글수정
	public int update(BoardVO vo) throws Exception;
	
	// 게시판 글삭제
	public int delete(long no) throws Exception;
	
}
