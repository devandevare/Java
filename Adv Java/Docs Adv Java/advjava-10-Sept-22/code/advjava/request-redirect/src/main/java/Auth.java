

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate-me")
public class Auth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("pass");
		
		String nameInCaps = "Welcome User, "+uname.toLowerCase();
		
		if("Abc".equals(uname) && "abc@123".equals(upass)) {
			
			request.setAttribute("name", nameInCaps); // set the Attribute in request
			
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);
			// Go to Home Page
		} else {
			response.sendRedirect("user-error");
			// Go to Error Page
		}
		
	}

}
