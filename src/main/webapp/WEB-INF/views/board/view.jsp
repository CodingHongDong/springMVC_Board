<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 > 글보기</title>
</head>
<body>
<div class="container">
<h2>일반 게시판 > 글보기</h2>
<table class="table">
	<tr>
		<th>번호</th>
		<td>${vo.no }</td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td>${vo.title }</td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td>${vo.content }</td>
	</tr>
	
	<tr>
		<th>작성자</th>
		<td>${vo.writer }</td>
	</tr>
	
	<tr>
		<th>작성일</th>
		<td><fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd"/></td>
	</tr>
	
	<tr>
		<th>조회수</th>
		<td>${vo.hit }</td>
	</tr>
	
</table>
<br>
	<a href="update.do?no=${vo.no}&page=${param.page}&perPageNum=${param.perPageNum}&key=${param.key}
										&word=${param.word}" 
		class="btn btn-default">수정</a>
	<a href="delete.do?no=${vo.no}&perPageNum=${param.perPageNum}" 
		class="btn btn-default">삭제</a>
	<a href="list.do?page=${param.page}&perPageNum=${param.perPageNum}&key=${param.key}
										&word=${param.word}" 
		class="btn btn-default">리스트</a>
</div>
</body>
</html>