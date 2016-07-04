package com.shengli.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.shengli.reflectBean.User;

public class Demo02 {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String path = "com.shengli.reflectBean.User";
		try {
			Class c = Class.forName(path);
			User u = (User) c.newInstance();
			Constructor<User> con = c.getDeclaredConstructor(int.class, int.class, String.class);
		    User u2 = con.newInstance(2, 4, "shengli");
		    System.out.println(u2.getUsername());
		    
		    User u3 = (User) c.newInstance();
		    Method method = c.getDeclaredMethod("setUsername", String.class);
		    method.invoke(u3, "lisheng");
		    System.out.println(u3.getUsername());
		    
		    Field f = c.getDeclaredField("username");
		    f.setAccessible(true);
		    User u4 = (User) c.newInstance();
		    f.set(u4, "ll");
		    System.out.println(u4.getUsername());
		    System.out.println(f.get(u4));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
