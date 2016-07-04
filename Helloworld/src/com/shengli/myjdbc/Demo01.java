package com.shengli.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement state = null;
		ResultSet set = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "password");
//			Statement state = conn.createStatement();
//			String str = "insert into UserTbl values (2, 'zhang san', 'pwd')";
//			state.execute(str);
			
//			String sql = "insert into UserTbl (id, username) values (?, ?)";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, 3);
//			ps.setString(2, "lisi");
//			int count = ps.executeUpdate();
//			System.out.println(count);
			String sql = "select * from UserTbl";
			state = conn.prepareStatement(sql);
			set = state.executeQuery();
			
			while(set.next()) {
				System.out.println(set.getInt(1) + "--" + set.getString(2));
			}
			
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
