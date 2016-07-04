package com.shengli.jicheng;

import com.shengli.fengzhuang.Test01;

public class Test {

	public static void testAnimalVoice(Animal c) {
		 c.voice();
		 if(c instanceof Cat) {
			 System.out.print("ok");
		 }
	}
/*	public static void testAnimalVoice(Dog d) {
		 d.voice();
	}
	public static void testAnimalVoice(P ig p) {
		 p.voice();
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Dog c2 = new Dog();
		Animal d = new Dog();
		Animal p = new Pig();
		testAnimalVoice(c);
		testAnimalVoice(d);
		testAnimalVoice(p);
		Dog d1 = (Dog)d;
		d1.catchMouse();
		c2.catchMouse();
		Test01 t = new Test01();
		//Test001 tt = new Test001();
	}

}
