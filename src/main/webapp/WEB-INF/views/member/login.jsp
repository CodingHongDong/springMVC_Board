<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<script type="text/javascript">
var msg = '${msg}';
console.log(msg);
if(msg != null && msg != ""){
alert(msg);
}
</script>
</head>
<body>
<div class="container">
	<h2>로그인 폼</h2>
	<form action="login.do" method="post">
		<div class="form-group">
			<label for="id">아이디</label>
			<input name="id" id="id" class="form-control">
		</div>
		
		<div class="form-group">
			<label for="pw">비밀번호</label>
			<input name="pw" id="pw" class="form-control" type="password">
		</div>
		<button class="btn btn-default">로그인</button>
		<button type="button" class="btn btn-default" onclick="history.back()">취소</button>
		<button class="btn btn-default" type="button" onclick="location.href='write.do'">회원가입</button>
	</form>
</div>
</body>
</html>