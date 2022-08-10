package selenium_pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBC_SelectQwery {

	public static void main(String[] args) throws Throwable {
		
		Connection conn = null;
		try {
			  Driver driverRef = new Driver();
			  // Step 1 : load/register mysql database
			  DriverManager.registerDriver(driverRef);
			// Step 2 : Connect to DB
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
			// Step 3 : create query statement 
			  Statement stat = conn.createStatement();
			  String query = "select * from students_info";
			// Step 4 : execute the Query
			  ResultSet resultSet = stat.executeQuery(query);
			  while(resultSet.next()) {
				  System.out.println(resultSet.getString(1) + "\t"+ resultSet.getString(2)+"\t" 
						  +resultSet.getString(3)+ "\t"+resultSet.getString(4));
			  }
				
		} catch (Exception e) {
			
		}finally {
			// Step 5 : Close the connection 
			conn.close();
			System.out.println("=====Close DB Connection======");
		}
	  }	
   }