package com.shengli.jicheng;

public class Animal {
	
	public void voice() {
		System.out.print("putong jiaosheng");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Cat extends Animal{
	public void voice() {
		System.out.print("miao");
	}
}
class Dog extends Animal{
	public void voice() {
		System.out.print("wang");
	}
	public void catchMouse() {
		System.out.print("catch mouse");
	}
}
class Pig extends Animal {
	public void voice() {
		System.out.print("heng");
	}
}
