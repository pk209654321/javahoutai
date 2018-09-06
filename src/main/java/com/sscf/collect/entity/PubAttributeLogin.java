package com.sscf.collect.entity;

import com.sscf.collect.dto.LoginResultDto;

public class PubAttributeLogin {
	private String api;
	private Integer version;
	private  Long timestamp;
	private LoginResultDto data;
	
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public LoginResultDto getData() {
		return data;
	}
	public void setData(LoginResultDto data) {
		this.data = data;
	}
	
	
}
