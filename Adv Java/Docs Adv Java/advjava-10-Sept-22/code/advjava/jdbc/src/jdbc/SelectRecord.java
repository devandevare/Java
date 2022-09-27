package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectRecord {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Dept : ");
			String dept = scan.next();
			scan.close();
			//1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			//3. create Statement
			PreparedStatement st = con.prepareStatement("select * from employee where dept = ?");
			st.setString(1, dept);
			//4. execute Query
			ResultSet rs = st.executeQuery();
			/*boolean flag = rs.next();
			if(!flag) {
				System.err.println("No Record Available");
			}*/
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name")+ "\t");
				System.out.print(rs.getString("email")+ "\t");
				System.out.println(rs.getString("dept"));
			}
			//5. close connection
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}





