package com.shengli.simple;

import java.util.ArrayList;
import java.util.List;

public class Method {

	public static <T> void method(T t) {
		System.out.println(t);
	}
	public static <T extends List> void method2(T t) {
		t.add("aaaaa");
		System.out.println(t.get(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method m = new Method();
	    //method2(new ArrayList());
	}

}
