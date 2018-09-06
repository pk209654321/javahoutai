package com.sscf.collect.dto;

import com.sscf.education.common.entity.PageInfo;

public class LoginResultDto {
	private Integer user_id;
	private String start_time;
	private String end_time;
	private String mobile;
	
	
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	@Override
	public String toString() {
		return "LoginResultDto [user_id=" + user_id + ", start_time=" + start_time + ", end_time=" + end_time + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
