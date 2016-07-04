package com.shengli.myjdbc;

import java.io.*;
import java.sql.*;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet set = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
		state = conn.prepareStatement("insert into UserTbl values (12, ?, ?, 'd', ?)");
		state.setObject(1, "chenli");
		state.setObject(2, "password");
		state.setBlob(3, new FileInputStream("/Users/shengli/Desktop/chenli.png"));
		state.execute();
		state.close();
		conn.close();
	}
}
