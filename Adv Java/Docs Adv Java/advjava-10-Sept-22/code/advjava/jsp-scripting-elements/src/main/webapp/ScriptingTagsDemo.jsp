<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- This code added inside service method after conversion --> 
<%
 int a = 20; // local varaible
 print();
%>

 <h1>Square : <%= a * a %>  </h1>
 
 
 <!-- This code added outside service method and inside class after conversion -->
 <%! 
 int x = 30; // instance varaible
 static int y = 50; // static variable
 public void print() {
	 System.out.println("This is the custom method");	
	 System.out.println("y : " + y);
 }

 %>

</body>
</html>