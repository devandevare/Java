<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Address Details</title>
</head>
<body>
<div align="center">
		<h1>Step 2 of 4</h1>
		<hr>
		<%
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
		%>
		<h1>User Address Details</h1>
		<form action="EducationalDetails.jsp">
			<input type="hidden"  name="name" value="<%=name%>">
			<input type="hidden"  name="email" value="<%=email%>">
			<input type="hidden"  name="contact" value="<%=contact%>">
			
			Enter City :  <input type="text" name="city">
			<br><br>
			Enter Pincode :  <input type="text" name="pin">
			<br><br>
			Enter State :  <input type="text" name="state">
			<br><br>
			<button type="submit">Next</button>
		</form>
	</div>
</body>
</html>