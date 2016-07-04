package com.shengli.ioFile;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print(File.pathSeparator);    //路径分隔符
		//System.out.print(File.separator);        //名称分隔符
		
		String str1 = "/Users/shengli/tmp_shengli/";
		String str2 = "demo.java";
		File src = new File(str1, str2);
		//System.out.println(src.getName());
		//System.out.println(src.getPath());
		File src2 = new File("test.java");
		System.out.println(src2.getName());
		System.out.println(src2.getPath());
		System.out.println(src2.getAbsolutePath());
	}

}
