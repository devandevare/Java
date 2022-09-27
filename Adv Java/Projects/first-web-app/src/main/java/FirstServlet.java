

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sing-up")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//code
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("This is the servelet");
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.print("<h1>This is first HTML response to the user...</h1>");
		out.print("<hr>");
		
		out.print("<div align='center'>");
		out.print("<form action='' method='post'>");
		out.print("<label>Enter email :</label>");
		out.print("<input type='email' name='email'> </input>");
		out.print("<br/><br/>");
		out.print("<label>Enter password :</label>	<input type='password' name='password'> </input>");
		out.print("<br/><br/>");
		out.print("	<label>Enter name :</label>	<input type='text' name='name'> </input> <br/> <br/>");			
		out.print("<label>Select Gender :</label>			\r\n"
				+ "		<input type=\"radio\" name=\"gender\" value=\"Male\">Male </input>\r\n"
				+ "		<input type=\"radio\" name=\"gender\" value=\"Female\">Female </input>\r\n"
				+ "		<br/>\r\n"
				+ "		<br/>");	
		out.print("<label>Date Of Birth :</label>			\r\n"
				+ "		<input type=\"date\" name=\"dob\" /> \r\n"
				+ "		<br/>\r\n"
				+ "		<br/>");	
		out.print("	<label>Select Country :</label>	\r\n"
				+ "			<select name=\"country\">\r\n"
				+ "			<option value=\"India\">India</option>\r\n"
				+ "			<option value=\"UK\">UK</option>\r\n"
				+ "			<option value=\"US\">Us</option>\r\n"
				+ "			<option value=\"aus\">Aus</option>\r\n"
				+ "			</select>\r\n"
				+ "			<br/>\r\n"
				+ "			<br/>");	
		out.print("<button type='submit'>Sign up</button>");
		out.print("</form>");
		out.print("</div>");
		
	}

}
