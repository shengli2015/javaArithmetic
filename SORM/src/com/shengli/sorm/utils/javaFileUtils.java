package com.shengli.sorm.utils;

import java.util.Map;

import com.shengli.bean.ColumnInfo;
import com.shengli.bean.JavaFieldGetSet;
import com.shengli.bean.TableInfo;
import com.shengli.sorm.core.MysqlTypeConvertor;
import com.shengli.sorm.core.TypeConvertor;

/**
 * ��װ������java�ļ���Դ�ļ�������ز���
 * @author shengli
 *
 */
public class javaFileUtils {
	/**
	 * �����ֶ���Ϣ����java����Դ�룬�� varchar username --> private String username�Լ�set,getԴ��
	 * @param column �ֶ���Ϣ
	 * @param convertor ����ת����
	 * @return java���Ժ�set/getԴ��
	 */
	public static JavaFieldGetSet createFieldGetSetSrc(ColumnInfo column, TypeConvertor convertor) {
		JavaFieldGetSet jfgs = new JavaFieldGetSet();
		String javaFieldType = convertor.dbType2JavaType(column.getDataType());
		jfgs.setFieldInfo("\tprivate "+javaFieldType+" "+column.getName());
		
		//����get������Դ����
		StringBuilder getSrc = new StringBuilder();
		//public String getUser(){return user;}
		getSrc.append("\tpublic "+javaFieldType+" get"+StringUtils.firstChar2UpperCase(column.getName())+"(){\n");
		getSrc.append("\t\treturn "+column.getName()+";\n");
		getSrc.append("\t}\n");
		jfgs.setGetInfo(getSrc.toString());
		
		//����set������Դ����
		StringBuilder setSrc = new StringBuilder();
		//public void setUser(String user){this.user=user;}
		getSrc.append("\tpublic void "+"set"+StringUtils.firstChar2UpperCase(column.getName())+"(");
		getSrc.append(javaFieldType+" "+column.getName()+"){\n");
		getSrc.append("\t\tthis."+column.getName()+"="+column.getName()+";\n\t}\n");
		jfgs.setSetInfo(getSrc.toString());
		return jfgs;
	}
	
	public static String createJavaSrc(TableInfo tableInfo, TypeConvertor convertor) {
		StringBuilder src = new StringBuilder();
		Map<String, ColumnInfo> columns = tableInfo.getColumns();
		//List<ColumnInfo> 
		return null;
	}
	
	public static void main(String[] args) {
		ColumnInfo column = new ColumnInfo("username", "varchar", 0);
		TypeConvertor tc = new MysqlTypeConvertor();
		System.out.println(createFieldGetSetSrc(column, tc).toString());
	}
}
