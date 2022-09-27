package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) {
		try {
			//1) register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) Create a connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
		//3)Create a statement
			PreparedStatement stmt=con.prepareStatement("Insert into Employee values(4,'Prasad',40000,30)");
		//4) execute Query
			int count = stmt.executeUpdate();
		//5) close connection
			stmt.close();
			con.close();
			
		System.out.println(count+"row inserted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
