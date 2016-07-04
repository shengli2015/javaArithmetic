package com.shengli.oop;

public class Animal2 {
	String eye;
	public Animal2() {
		super();
	} 
	public void run() {
		System.out.print("pao");
	}
	public void eat() {
		System.out.print("chi");
	}
	public void sleep() {
		System.out.print("sleep");
	}

	public static void main(String[] args) {
		System.out.print("sdf");
	}

}

class Mannal2{
	Animal2 animal2;
	public void taisheng() {
		System.out.print("taisheng");
	}
}

class Bird2{
	Animal2 animal2;
	public void run() {
		System.out.print("fly");
	}
	
	public void eggsheng() {
		System.out.print("eggsheng");
	}
}


