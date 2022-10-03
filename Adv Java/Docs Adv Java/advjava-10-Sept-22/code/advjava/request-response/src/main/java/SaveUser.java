

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-me")
public class SaveUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("usrname");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Pass : " + pass);
	
	}

}
