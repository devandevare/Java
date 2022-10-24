<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details Preview</title>
</head>
<body>

<%
	String title = request.getParameter("title");
	String year = request.getParameter("year");
	String precent = request.getParameter("precent");
	
	String city = request.getParameter("city");
	String pin = request.getParameter("pin");
	String state = request.getParameter("state");
	
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");

%>

	<div align="center">
		<h1>Step 4 of 4</h1>
		<hr>

		<h1>User Personal Details</h1>
		<h3>Name : <%= name %></h3>
		<h3>Email : <%= email %></h3>
		<h3>Contact : <%= contact %></h3>
		
		<h1>User Address Details</h1>
		<h3>City : <%= city %></h3>
		<h3>Pincode : <%= pin %></h3>
		<h3>state : <%= state %></h3>

		<h1>User Educational Details</h1>
		<h3>Title : <%= title %> </h3>
		<h3>Year : <%= year %></h3>
		<h3>Percent : <%= precent %></h3>
		
		<h1><a href="SaveData?name=<%=name%>&email=<%=email%>&contact=<%=contact%>&city=<%=city%>">Save & Continue</a></h1>


	</div>
</body>
</html>




