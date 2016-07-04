package com.shengli.jvm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
		System.out.println(System.getProperty("java.class.path"));
		try {
			Demo02.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ce shi pa chong 
	 * @throws IOException
	 */
	public static void test() throws IOException {
		URL url = new URL("http://www.baidu.com");
		InputStream is = url.openStream();
		BufferedReader bf = new BufferedReader(new InputStreamReader(is));
		String info = "";
		while((info = bf.readLine()) != null) {
			System.out.println(info);
		}
		bf.close();
		is.close();
	}
}
