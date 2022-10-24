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
	<form action="Billing.jsp">
		<h1>Product Details - 1</h1>
		Enter Name : <input type="text" name="prod1Name">
		<br><br>
		Enter Price : <input type="text" name="prod1Price">
		<br><br>
		Enter Quantity : <input type="text" name="prod1Qty">
		<br><br>
		
		<h1>Product Details - 2</h1>
		Enter Name : <input type="text" name="prod2Name">
		<br><br>
		Enter Price : <input type="text" name="prod2Price">
		<br><br>
		Enter Quantity : <input type="text" name="prod2Qty">
		<br><br>
		<button type="submit">Generate Bill</button>
	</form>
</div>

</body>
</html>