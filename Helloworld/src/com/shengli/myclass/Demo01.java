package com.shengli.myclass;

public class Demo01 {
	public static void main(String[] args) {
		System.out.print("s:");
	}
	
	private static class c1 {
		
	}
	
	private class c2 {
		
	}
	
	public void test() {
		class c3 {}
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("xiancheng");
				
			}
			
		};
	}
	
	
}
