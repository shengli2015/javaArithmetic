package com.shengli.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection getMysqlInstance() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.4.151:3306/test", "root", "123456");
		return conn;
	}

	public static Connection getHiveInstance() throws Exception {
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.4.151:10000/default", "root", "");
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
