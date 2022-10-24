<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
</head>
<body>

<div align="right">

<%
	if(session.getAttribute("name") == null ) {
		response.sendRedirect("login.jsp?code=407");
	}
%>

<h2>Welcome User, <%= session.getAttribute("name") %></h2>
<h3><a href="logout"> Logout </a></h3>
</div>
<hr>
</body>
</html>