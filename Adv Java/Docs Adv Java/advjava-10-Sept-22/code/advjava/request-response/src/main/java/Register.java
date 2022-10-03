

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign-up")
public class Register extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // to set the type of response
		PrintWriter out = response.getWriter(); // to set the response
		//OutputStream out = response.getOutputStream(); // binary type of response like image,audio, video etc.
		out.print("Hello This is a text response"); // to set the response content
		out.print("<h1>User Sign Up</h1>");
		out.print("<form action='register-me'>");
			out.print("Enter Name : <input type='text' name='usrname'>");
			out.print("<br/><br/>");
			out.print("Enter Email : <input type='text' name='email'>");
			out.print("<br/><br/>");
			out.print("Enter Password : <input type='password' name='password'>");
			out.print("<br/><br/>");
			out.print("<input type='submit' value='Sign-up'>");
		out.print("</form>");
	}

}













