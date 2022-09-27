package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDataDynamic {

	public static void main(String[] args) {
		try {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Enter a id:");
			 int id=myObj.nextInt();
			
			//1) register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) Create a connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
		//3)Create a statement
			PreparedStatement stmt=con.prepareStatement("DELETE FROM Employee WHERE id=?;");//parameterized query
			
			stmt.setInt(1, id);			
			
		//4) execute Query
			int count = stmt.executeUpdate();
		//5) close connection
			stmt.close();
			con.close();
			
		System.out.println(count+"row Deleted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
