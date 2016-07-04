package com.shengli.sorm.core;

import java.util.List;

/**
 * 负责查询，对外提供服务的核心类
 * @author shengli
 *
 */
public interface Query {
	
	/**
	 * 执行一条DML语句
	 * @param sql	将要执行的sql语句
	 * @param params	参数
	 * @return	返回sql执行后影响的行数
	 */
	public int executeDML(String sql, Object [] params);
	
	/**
	 * 将一个对象存储在数据库中
	 * @param obj	要存储的对象
	 */
	public void insert(Object obj);
	
	/**
	 * 删除对应表中的相应记录
	 * @param clazz	对应表的Java类的class对象
	 * @param id	将要删除的记录所对应的主键
	 */
	public void delete(Class clazz, int id);
	public void delete(Object obj);
	
	/**
	 * 更新指定字段的值
	 * @param obj	所要更新的对象
	 * @param fieldNames	属性列表
	 * @return
	 */
	public int update(Object obj, String [] fieldNames);
	
	/**
	 * 查询并返回多行记录，将每一行记录保存到clazz所对应的类的对象中
	 * @param sql	查询语句
	 * @param clazz	存储数据的javabean类的class对象
	 * @param params	sql参数
	 * @return	查询结果
	 */
	public List queryRow(String sql, Class clazz, Object [] params);
	
	/**
	 * 查询并返回一条记录，封装到javabean中
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object [] params);
	
	/**
	 * 查询并返回该记录
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object queryValue(String sql, Object [] params);
	
	public Number queryNumber(String sql, Object [] params);
}




















