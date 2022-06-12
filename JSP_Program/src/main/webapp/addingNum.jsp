<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addition</title>
</head>
<body bgcolor="grey">
	<%
	int a= Integer.parseInt(request.getParameter("number1"));
	int b= Integer.parseInt(request.getParameter("number2"));
	int result=a+b;
	out.print(result);
	%>
</body>
</html>