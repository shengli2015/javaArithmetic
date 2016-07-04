package com.shengli.stringTest;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("abcdefg");
		s.append(false);
		//s.delete(2, 4);
		s.reverse();
		System.out.print(s);
	}

}
