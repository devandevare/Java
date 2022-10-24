<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Details</title>
</head>
<body>
	<%
		String p1Name = request.getParameter("prod1Name");
		String p1Price = request.getParameter("prod1Price");
		String p1Qty = request.getParameter("prod1Qty");
		
		double p1PriceNum = Double.parseDouble(p1Price);
		int p1QtyNum = Integer.parseInt(p1Qty);
		
		String p2Name = request.getParameter("prod2Name");
		String p2Price = request.getParameter("prod2Price");
		String p2Qty = request.getParameter("prod2Qty");
		
		double p2PriceNum = Double.parseDouble(p2Price);
		int p2QtyNum = Integer.parseInt(p2Qty);
	%>

<div align="center">
	<table border="2">
		<thead>
			<tr>
				<th>Product Name</th>
				<th>Product Price</th>
				<th>Product Quantity</th>
				<th>Total Price</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%= p1Name %></td>
				<td><%= p1Price%></td>
				<td><%= p1Qty %></td>
				<td> <%= p1PriceNum * p1QtyNum %></td>
			</tr>
			<tr>
				<td><%= p2Name %></td>
				<td><%= p2Price%></td>
				<td><%= p2Qty %></td>
				<td> <%= p2PriceNum * p2QtyNum %></td>
			</tr>
			<tr>
				<td colspan="4" align="right">
					Toal Bill Payment : <%= (p1PriceNum * p1QtyNum) + (p2PriceNum * p2QtyNum) %>
				</td>
			</tr>
		</tbody>
	</table>
</div>





</body>
</html>