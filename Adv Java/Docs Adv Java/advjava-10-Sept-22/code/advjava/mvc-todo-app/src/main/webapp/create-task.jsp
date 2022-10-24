<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDo : Create Task</title>
</head>
<body>
	<%@ include file="nev-bar.jsp"%>

	<div class="container">
	
		<%
		String code = request.getParameter("code");
		String color ="";
		String msg = "";		
		if(code!=null) {
			switch(code) {
				case "500":
					color = "red";
					msg = "Task Creation Fail... Try After Sometime";
					break;
				case "200" :
					color="green";
					msg="Tack Created successfully...";
					break;
			}
		}
	%>
	<h3 style="color: <%=color%>"><%= msg %></h3>
	
	
		<form class="form-horizontal" action="create-my-task">
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Title :</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="email" name="title"
						placeholder="Enter title">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Status:</label>
				<div class="col-sm-10">
					<select name="status">
						<option value="Open">Open</option>
						<option value="In-progress">In-progress</option>
						<option value="Completed">Completed</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Schedule
						Date :</label>
					<div class="col-sm-10">
						<input type="date" class="form-control" id="email" name="scheduledDate">
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-success">Create Task</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>