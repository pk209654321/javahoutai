package com.sscf.collect.entity;

public class UserScreeningObj {
	
	private Integer id;
	
	 /**
     * The user id.
     * 
     * @Fields user_id 用户id 
    */
    private Integer user_id;
    
    private String mobile_tel;
    
    private Integer operation_count;//启动次数
    
    private Long user_online_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getMobile_tel() {
		return mobile_tel;
	}

	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}

	public Integer getOperation_count() {
		return operation_count;
	}

	public void setOperation_count(Integer operation_count) {
		this.operation_count = operation_count;
	}

	public Long getUser_online_time() {
		return user_online_time;
	}

	public void setUser_online_time(Long user_online_time) {
		this.user_online_time = user_online_time;
	}
    
    
    
   
    
    
    
    
    
    
    

}
