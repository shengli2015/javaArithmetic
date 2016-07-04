package com.shengli.splitString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = exam();
		Map<Integer, ClassRoom> map = count(list);
		view(map);
	}
	
	public static void view (Map<Integer, ClassRoom> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int no = it.next();
			//System.out.println(no);
			double sum = map.get(no).getTotal();
			double avg = sum / map.get(no).getStuList().size();
			System.out.println(no + "---" + sum + "   " + avg);
		}
	}
	public static Map<Integer, ClassRoom> count(List<Student> list) {
		Map<Integer, ClassRoom> map = new HashMap<Integer, ClassRoom>();
		for(Student stu : list) {
			ClassRoom room = map.get(stu.getNo());
			if(room == null) {
				room = new ClassRoom(stu.getNo());
				map.put(stu.getNo(), room);
			}
			room.getStuList().add(stu);
			room.setTotal(room.getTotal() + stu.getScore());
		}
		
		return map;
	}
	public static List<Student> exam() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("s1", 1, 80));
		list.add(new Student("s2", 2, 81));
		list.add(new Student("s1", 1, 85));
		list.add(new Student("s3", 5, 89));
		return list;
	}
}
