<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login Page</title>
	
	<style type="text/css">
		button {
			background-color: green;
		}
	</style>
	
	<script type="text/javascript">
		alert("This is from JS");
	</script>
	
</head>
	<body>
		<div align="center">
			<form action="DisplayInfo.jsp">
				Enter User name <input type="text" name="name">
				<br><br> 
				Enter User name <input type="password" name="pass">
				<br><br>
				<button type="submit">Login</button>
			</form>
		</div>	
	</body>
</html>