package com.shengli.sorm.core;

public class MysqlTypeConvertor implements TypeConvertor{

	@Override
	public String dbType2JavaType(String columnType) {
		//varchar --> String
		if("varchar".equalsIgnoreCase(columnType)) {
			return "String";
		} else if ("int".equalsIgnoreCase(columnType)
				|| "tinyint".equalsIgnoreCase(columnType)
				|| "smallint".equalsIgnoreCase(columnType)
				|| "integer".equalsIgnoreCase(columnType)) {
			return "Integer";
		} else if("bigint".equalsIgnoreCase(columnType)) {
			return "long";
		} else if("double".equalsIgnoreCase(columnType) || "float".equalsIgnoreCase(columnType)) {
			return "double";
		} else if("clob".equalsIgnoreCase(columnType)) {
			return "java.sql.clob";
		} else if("blob".equalsIgnoreCase(columnType)) {
			return "java.sql.blob";
		} else if("date".equalsIgnoreCase(columnType)) {
			return "java.sql.Date";
		} else if("time".equalsIgnoreCase(columnType)) {
			return "java.sql.Time";
		} else if("timestamp".equalsIgnoreCase(columnType)) {
			return "java.sql.Timestamp";
		}
		
		return null;
	}

	@Override
	public String javaType2DbType(String javaDataType) {
		return null;
	}
	
}
