package com.shengli.tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Hive2Mysql {
	Properties prop = new Properties();
	
	public Hive2Mysql(String propertyName) throws Exception {
		init(propertyName);
	}
	
	public void init(String propertyName) throws Exception {
		InputStream stream = new FileInputStream(propertyName);
		prop.load(stream);
	}
	
	public static void main(String [] args) {
		try {
			if(args.length < 1) {
				System.out.println("please set propertyName");
				System.exit(1);
			}
			String propertyName = args[0];
			Hive2Mysql h2 = new Hive2Mysql(propertyName);
			System.out.println(h2.prop.get("Hive_sql"));
			System.out.println(h2.prop.get("Mysql_table"));
			String Hive_sql = h2.prop.get("Hive_sql").toString();
			String Mysql_table = h2.prop.get("Mysql_table").toString();
			String mysql_columns = h2.prop.get("mysql_columns").toString();
			String mysql_delete = h2.prop.get("mysql_delete").toString();
			
			Connection mysqlCon = MyConnection.getMysqlInstance();
			Connection hiveCon = MyConnection.getHiveInstance();
			
			String mysql_sql = "insert into " + Mysql_table + " (" + mysql_columns + ") values (";
			
			Statement stHive = hiveCon.createStatement();
			Statement stMysql = mysqlCon.createStatement();
		    ResultSet rsHive = stHive.executeQuery(Hive_sql);
 			int len = Hive_sql.split("from")[0].split("select")[1].trim().split(",").length;
 			String value = "";
 			stMysql.execute(mysql_delete);
 			
 			while(rsHive.next()) {
 				for(int i=1;i<=len;i++) {
 					value += "'" + rsHive.getString(i) + "',";
 				}
 				value = value.substring(0, value.length()-1);
 				mysql_sql = mysql_sql + value + ")";
 				stMysql.execute(mysql_sql);
 				System.out.println(value);
 				value = "";
 				mysql_sql = "insert into " + Mysql_table + " (" + mysql_columns + ") values (";
 			}
 			rsHive.close();
 			stHive.close();
 			stMysql.close();
 			mysqlCon.close();
 			hiveCon.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
