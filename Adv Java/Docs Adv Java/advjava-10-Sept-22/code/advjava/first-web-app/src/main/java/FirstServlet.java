

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sing-up")
public class FirstServlet extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is the servlet");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1>This is the first HTML reponse to the user......</h1>");
		out.print("<div align='center'>");
		out.print("<form action='' method='get'>");
			out.print("Enter Email Id <input type='text' name='uname'> <br><br>");
			out.print("<br><br>");
		out.print("</form>");
		out.print("</div>");
		
		
	}
}
