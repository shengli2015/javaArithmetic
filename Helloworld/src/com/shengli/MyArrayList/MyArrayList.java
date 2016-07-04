package com.shengli.MyArrayList;

public class MyArrayList {
	
	Object [] value;
	int size;
	public MyArrayList() {
		//value = new Object[16];
		this(16);
	}
	public MyArrayList(int size) {
		value = new Object[size];
	}
	public void add(Object object) {
		value[size] = object;
		size++;
	}
	public Object get(int index) throws Exception {
		if(index<0 || index>size-1) {
			throw new Exception();
		}
		return value[index];
	}

	public int size() {
		return size;
	}
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("ssdf");
		list.add(new Human("shengli"));
	}

}
