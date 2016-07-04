package com.shengli.bean;

/**
 * ��װ��java���Ժ�set, get������Դ����
 * @author shengli
 *
 */
public class JavaFieldGetSet {
	/**
	 * ���Ե�Դ�룬�磺private int userId
	 */
	private String fieldInfo;
	/**
	 * get������Դ��
	 */
	private String getInfo;
	/**
	 * set������Դ��
	 */
	private String setInfo;
	
	@Override
	public String toString() {
		System.out.println(fieldInfo);
		System.out.println(getInfo);
		System.out.println(setInfo);
		return super.toString();
	}
	public String getFieldInfo() {
		return fieldInfo;
	}
	public void setFieldInfo(String fieldInfo) {
		this.fieldInfo = fieldInfo;
	}
	public String getGetInfo() {
		return getInfo;
	}
	public void setGetInfo(String getInfo) {
		this.getInfo = getInfo;
	}
	public String getSetInfo() {
		return setInfo;
	}
	public void setSetInfo(String setInfo) {
		this.setInfo = setInfo;
	}
	public JavaFieldGetSet(String fieldInfo, String getInfo, String setInfo) {
		super();
		this.fieldInfo = fieldInfo;
		this.getInfo = getInfo;
		this.setInfo = setInfo;
	}
	public JavaFieldGetSet(){}
}
