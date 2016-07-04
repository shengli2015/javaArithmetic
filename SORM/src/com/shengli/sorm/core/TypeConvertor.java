package com.shengli.sorm.core;

/**
 * ����java���ͺ����ݿ����͵��໥ת��
 * @author shengli
 *
 */
public interface TypeConvertor {
	
	/**
	 * �������ݿ�����ת��Ϊjava����
	 * @param columnType	���ݿ��ֶε���������
	 * @return	java��Ӧ����������
	 */
	public String dbType2JavaType(String columnType);
	
	/**
	 * ����java����ת��Ϊ���ݿ���������
	 * @param javaDataType	java��������
	 * @return	���ݿ���������
	 */
	public String javaType2DbType(String javaDataType);
}
