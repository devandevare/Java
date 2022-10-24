<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>

<div align="center">
	<form action="PreviewDetails.jsp">
		First Name <input type="text" name="fname">
		<br><br>
		Middle Name <input type="text" name="mname">
		<br><br>
		Last Name <input type="text" name="lname">
		<br><br>
		Gender <input type="radio" name="gender" value="male">Male
				<input type="radio" name="gender" value="female">Female
		<br><br>
		<button type="submit">Send Info</button>
	</form>
</div>

</body>
</html>