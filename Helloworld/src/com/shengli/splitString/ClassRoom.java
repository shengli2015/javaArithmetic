package com.shengli.splitString;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private int no;
	private List<Student> stuList;
	private double total;

	public ClassRoom() {
		stuList = new ArrayList<Student>();
	}
	public ClassRoom(int no) {
		this();
		no = no;
	}
	public ClassRoom(int no, List<Student> stuList, double total) {
		super();
		this.no = no;
		this.stuList = stuList;
		this.total = total;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
