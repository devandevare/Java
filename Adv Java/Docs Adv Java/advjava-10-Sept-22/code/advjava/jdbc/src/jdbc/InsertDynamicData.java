package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {
	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Id : ");
			int id = scan.nextInt();
			System.out.println("Enter Name : ");
			String name = scan.next();
			System.out.println("Enter Email : ");
			String email = scan.next();
			System.out.println("Enter Dept : ");
			String dept = null;
			scan.close();
			
			// create table employee(id int, name varchar(20),email varchar(20),dept varchar(15))
			//1. register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create COnnection
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			//3. Create Statement
			PreparedStatement stmt = 
					con.prepareStatement("Insert into employee values(?,?,?,?)"); // parameterized Query
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, dept);
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
