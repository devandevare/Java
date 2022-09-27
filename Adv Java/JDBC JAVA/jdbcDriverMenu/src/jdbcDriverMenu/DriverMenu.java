package jdbcDriverMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DriverMenu {
	
	//function to register new user to database
	static void registerUser() {
		try {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Enter a Id:");
			 int id=myObj.nextInt();
			 System.out.println("Enter a name:");
			 String name=myObj.next();
			 System.out.println("Enter a Paaword:");
			 String pass=myObj.next();
			 System.out.println("Enter a Email:");
			 String email=myObj.next();
			//1) register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) Create a connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
		//3)Create a statement
			PreparedStatement stmt=con.prepareStatement("Insert into Persons values(?,?,?,?)");//parameterized query
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, pass);
			stmt.setString(4, email);
			
		//4) execute Query
			int count = stmt.executeUpdate();
		//5) close connection
			stmt.close();
			con.close();
			
		System.out.println(count+""+"row inserted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	  }

	//function to reset password of existing user
	static void resetPassword() {
		try {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Enter a Email:");
			 String email=myObj.next();
			 System.out.println("Enter a Current Paaword:");
			 String cpass=myObj.next();
			 System.out.println("Enter a new Paaword:");
			 String pass=myObj.next();
		
			 //1) register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) Create a connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			//3)Create a statement
			Statement st = con.createStatement();
			String sql = ("SELECT * FROM Persons WHERE Email='"+email+"';");
			PreparedStatement prep = con.prepareStatement(sql);
			ResultSet rs = prep.executeQuery(sql);

			rs.next();
	
			 if(rs.getString("Password").equals(cpass) && rs.getString("Email").equals(email)) {
				 PreparedStatement stmt=con.prepareStatement("UPDATE Persons set Password=? WHERE Email=?");//parameterized query
					
				stmt.setString(1, pass);
				stmt.setString(2, email);
				//4) execute Query
				int count = stmt.executeUpdate();
				System.out.println(count+""+"row's Password Changed...");
				stmt.close();
			 }else {
				 System.out.println("user not matched");
			 	}
	
						
			//5) close connection
			
			con.close();

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	  }

	static void deleteUser() {
		try {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Enter a Id:");
			 int id=myObj.nextInt();
			
			//1) register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2) Create a connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
		//3)Create a statement
			PreparedStatement stmt=con.prepareStatement("DELETE FROM Persons WHERE Person_Id=?");//parameterized query
			
			stmt.setInt(1, id);
						
		//4) execute Query
			int count = stmt.executeUpdate();
		//5) close connection
			stmt.close();
			con.close();
			
		System.out.println(count+""+"row Deleted...");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Press 1 to Register User");
		System.out.println("Press 2 to Rest Password");
		System.out.println("Press 3 to Delete Account");
		System.out.println("Press 4 to Exit from application");
		
	
		System.out.println("Please Enter your choice:");
		 int choice = myObj.nextInt();
		 switch (choice) {
		  case 1:
			  registerUser();
		    break;
		  case 2:
			  resetPassword();
		    break;
		  case 3:
			  deleteUser();
		    break;
		  case 4:
			  System.out.println("exit...");
			  System.exit(0);
			  
		    break;
		 
		}
		System.out.println("End of Program");


	}

}
