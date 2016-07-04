package com.shengli.testbeifeng;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String [] args) {
		System.out.println("please input numbers: DDD-DD-DDDD");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Pattern p = Pattern.compile("[0-9]{3}-[0-9]{2}-[0-9]{4}");
		Matcher m = p.matcher(str);
		if(m.matches()) {
			System.out.print("Valid SSN");
		} else {
			System.out.print("Invalid SSN");
		}
	}
}
	