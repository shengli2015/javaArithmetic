package com.shengli.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement state = null;
		ResultSet set = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
			conn.setAutoCommit(false);
			state = conn.createStatement();
			long start = System.currentTimeMillis();
			for(int i=0;i<5000;i++) {
				String str = "insert into UserTbl values (" + i +", \"sss" + i + "\", \"ppp" + i + "\")";
				state.addBatch(str);
			}
			state.executeBatch();
			
			conn.commit();
			long end = System.currentTimeMillis();
			long time = end - start;
			System.out.println(time);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(set != null) {
				try {
					set.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(state != null) {
				try {
					state.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
}
