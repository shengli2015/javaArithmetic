package com.shengli.hivepro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Myjdbc {
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";
	
	public static void main(String [] args) throws SQLException {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		String url = "jdbc:hive2://192.168.4.151:10000/default";
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		Statement statement = conn.createStatement();
		String sql = "select * from track_log limit 1";
		System.out.println("running:" + sql);
		System.out.println(conn.toString());
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2));
		}
	}

}














