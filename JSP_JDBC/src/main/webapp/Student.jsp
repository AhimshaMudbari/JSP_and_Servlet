<%@page import="com.mysql.jdbc.Driver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
    <%@page import="com.mysql.jdbc.*" %>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB</title>
<link rel="icon" href="database.png"type="image/x-icon">
</head>
<body>
<% 
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/livingstone","root","");
Statement stmt= con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from  table1");
while (rs.next()){
	out.print("<hr>");
	int a= rs.getInt(1);
	out.println("Id: "+rs.getInt(1)+"<br>");
	out.println(" First Name : "+rs.getString(2)+"<br>");
	out.println("Last Name: "+rs.getString(3)+"<br>");
	out.println(" Email: "+rs.getString(4)+"<br>");
	out.println(" Re Date: "+rs.getString(5)+"<br>");
}
%>
</body>
</html>