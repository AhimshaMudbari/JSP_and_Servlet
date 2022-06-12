<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<!-- Directive tag-->
    <%@page import="java.lang.String,java.io.IOException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Declerative tag-->
<%!
int age=22;
%>
	<h5>..........</h5>
	<!-- Scriplet tag-->
	<% String str="Ahim";
	out.println("Name is "+str+" <br>");
	out.println("The age is "+age);
	%>
	<!-- Expression tag -->
	<h5>My favourite number is <%= age %></h5>
</body>
</html>