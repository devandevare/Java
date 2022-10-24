<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Search</title>
</head>
<body>

<%
	Cookie[] cks = request.getCookies();
	String search = "";
	if(cks != null) {
		for(Cookie ck : cks) {
			if("lastsearch".equals(ck.getName())) {
				search = ck.getValue();	
			}
		}
	}

%>
	<div>
		<h1>Previous Search : <%= search %></h1>
		<form action="result">
			Search for : <input name="qry">
			<br><br>
			<button type="submit">Get Result</button>
		</form>
	</div>

</body>
</html>