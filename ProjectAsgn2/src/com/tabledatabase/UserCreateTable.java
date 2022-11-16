package com.tabledatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserCreateTable {

	// JDBC driver name and database URL
	static final String DB_URL = "jdbc:mysql://localhost:3306/asignment2";
	
	// Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	
	public static void main(String[] args) {
	
		Connection conn = null;
		Statement stmt = null;
		
		try 
		{
			// STEP 3 : Open a connection
			System.out.println("Connecting to database ...");
			
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Thread.sleep(2000);
			System.out.println("Data Base is Connected");
			
			Thread.sleep(2000);
			
			// STEP 4 : Execute a querry
			System.out.println("Creating table in given database ...");
			
			stmt = conn.createStatement();
			
			// STEP 4.1 : Creating the table
			
			String sql = "CREATE TABLE userdata "+
			" (id INT auto_increment primary key, " +	
			" name VARCHAR(55), " +	
			" email VARCHAR(55), " +
			" username VARCHAR(55), " +
			" password VARCHAR(55), " +
			" contactno VARCHAR(55), " +
			" photo LONGBLOB, " +
			" file LONGBLOB, " +
			" comment VARCHAR(1000) )";
			
			stmt.executeUpdate(sql);
			Thread.sleep(2000);
			System.out.println("New User Table is Created database ...");
			
			stmt.close();
			conn.close();
			
			Thread.sleep(2000);
			System.out.println("Connection closed ...");
		}
		
		catch (SQLException se)
		{
			se.printStackTrace();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
			
		finally
		{
			try
			{
				if (stmt != null)
					stmt.close();
			}
			
			catch (SQLException se2)
			{
				
			} // nothing we can do
			
			try
			{
				if(conn != null)
					conn.close();
			}
			
			catch (SQLException se)
			{
				se.printStackTrace();
			} // end finally try
		} // end try
	}
}

		
		