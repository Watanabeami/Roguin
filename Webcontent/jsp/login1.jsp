<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String id = request.getParameter("emp_id");
String password = request.getParameter("password");
%>
</head>
<body>
<p>ようこそ、<%= id %>さん！</p>
</body>
</html>