package com.shengli.splitString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * ·Ö¼ð´æ´¢
 * @author shengli
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = "t df dfdfs sdfsfas ere erew rdf t df ere".split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String key : str) {
			if(!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key)+1);
			}
		}
		
		/*
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s + "---" + map.get(s));
		}
		*/
		Set<Entry<String, Integer>> e = map.entrySet();
		for(Entry<String, Integer> entry : e) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}
	}

}
