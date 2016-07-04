package com.shengli.jvm;

public class Demo01 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(A.width);
	}
}

class A {
	public static int width = 111;
	static {
		System.out.println("jintai");
		width = 300;
	}
	public A() {
		System.out.println("gouzhao A");
	}
}