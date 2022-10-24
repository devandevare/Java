
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class AuthenticateUser extends HttpServlet {

	Map<String, String> userDetails = new HashMap<String, String>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		userDetails.put("Admin", "admin123");
		userDetails.put("Xyz", "xyz123");
		userDetails.put("Abc", "abc123");
		userDetails.put("Pqr", "pqr123");
		userDetails.put("Lmn", "lmn123");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("upass");

		if (userDetails.containsKey(userName) && userDetails.get(userName).equals(password)) {
			HttpSession session = request.getSession(); // to create new or get the existing session
			session.setAttribute("name", userName); // set data inside session
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("login.jsp?code=401");
		}
	}

}
