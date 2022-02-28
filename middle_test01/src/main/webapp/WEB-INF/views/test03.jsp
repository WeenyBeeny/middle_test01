<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/test02.jsp</title>
</head>
<body>
	<h1>이준형의 test03 입니다.</h1>
	<br />
	<a href="${pageContext.request.contextPath}/">test01로 가기</a>
	<p>메세지 : <strong>${requestScope.ZoomRefund}</strong></p>
</body>
</html>