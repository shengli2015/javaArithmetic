package com.shengli.abstracclass;

public abstract class Animal {
	String str;
	
	public Animal() {
		System.out.print("Animal");
	}
	
	public abstract void run();
	
	public void breath() {
		System.out.print("huxi");
	}

}

class Cat extends Animal {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("miao");
	}
	
	public Cat() {
		System.out.print("cat");
	}
	
}

class Dog extends Animal {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("wang");
	}
	public static void main(String [] args){
		System.out.print("main(");
	}
	
}
