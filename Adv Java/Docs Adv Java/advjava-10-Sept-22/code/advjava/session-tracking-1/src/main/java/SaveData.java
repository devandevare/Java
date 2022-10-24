

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveData")
public class SaveData extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String year = request.getParameter("year");
		String precent = request.getParameter("precent");
		
		String city = request.getParameter("city");
		String pin = request.getParameter("pin");
		String state = request.getParameter("state");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("COntact : " + contact);
		System.out.println("City : " + city);
		System.out.println("Pin : " + pin);
		System.out.println("state : " + state);
		System.out.println("title : " + title);
		System.out.println("year : " + year);
		System.out.println("percent : " + precent);
	}
	
	

}
