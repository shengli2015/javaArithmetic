package com.shengli.MyInterface;

public interface InterfaceA {
	public void aa();
}
interface InterfaceB {
	public void bb();
}
interface InterfaceC extends InterfaceA, InterfaceB {
	public void cc();
}

class inter implements InterfaceC {

	@Override
	public void cc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		
	}
	
}