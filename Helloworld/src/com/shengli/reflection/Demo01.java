package com.shengli.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, NoSuchMethodException {
		String path = "com.shengli.reflectBean.User";
		try {
			Class c = Class.forName(path);
			System.out.println(c.getName());
			System.out.println(c.getSimpleName());
			
			Field [] f = c.getFields();
			Field [] f2 = c.getDeclaredFields();
			Field ff = c.getDeclaredField("username");
			System.out.println(f.length);
			System.out.println(f2.length);
			for(Field temp : f2) {
				System.out.println(temp);
			}
			
			Method [] method = c.getDeclaredMethods();
			Method method2 = c.getDeclaredMethod("setUsername", String.class);
			System.out.println();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
