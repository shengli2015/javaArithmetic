package com.shengli.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CopyOfDemo03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement state = null;
		Statement state2 = null;
		ResultSet set = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
			conn.setAutoCommit(false);
			
			state = conn.createStatement();
			state.execute("insert into UserTbl values (11, 'ss11', 'pp11')");
			System.out.println("first person");
			
			Thread.sleep(3000);
			
			state2 = conn.createStatement();
			state2.execute("insert into UserTbl values (1,22, 'ss22', 'pp22')");
			System.out.println("second person");
			
			
			
		} catch (ClassNotFoundException e) {
			//conn.rollback();
			//e.printStackTrace();
		} catch (SQLException e) {
			//e.printStackTrace();
			//conn.rollback();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} finally {
			System.out.println("sssssss");
			conn.commit();
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
