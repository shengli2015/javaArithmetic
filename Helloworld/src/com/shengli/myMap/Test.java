package com.shengli.myMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		Map map = new HashMap();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println((String)iter.next());
			iter.remove();
		}
		System.out.println(set.size() );
	}

}
