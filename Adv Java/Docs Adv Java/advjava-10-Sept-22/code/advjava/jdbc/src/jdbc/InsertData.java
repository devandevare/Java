package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		try {
			// create table employee(id int, name varchar(20),email varchar(20),dept varchar(15))
			//1. register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create COnnection
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			//3. Create Statement
			PreparedStatement stmt = 
					con.prepareStatement("Insert into employee values(4, 'D', 'd@gmail.com','Dev')");
			// 4. execute Query
			int count = stmt.executeUpdate(); 
			// 5. close connection
			stmt.close();
			con.close();
			
			System.out.println(count + " rows inserted...");
		}
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	}
}
