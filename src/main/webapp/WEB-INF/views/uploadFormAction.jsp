<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<h2>파일 업로드</h2>
<form action="uploadFormAction" enctype="multipart/form-data" method="post">
<img alt="이미지" src="${fileName}">
</form>
</body>
</html>