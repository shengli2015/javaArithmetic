package com.shengli.fengzhuang;

public class Test01 {

	private String str;
	protected void print1() {
		System.out.print("test01,print1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Test001 extends Test01 {
	public void p() {
		super.print1();
		print1();
	}
}
class Test0001 {
	public void dd() {
		Test01 tt = new Test01();
		tt.print1();
	}
}
