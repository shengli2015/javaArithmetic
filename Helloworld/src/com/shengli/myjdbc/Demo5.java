package com.shengli.myjdbc;

import java.io.*;
import java.sql.*;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet set = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
		//conn.setAutoCommit(false);
		state = conn.prepareStatement("insert into UserTbl values (11, ?, ?, ?)");
		state.setString(1, "chenli");
		state.setObject(2, "password");
		//state.setClob(3, new FileReader(new File("/Users/shengli/tmp_shengli/client.java")));
		state.setClob(3, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("shengli123456".getBytes()))));
		state.executeUpdate(); 
		
		state = conn.prepareStatement("select * from UserTbl where id = 11");
		set = state.executeQuery();
		while(set.next()) {
			Clob clob = set.getClob("text");
			Reader r = clob.getCharacterStream();
			int str = 0;
			while((str = r.read()) != -1) {
				System.out.print((char)str);
			}
		}
		set.close();
		state.close();
		conn.close();
	}
}
