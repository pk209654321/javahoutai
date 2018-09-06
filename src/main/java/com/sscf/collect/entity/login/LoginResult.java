package com.sscf.collect.entity.login;

import java.io.Serializable;

public class LoginResult implements Serializable{
	/*id	bigint
	user_id	int
	login_count	int
	insert_time	datetime*/
	private Long id;
	private Integer user_id;
	private Integer login_count ;
	private String insert_time;
	private String hour;
	
	
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getLogin_count() {
		return login_count;
	}
	public void setLogin_count(Integer login_count) {
		this.login_count = login_count;
	}
	public String getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(String insert_time) {
		this.insert_time = insert_time;
	}
	
	


}
