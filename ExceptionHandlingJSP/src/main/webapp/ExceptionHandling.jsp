<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Exceptions</title>
</head>
<body>
<%
int a= Integer.parseInt(request.getParameter("n1"));
int b = Integer.parseInt(request.getParameter("n2"));
/* try{ */
	int result=a/b;
	out.println("Division is: "+result);
/* }
catch(Exception e){
	out.println("Error Message: "+e.getMessage());
} */
%>
<form action="Error.jsp">
<Button type="submit">See Error page</Button>
</form>
</body>
</html>