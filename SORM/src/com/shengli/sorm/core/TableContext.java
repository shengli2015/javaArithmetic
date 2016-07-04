package com.shengli.sorm.core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.shengli.bean.ColumnInfo;
import com.shengli.bean.TableInfo;

/**
 * ����������ݿ��ṹ����ṹ�Ĺ�ϵ���������ݱ�ṹ���ɶ�Ӧ����ṹ
 * @author shengli
 *
 */
public class TableContext {
	/**
	 * ����Ϊkey������Ϣ����Ϊvalue
	 */
	public static Map<String, TableInfo> tables = new HashMap<String, TableInfo>(); 
	/**
	 * ��po��class���������Ϣ������������������
	 */
	public static Map<Class, TableInfo> poClassTableMap = new HashMap<Class, TableInfo>();
	private TableContext() {}
	
	static {
		try {
			Connection conn = DBManager.getConn();
			DatabaseMetaData dbmd = conn.getMetaData();
			
			ResultSet tableRet = dbmd.getTables(null, "%", "%", new String [] {"TABLE"});
			while(tableRet.next()) {
				String tableName = (String)tableRet.getObject("TABLE_NAME");
				TableInfo ti = new TableInfo(tableName, new ArrayList<ColumnInfo>(), new HashMap<String, ColumnInfo>());
				
				ResultSet set = dbmd.getColumns(null, "%", tableName, "%");
				while(set.next()) {
					ColumnInfo ci = new ColumnInfo(set.getString("COLUMN_NAME"), set.getString("TYPE_NAME"), 0);
					ti.getColumns().put(set.getString("COLUMN_NAME"), ci);
				}
				
				ResultSet set2 = dbmd.getPrimaryKeys(null, "%", tableName);
				while(set2.next()) {
					ColumnInfo ci2 = (ColumnInfo)ti.getColumns().get(set2.getObject("COLUMN_NAME"));
					ci2.setKeyType(1);
					ti.getPriKeys().add(ci2);
				}
				if(ti.getPriKeys().size() > 0) {
					ti.setOnlyPriKey(ti.getPriKeys().get(0));
				}
				tables.put(tableName, ti); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Map<String, TableInfo> tables = TableContext.tables;
		System.out.println();
	}
}









