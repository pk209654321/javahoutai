package com.sscf.collect.entity;

public class SingleUserGrowth {
	
	 
    /**
     * The new users yesterday.
     *
     * @Fields new_users_yesterday 昨日新增用户数
    */
    private Integer new_users_yesterday;

    /**
     * The new users today.
     *
     * @Fields new_users_today 今日新增用户数
    */
    private Integer new_users_today;

    /**
     * The total users.
     *
     * @Fields total_users 用户总数
    */
    private Integer total_users;

	public Integer getNew_users_yesterday() {
		return new_users_yesterday;
	}

	public void setNew_users_yesterday(Integer new_users_yesterday) {
		this.new_users_yesterday = new_users_yesterday;
	}

	public Integer getNew_users_today() {
		return new_users_today;
	}

	public void setNew_users_today(Integer new_users_today) {
		this.new_users_today = new_users_today;
	}

	public Integer getTotal_users() {
		return total_users;
	}

	public void setTotal_users(Integer total_users) {
		this.total_users = total_users;
	}
    
    
    

}
