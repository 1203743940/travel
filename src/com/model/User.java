package com.model;

import java.util.Date;

public class User {
	private int user_id;
	
	private String ps;
	private String name;
	private String phone;
	private String sex;
	private java.sql.Date birth;
	private String add;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public java.sql.Date getBirth() {
		return birth;
	}
	public void setBirth(java.sql.Date birth) {
		this.birth = birth;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	

}
