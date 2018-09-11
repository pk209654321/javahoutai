package com.sscf.collect.entity.login;

import java.util.List;

public class ResultLogin {
	private Integer code=0;
	private String msg="调用成功";
	private List<LoginResult> data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<LoginResult> getData() {
		return data;
	}
	public void setData(List<LoginResult> data) {
		this.data = data;
	}
	
	

}
