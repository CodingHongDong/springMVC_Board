<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 > 글수정</title>
</head>
<body>
<div class="container">
<h2>일반 게시판 > 글수정</h2>
<form action="update.do" method="post">
<table class="table">
	<tr>
		<th>번호</th>
		<td><input name="no" value="${vo.no}" readonly="readonly"></td>
	</tr>
	
	<tr>
		<th>제목</th>
		<td><input name="title" value="${vo.title}"></td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td><textarea rows="5" style="width: 600px;" name="content">${vo.content}</textarea> </td>
	</tr>
	
	<tr>
		<th>작성자</th>
		<td><input name="writer" value="${vo.writer }"></td>
	</tr>
	
	<tr>
		<td colspan="2">
			<button class="btn btn-default">수정</button>
			<button type="reset" class="btn btn-default">새로입력</button>
			<button type="button" onclick="history.back()" class="btn btn-default">취소</button>
		</td>
	</tr>
</table>
</form>
</div>
</body>
</html>