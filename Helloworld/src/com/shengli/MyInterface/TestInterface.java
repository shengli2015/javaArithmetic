package com.shengli.MyInterface;

public interface TestInterface {
	public String str = "sdf";
	public void fly();

}

interface Attack {
	public void att();
}

class bird implements TestInterface {
	public void fly() {
		System.out.print("BIRD");
	}
}
class man implements TestInterface, Attack {
	public void fly() {
		System.out.print("man");
	}

	@Override
	public void att() {
		System.out.print("attack");
		
	}
}