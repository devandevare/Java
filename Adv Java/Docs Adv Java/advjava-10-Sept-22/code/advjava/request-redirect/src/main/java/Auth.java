

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		
		String nameInCaps = "Welcome User, "+uname.toUpperCase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root"); 
			PreparedStatement stmt = con.prepareStatement("select * from employee where email=? and password=?");
			stmt.setString(1, uname);
			stmt.setString(2, upass);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				request.setAttribute("name", nameInCaps); // set the Attribute in request
				
				RequestDispatcher dis = request.getRequestDispatcher("user-home");
				dis.forward(request, response);
			} else {
				response.sendRedirect("user-error");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
