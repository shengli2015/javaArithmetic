package com.shengli.splitString;

public class Student {
	private String name;
	private int no;
	private double score;

	public static void main(String[] args) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Student() {
	}
	public Student(String name, int no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}

}
