package com.model;

import java.util.Date;


public class UccS {
	private int user_id;
	private int s_id;
	private Date timeC;//用户当前行为的时间
	private String whatDo;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public Date getTimeC() {
		return timeC;
	}
	public void setTimeC(Date timeC) {
		this.timeC = timeC;
	}
	public String getWhatDo() {
		return whatDo;
	}
	public void setWhatDo(String whatDo) {
		this.whatDo = whatDo;
	}
	
	

}
