package com.shengli.sorm.core;

import java.util.List;

/**
 * �����ѯ�������ṩ����ĺ�����
 * @author shengli
 *
 */
public interface Query {
	
	/**
	 * ִ��һ��DML���
	 * @param sql	��Ҫִ�е�sql���
	 * @param params	����
	 * @return	����sqlִ�к�Ӱ�������
	 */
	public int executeDML(String sql, Object [] params);
	
	/**
	 * ��һ������洢�����ݿ���
	 * @param obj	Ҫ�洢�Ķ���
	 */
	public void insert(Object obj);
	
	/**
	 * ɾ����Ӧ���е���Ӧ��¼
	 * @param clazz	��Ӧ���Java���class����
	 * @param id	��Ҫɾ���ļ�¼����Ӧ������
	 */
	public void delete(Class clazz, int id);
	public void delete(Object obj);
	
	/**
	 * ����ָ���ֶε�ֵ
	 * @param obj	��Ҫ���µĶ���
	 * @param fieldNames	�����б�
	 * @return
	 */
	public int update(Object obj, String [] fieldNames);
	
	/**
	 * ��ѯ�����ض��м�¼����ÿһ�м�¼���浽clazz����Ӧ����Ķ�����
	 * @param sql	��ѯ���
	 * @param clazz	�洢���ݵ�javabean���class����
	 * @param params	sql����
	 * @return	��ѯ���
	 */
	public List queryRow(String sql, Class clazz, Object [] params);
	
	/**
	 * ��ѯ������һ����¼����װ��javabean��
	 * @param sql
	 * @param clazz
	 * @param params
	 * @return
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object [] params);
	
	/**
	 * ��ѯ�����ظü�¼
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object queryValue(String sql, Object [] params);
	
	public Number queryNumber(String sql, Object [] params);
}




















