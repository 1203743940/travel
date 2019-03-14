package com.model;

public class Scenery {
	private int s_id;
	private String s_name;
	private String level;
	private String place;
	private String open;//开放时间
	private String introduction;//景点介绍
	private int comment;//评论次数
	private Float grade;//游客评分

	private String keyword;//关键词
	private Float hotnum;//热度
	private String kind;//景点种类
	private String img;//景点图片
	private Float lng;//景点经度
	private Float lat;//纬度
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public Float getGrade() {
		return grade;
	}
	public void setGrade(Float grade) {
		this.grade = grade;
	}
	/*public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getCollect() {
		return collect;
	}
	public void setCollect(int collect) {
		this.collect = collect;
	}*/
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Float getHotnum() {
		return hotnum;
	}
	public void setHotnum(Float hotnum) {
		this.hotnum = hotnum;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Float getLng() {
		return lng;
	}
	public void setLng(Float lng) {
		this.lng = lng;
	}
	public Float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	
 
}
