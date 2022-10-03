

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-error")
public class Error extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
			out.print("<h1 style='color:red'>Invalid User Name or Password</h1>");
			
			out.print("<h3> <a href='user-sing-in'>Login Again</a>   </h3>");
			
			
			//RequestDispatcher dis = request.getRequestDispatcher("user-sing-in");
			//dis.include(request, response);
			
		out.print("</div>");
	}

}
