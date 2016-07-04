package com.shengli.testFile;

import java.io.File;
import java.io.IOException;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("/Users/shengli/tmp_shengli/java_pro/TestObject.java");
		File f2 = new File("/Users/shengli/tmp_shengli/java_pro");
		//f.createNewFile();
		f.delete();
		if(f.isFile()) {
			System.out.print('Y');
		}
		if(f2.isDirectory()) {
			System.out.print("y");
		}
		System.out.print(f.getName());
	}

}
