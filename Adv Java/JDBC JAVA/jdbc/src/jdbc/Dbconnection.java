package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			System.out.print("Database connection succecfully");
		}catch(Exception ex)		
		{
	ex.printStackTrace();
		}
		
		
		
	}

	

}
