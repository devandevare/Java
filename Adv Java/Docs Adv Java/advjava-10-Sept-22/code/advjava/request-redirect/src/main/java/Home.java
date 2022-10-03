

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		
		String name = (String) request.getAttribute("name");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='right'>");
			out.print("<h3>"+name+"</h3>");
		out.print("</div>");
		out.print("<hr>");
		out.print("<div align='center'>");
			out.print("<h3>WELCONE USER TO HOME PAGE</h3>");
		out.print("</div>");
	}

}
