package com.shengli.sorm.core;

/**
 * 负责java类型和数据库类型的相互转化
 * @author shengli
 *
 */
public interface TypeConvertor {
	
	/**
	 * 负责数据库类型转化为java类型
	 * @param columnType	数据库字段的数据类型
	 * @return	java对应的数据类型
	 */
	public String dbType2JavaType(String columnType);
	
	/**
	 * 负责将java类型转化为数据库数据类型
	 * @param javaDataType	java数据类型
	 * @return	数据库数据类型
	 */
	public String javaType2DbType(String javaDataType);
}
