package com.shengli.simple;

public class MyStudent<T> {
	public T score;
	public MyStudent(T s) {
		this.score = s;
	}
	public T getScore() {
		return this.score;
	}
	
}
