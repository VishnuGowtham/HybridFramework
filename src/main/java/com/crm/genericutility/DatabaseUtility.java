package com.crm.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection connection;

	/**
	 * This method will establish the connection between java and database
	 */
	public void connectToDataBase() {

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(IPathConstants.DATABASE_URL, IPathConstants.DB_USERNAME,
					IPathConstants.DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method will close the database connection
	 */
	public void closeDatabase() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/**
	 * This method will return true if data is added to database
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public boolean insertData(String query) throws SQLException {
		int result = connection.createStatement().executeUpdate(query);
		boolean flag = false;
		if (result == 1) {
			System.out.println("data is added");
			flag = true;
			return flag;

		} else {
			System.out.println("data is not added");
		}
		return flag;

	}

}
