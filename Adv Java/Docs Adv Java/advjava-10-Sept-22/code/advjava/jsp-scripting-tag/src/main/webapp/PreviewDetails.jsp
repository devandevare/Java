<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String fn = request.getParameter("fname");
	String mn = request.getParameter("mname");
	String ln = request.getParameter("lname");
	String gender = request.getParameter("gender");
	String fullName = fn + " " + mn + " " + ln;
	String prefix = "";
	if("male".equalsIgnoreCase(gender)) {
		prefix = "Mr. ";
	} else {
		prefix = "Ms. ";
	}
	
%>

<table border="2">
	<thead>
		<tr>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Gender</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%= fn %></td>
			<td><%= ln %></td>
			<td><%= mn %></td>
			<td><%= gender %></td>
		</tr>
	</tbody>
</table>

<h1>Hello, <%= prefix + fullName %> </h1>	





</body>
</html>