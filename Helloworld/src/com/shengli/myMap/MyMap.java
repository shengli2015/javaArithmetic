package com.shengli.myMap;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
//常引用和equal
public class MyMap {
	public int aa;
	public MyMap(int a) {
		aa = a;
	}

	public static void main(String[] args) {
/*		Map m = new HashMap();
		m.put("a", "aa");
		m.put("a", "a");
		m.size();
		System.out.print(m.size());
*/
		final MyMap m1 = new MyMap(2);
		MyMap m2 = new MyMap(2);
		MyMap m3 = m1;
		//m1.aa = 3;
		m1.aa = 4;
		System.out.println(m1.aa);

		final String s1 = new String("aaa");
		String s2 = new String("aaa");
		String s3 = s1;
		String s4 = "aaa";
		//s1 = new String("b"); 
		System.out.println(s1==s3);
		System.out.println(s1.contains("aaa"));
		//System.out.println(s1);
		List list = new ArrayList();
		list.add("aaa");
		List llist = new LinkedList();
		llist.add("aaa"); 
		Set set = new HashSet();
		set.add("bbb:=:");
		Map map = new HashMap();
		map.put("a", "value");
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		String str = new String("2007-10");
		try {
			System.out.println(format.parse(str));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
