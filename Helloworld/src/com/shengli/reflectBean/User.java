package com.shengli.reflectBean;

public class User {
	private int id;
	private int age;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(int id, int age, String username) {
		super();
		this.id = id;
		this.age = age;
		this.username = username;
	}
	public User() {
	}
}












