package com.sscf.collect.dto;

import com.sscf.education.common.entity.PageInfo;

public class UserScreeningDto extends PageInfo{
	
	private Integer id;
	
	 /**
     * The user id.
     * 
     * @Fields user_id 用户id 
    */
    private Integer user_id;
   
    private Integer operation_count;//启动次数
    
    private Integer source;//来源
    
    private Long user_online_time;
     
    private Integer click_count;
    
    private Long stay_time;
    
    private String start_time;
    
    private String end_time;
    
    private String mngr_role;
    
    private Long mngr_user_id;
    
    private Integer user_sort;
    
    private Integer content_sort;

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

	public Integer getOperation_count() {
		return operation_count;
	}

	public void setOperation_count(Integer operation_count) {
		this.operation_count = operation_count;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Long getUser_online_time() {
		return user_online_time;
	}

	public void setUser_online_time(Long user_online_time) {
		this.user_online_time = user_online_time;
	}

	public Integer getClick_count() {
		return click_count;
	}

	public void setClick_count(Integer click_count) {
		this.click_count = click_count;
	}

	public Long getStay_time() {
		return stay_time;
	}

	public void setStay_time(Long stay_time) {
		this.stay_time = stay_time;
	}

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

	public String getMngr_role() {
		return mngr_role;
	}

	public void setMngr_role(String mngr_role) {
		this.mngr_role = mngr_role;
	}

	public Long getMngr_user_id() {
		return mngr_user_id;
	}

	public void setMngr_user_id(Long mngr_user_id) {
		this.mngr_user_id = mngr_user_id;
	}

	public Integer getUser_sort() {
		return user_sort;
	}

	public void setUser_sort(Integer user_sort) {
		this.user_sort = user_sort;
	}

	public Integer getContent_sort() {
		return content_sort;
	}

	public void setContent_sort(Integer content_sort) {
		this.content_sort = content_sort;
	}
	
	
    

}
