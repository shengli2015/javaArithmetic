package com.shengli.simple;

public abstract class Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}

class C1<T1, T2> extends Father<T1, T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}
	
}
class C2<T2, A, B> extends Father<Integer, T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}
	
}
class C3 extends Father<Integer, String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
class C4 extends Father {

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}
	 
}