package com.shengli.myThread;

public class JoinThread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		MyJoin m = new MyJoin();
		Thread t = new Thread(m);
		t.start();
		for(int i=0;i<1000;i++) {
			if(i == 100) {
				t.join();
			}
			System.out.println("main:  " + i);
		}
	}

}
class MyJoin implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("join:  " + i);
		}
		
	}
	
}