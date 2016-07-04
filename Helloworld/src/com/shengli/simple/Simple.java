package com.shengli.simple;

import java.util.ArrayList;
import java.util.List;

public class Simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add(new String("aaa"));
		//System.out.print(list.get(0));
		List <String> l = new ArrayList <String> ();
		l.add("aaaa");
		l.get(0);
		
		MyStudent ms = new MyStudent("shengli");
		System.out.println(ms.getScore());
		MyStudent<Integer> ms2 = new MyStudent<Integer>(88);
		System.out.println(ms2.getScore() );
	}

}
