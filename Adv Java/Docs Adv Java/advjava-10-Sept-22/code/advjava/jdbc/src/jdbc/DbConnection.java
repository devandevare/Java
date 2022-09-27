package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DbConnection {
	public static void main(String[] args) {
		try {	
			//Oracle Driver: oracle.jdbc.driver.OracleDriver
			//Oracle URL: jdbc:oracle:thin:@localhost:1521:xe
			
			//SQLServer Driver: com.microsoft.sqlserver.jdbc.SQLServerDriver
			//SQLServer URL: jdbc:sqlserver://localhost:1433;databaseName=testdb
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/advjava10sept","root","root");
			
			System.out.println("Db COnnection Successful");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
