package com.jdb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class java_db {
	
    public static void main(String [] args) {
    	java_db db_util = new java_db();
    	Connection conn = db_util.getConnection();
    	System.out.print(conn);
    }
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;	
	}
	
	public void closeConnection(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
