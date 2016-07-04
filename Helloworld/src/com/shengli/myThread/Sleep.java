package com.shengli.myThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Date date = new Date(System.currentTimeMillis() + 10*1000);
		long flag = date.getTime();
		while(true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(date));
			date = new Date(date.getTime() - 1000);
			Thread.sleep(1000);
			if(flag-10000 > date.getTime()) {
				break;
			}
		}
	}
	
	public static void test() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		for(int i=10;i>0;i--) {
			System.out.println(i);
			t.sleep(1000);
		}
	}

}
