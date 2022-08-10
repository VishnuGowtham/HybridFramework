package selenium_pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_NonQuery {

	public static void main(String[] args) throws Throwable {
		Connection conn = null;
		int result = 0;
		try {
			  Driver driverRef = new Driver();
			  // Step 1 : load/register mysql database
			  DriverManager.registerDriver(driverRef);
			  // Step 2 : Connect to DB
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
			  // Step 3 : create query statement 
			  Statement stat = conn.createStatement();
			  String query = "insert into students_info values('6','Sathees','Kumar','R')";
			  // Step 4 : execute the Query
			  result = stat.executeUpdate(query);
			  
		} catch (Exception e) {
		}finally {
			if(result==1) {
				System.out.println("Project inserted successfully");
			}else {
				System.out.println("Project is not inserted--!");
			}
			// Step 5 : Close the connection 
			conn.close();
			System.out.println("=====Close DB Connection======");
		}
	  }	
   }

