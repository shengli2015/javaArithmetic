package com.shengli.ioFile;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test() throws IOException {
		File src = new File("/Users/shengli/tmp_shengli/java_test/");
		System.out.println(src.exists());
		//System.out.println(src.length());
		if(!src.exists()) {
			boolean f = src.createNewFile();
			System.out.println(f ? "success" : "fail");
		}
		boolean f2 = src.delete();
		System.out.println(f2);
		File temp = File.createTempFile("temp", ".temp", new File("/Users/shengli/tmp_shengli/java_test/"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		temp.deleteOnExit();
	}
}
