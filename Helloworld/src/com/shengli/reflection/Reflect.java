package com.shengli.reflection;

public class Reflect {
	public static void main(String[] args) {
		String path = "com.shengli.reflectBean.User";
		try {
			Class c = Class.forName(path);
			System.out.println(c);
			
			Class c1 = String.class;
			Class c2 = path.getClass();
			System.out.println(c1);
			System.out.println(c2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
