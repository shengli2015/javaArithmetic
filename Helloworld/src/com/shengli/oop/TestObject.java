package com.shengli.oop;

public class TestObject {

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.print(obj.toString());
		System.out.print(obj == obj2);
		System.out.println(obj.equals(obj2));
		Mobile mobile = new Mobile();
		System.out.print(mobile.toString());
	}

}
