package com.shengli.myThread;

public class Demo01 {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		new Thread(m).start();
		for(int i=0;i<100;i++) {
			if(i == 50) {
				m.stop();
			}
			System.out.println("main:  " + i);
		}
	}
}
class MyThread implements Runnable {
	private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			System.out.println("my thread");
		}
	}
	public void stop() {
		this.flag = false;
	}
	
}