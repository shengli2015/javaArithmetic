package com.jdb.test;

import java.sql.Connection;
import java.sql.Statement;

import com.jdb.util.java_db;

public class JdbcTest {
	java_db db_util = new java_db();
	Connection conn = db_util.getConnection();
	String str = "select * from UserTbl";
	//Statement state = conn.createStatement();
	
}
