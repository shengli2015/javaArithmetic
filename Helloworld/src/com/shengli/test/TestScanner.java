package com.shengli.test;

import java.util.Scanner;

public class TestScanner {
	
	public void pr() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(str);
	}
	public void pr2(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a + b;
		System.out.print(c);
		
	}

	public static void main(String[] args) {
		TestScanner t = new TestScanner();
		//t.pr();
		t.pr2();
	}

}
