<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 > 글쓰기</title>
</head>
<body>
<h2>일반 게시판 > 글쓰기</h2>
<form action="write.do" method="post">
<div class="container">
<table class="table">
	<tr>
		<th>제목</th>
		<td><input name="title"></td>
	</tr>
	
	<tr>
		<th>내용</th>
		<td><textarea rows="5" style="width: 600px;" name="content"></textarea> </td>
	</tr>
	
	<tr>
		<th>작성자</th>
		<td><input name="writer"></td>
	</tr>
	
	<tr>
		<td colspan="2"><button class="btn btn-default">등록</button></td>
	</tr>
</table>
</div>
</form>

</body>
</html>