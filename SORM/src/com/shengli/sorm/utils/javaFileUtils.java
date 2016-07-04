package com.shengli.sorm.utils;

import java.util.Map;

import com.shengli.bean.ColumnInfo;
import com.shengli.bean.JavaFieldGetSet;
import com.shengli.bean.TableInfo;
import com.shengli.sorm.core.MysqlTypeConvertor;
import com.shengli.sorm.core.TypeConvertor;

/**
 * 封装了生成java文件（源文件）的相关操作
 * @author shengli
 *
 */
public class javaFileUtils {
	/**
	 * 根据字段信息生成java属性源码，如 varchar username --> private String username以及set,get源码
	 * @param column 字段信息
	 * @param convertor 类型转化器
	 * @return java属性和set/get源码
	 */
	public static JavaFieldGetSet createFieldGetSetSrc(ColumnInfo column, TypeConvertor convertor) {
		JavaFieldGetSet jfgs = new JavaFieldGetSet();
		String javaFieldType = convertor.dbType2JavaType(column.getDataType());
		jfgs.setFieldInfo("\tprivate "+javaFieldType+" "+column.getName());
		
		//生成get方法的源代码
		StringBuilder getSrc = new StringBuilder();
		//public String getUser(){return user;}
		getSrc.append("\tpublic "+javaFieldType+" get"+StringUtils.firstChar2UpperCase(column.getName())+"(){\n");
		getSrc.append("\t\treturn "+column.getName()+";\n");
		getSrc.append("\t}\n");
		jfgs.setGetInfo(getSrc.toString());
		
		//生成set方法的源代码
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
