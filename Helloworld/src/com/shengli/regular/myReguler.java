package com.shengli.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myReguler {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\w+");     
//		Matcher m = p.matcher("sdfsdfsfsf3@433424");
		//boolean flag = m.matches();
		//System.out.println(flag);
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.find());
//		System.out.println(m.group());
//		System.out.println(m.find());
//		System.out.println(m.group());
		
//		Pattern p = Pattern.compile("([a-z]+)([\\d]+)");
//		Matcher m = p.matcher("aaa111##bbb33#dfd4");
//		while(m.find()) {
//			System.out.println(m.group());
//			System.out.println(m.group(1));
//			System.out.println(m.group(2));
//		}
//		Pattern p = Pattern.compile("\\d");
//		Matcher m = p.matcher("asdf333^dfd444");
//		String str = m.replaceAll("*");
//		System.out.print(str);
		
		String str = "abcdef11111aaaa444gggg55";
		String [] array = str.split("[0-9]+");
		System.out.println(Arrays.toString(array));
	}
}
