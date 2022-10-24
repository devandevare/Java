

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchQuery = request.getParameter("qry");
		
		// create cookie
		Cookie ck = new Cookie("lastsearch", searchQuery);
		
		// Set Expire time in seconds (Optional)
		ck.setMaxAge(7*24*60*60);
		
		// set cookie into response
		response.addCookie(ck);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello User, You Search for : " +searchQuery+"</h1>");
	}

}
