package com.shengli.oop;

public class Animal {
	final String eye = "sdf";
	public Animal() {
		//super();
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

class Mannal extends Animal{
	
	public void taisheng() {
		System.out.print("taisheng");
		this.run(); 
	}
}

class Bird extends Animal{
	public void run() {
		super.run();
		System.out.print("fly");
	}
	
	public void eggsheng() {
		System.out.print("eggsheng");
	}
}




















