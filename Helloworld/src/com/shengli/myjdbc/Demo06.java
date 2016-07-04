package com.shengli.myjdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Demo06 {
	static Properties pro = null; 
	static {
		pro = new Properties();
		try {
			pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Class.forName(pro.getProperty("mysqlDriver"));
		Connection conn = DriverManager.getConnection(pro.getProperty("mysqlURL"), pro.getProperty("mysqlUser"), pro.getProperty("mysqlPwd"));
		if(conn != null) {
			System.out.println("shengli");
		}
	}
}







