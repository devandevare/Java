<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>User Login Page</h1>
	
	<%
		String code = request.getParameter("code");
		String color ="";
		String msg = "";		
		if(code!=null) {
			switch(code) {
				case "401":
					color = "red";
					msg = "Invalid User Name or Password";
					break;
				case "204" :
					color="green";
					msg="You have been successfully Logged Out";
					break;
				case "407" :
					color="red";
					msg="You have been logged out or Your session has expire..";
					break;
			}
		}
	%>
	<h3 style="color: <%=color%>"><%= msg %></h3>
	
	<form action="auth">
		Enter User Name : <input name="uname">
		<br><br>
		Enter User Password: <input type="password" name="upass">
		<br><br>
		<button type="submit">Login</button>
	</form>
</div>


</body>
</html>