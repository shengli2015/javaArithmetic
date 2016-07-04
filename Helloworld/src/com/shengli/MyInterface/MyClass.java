package com.shengli.MyInterface;

public class MyClass implements MyInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int ff(int a, int b) {
		System.out.print("ff");
		return a + b;
	}

	@Override
	public void pp() {
		// TODO Auto-generated method stub
		System.out.print("pp");
		//MyInterface.maxRead;
	}

}
