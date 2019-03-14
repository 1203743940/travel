package com.model;

import java.util.Date;

public class USearch {
	private int user_id;
	private Date timeS;//用户当前行为的时间
	private String searchCi;//用户搜索词
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getTimeS() {
		return timeS;
	}
	public void setTimeS(Date timeS) {
		this.timeS = timeS;
	}
	public String getSearchCi() {
		return searchCi;
	}
	public void setSearchCi(String searchCi) {
		this.searchCi = searchCi;
	}
	

}
