<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일반 게시판 > 리스트</title>
<style type="text/css">
	.dataRow:hover {
		background: #eee;
		cursor: pointer;
	}

</style>
<script type="text/javascript">
$(function() {
	$(".dataRow").click(function() {
		var no = $(this).find(".no").text();
		location = "view.do?no=" + no + "&inc=1"
				+ "&page=${pageObject.page}"
				+ "&perPageNum=${pageObject.perPageNum}"
				+ "&key=${pageObject.key}"
				+ "&word=${pageObject.word}"
	});
});
	
</script>
</head>
<body>
<div class="container">
<h2>일반 게시판 > 리스트</h2>
<table class="table">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>
	<c:forEach items="${list}" var="vo">
	<tr class="dataRow">
		<td class="no">${vo.no }</td>
		<td>${vo.title }</td>
		<td>${vo.writer }</td>
		<td><fmt:formatDate value="${vo.writeDate }" pattern="yyyy-MM-dd"/> </td>
		<td>${vo.hit}</td>
	</tr>
	</c:forEach>
	
	<c:if test="${pageObject.totalPage > 1 }">
		<!-- 전체 페이지가 2페이지 이상이면 보여주는 부분 -->
		<tr>
			<td colspan="5">
				<pageNav:pageNav listURI="list.do" 
					pageObject="${pageObject }" />
			</td>
		</tr>
	</c:if>
	
	<tr>
		<td colspan="5">
			<a href="write.do" class="btn btn-default">글쓰기</a>
		</td>
	</tr>
</table>
</div>
</body>
</html>