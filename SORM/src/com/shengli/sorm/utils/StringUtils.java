package com.shengli.sorm.utils;

/**
 * ��װ���ַ������õĲ���
 * @author shengli
 *
 */
public class StringUtils {
	/**
	 * ��Ŀ���ַ�������ĸ��д
	 * @param str Ŀ���ַ���
	 * @return ����ĸ��д����ַ���
	 */
	public static String firstChar2UpperCase(String str) {
		return str.toUpperCase().substring(0, 1) + str.substring(1);
	}
}
