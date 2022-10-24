package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.bean.TaskBean;
import todo.model.TaskModel;

@WebServlet("/create-my-task")
public class CreateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String scheduledDate = request.getParameter("scheduledDate");
		
		TaskBean bean = new TaskBean();
		bean.setTitle(title);
		bean.setStatus(status);
		bean.setScheduledOn(scheduledDate);
		
		TaskModel model = new TaskModel();
		boolean flag = model.save(bean);
		
		String code = flag ? "200" : "500";
		
		response.sendRedirect("create-task.jsp?code="+code);
		
	}

}
