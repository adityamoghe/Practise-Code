package com.yash.candidaterestapi.util;

import java.sql.DriverManager; 
import java.sql.SQLException;

import java.sql.*;

public class ConnectionProvider {
	
	static private Connection connection;
	static String url="jdbc:mysql://localhost:3306/candidate";
	static String user = "root";
	static String password = "root";
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, password); 
			return connection;
		} catch (Exception e) {
			System.out.println("Problem-"+e.getMessage());
			return connection;
		}
	}
	
	public static void close(){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
