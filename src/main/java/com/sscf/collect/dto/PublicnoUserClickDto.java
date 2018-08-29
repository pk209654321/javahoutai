package com.sscf.collect.dto;

import com.alibaba.fastjson.JSON;
import com.sscf.education.common.entity.PageInfo;

public class PublicnoUserClickDto extends PageInfo{
	/*id	bigint
	open_id	varchar
	live_count	int
	live_time	int
	say_stock_count	int
	say_stock_time	int
	agency_title_count	int
	agency_title_time	int
	reo_limit_count	int
	reo_limit_time	int
	focus_time	datetime
	off_time	datetime*/
	
	private Long id;
	private String open_id;
	private String weixin_name;
  	private String tencent_source;
  	private String majordomo;
  	private String manager;
  	private String salesman;
  	private String attention_time;
  	private String takeoff_time;
	private Integer live_count_Y;
	private Integer live_time_Y;
	private Integer say_stock_count_Y;
	private Integer say_stock_time_Y;
	private Integer agency_title_count_Y;
	private Integer agency_title_time_Y;
	private Integer reo_limit_count_Y;
	private Integer reo_limit_time_Y;
	private String focus_time;
	private String off_time;
	private Integer live_count_Z;
	private Integer live_time_Z;
	private Integer say_stock_count_Z;
	private Integer say_stock_time_Z;
	private Integer agency_title_count_Z;
	private Integer agency_title_time_Z;
	private Integer reo_limit_count_Z;
	private Integer reo_limit_time_Z;
	private String start_time;
	private String end_time;
	private String order_by;//根据关键字段排序
	private String sort_type;//desc/
	
	//orderby
	
	
	public String getOrder_by() {
		return order_by;
	}
	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}
	public String getSort_type() {
		return sort_type;
	}
	public void setSort_type(String sort_type) {
		this.sort_type = sort_type;
	}
	public String getWeixin_name() {
		return weixin_name;
	}
	public void setWeixin_name(String weixin_name) {
		this.weixin_name = weixin_name;
	}
	public String getTencent_source() {
		return tencent_source;
	}
	public void setTencent_source(String tencent_source) {
		this.tencent_source = tencent_source;
	}
	public String getMajordomo() {
		return majordomo;
	}
	public void setMajordomo(String majordomo) {
		this.majordomo = majordomo;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public String getAttention_time() {
		return attention_time;
	}
	public void setAttention_time(String attention_time) {
		this.attention_time = attention_time;
	}
	public String getTakeoff_time() {
		return takeoff_time;
	}
	public void setTakeoff_time(String takeoff_time) {
		this.takeoff_time = takeoff_time;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOpen_id() {
		return open_id;
	}
	public void setOpen_id(String open_id) {
		this.open_id = open_id;
	}
	public Integer getLive_count_Y() {
		return live_count_Y;
	}
	public void setLive_count_Y(Integer live_count_Y) {
		this.live_count_Y = live_count_Y;
	}
	public Integer getLive_time_Y() {
		return live_time_Y;
	}
	public void setLive_time_Y(Integer live_time_Y) {
		this.live_time_Y = live_time_Y;
	}
	public Integer getSay_stock_count_Y() {
		return say_stock_count_Y;
	}
	public void setSay_stock_count_Y(Integer say_stock_count_Y) {
		this.say_stock_count_Y = say_stock_count_Y;
	}
	public Integer getSay_stock_time_Y() {
		return say_stock_time_Y;
	}
	public void setSay_stock_time_Y(Integer say_stock_time_Y) {
		this.say_stock_time_Y = say_stock_time_Y;
	}
	public Integer getAgency_title_count_Y() {
		return agency_title_count_Y;
	}
	public void setAgency_title_count_Y(Integer agency_title_count_Y) {
		this.agency_title_count_Y = agency_title_count_Y;
	}
	public Integer getAgency_title_time_Y() {
		return agency_title_time_Y;
	}
	public void setAgency_title_time_Y(Integer agency_title_time_Y) {
		this.agency_title_time_Y = agency_title_time_Y;
	}
	public Integer getReo_limit_count_Y() {
		return reo_limit_count_Y;
	}
	public void setReo_limit_count_Y(Integer reo_limit_count_Y) {
		this.reo_limit_count_Y = reo_limit_count_Y;
	}
	public Integer getReo_limit_time_Y() {
		return reo_limit_time_Y;
	}
	public void setReo_limit_time_Y(Integer reo_limit_time_Y) {
		this.reo_limit_time_Y = reo_limit_time_Y;
	}
	public String getFocus_time() {
		return focus_time;
	}
	public void setFocus_time(String focus_time) {
		this.focus_time = focus_time;
	}
	public String getOff_time() {
		return off_time;
	}
	public void setOff_time(String off_time) {
		this.off_time = off_time;
	}
	public Integer getLive_count_Z() {
		return live_count_Z;
	}
	public void setLive_count_Z(Integer live_count_Z) {
		this.live_count_Z = live_count_Z;
	}
	public Integer getLive_time_Z() {
		return live_time_Z;
	}
	public void setLive_time_Z(Integer live_time_Z) {
		this.live_time_Z = live_time_Z;
	}
	public Integer getSay_stock_count_Z() {
		return say_stock_count_Z;
	}
	public void setSay_stock_count_Z(Integer say_stock_count_Z) {
		this.say_stock_count_Z = say_stock_count_Z;
	}
	public Integer getSay_stock_time_Z() {
		return say_stock_time_Z;
	}
	public void setSay_stock_time_Z(Integer say_stock_time_Z) {
		this.say_stock_time_Z = say_stock_time_Z;
	}
	public Integer getAgency_title_count_Z() {
		return agency_title_count_Z;
	}
	public void setAgency_title_count_Z(Integer agency_title_count_Z) {
		this.agency_title_count_Z = agency_title_count_Z;
	}
	public Integer getAgency_title_time_Z() {
		return agency_title_time_Z;
	}
	public void setAgency_title_time_Z(Integer agency_title_time_Z) {
		this.agency_title_time_Z = agency_title_time_Z;
	}
	public Integer getReo_limit_count_Z() {
		return reo_limit_count_Z;
	}
	public void setReo_limit_count_Z(Integer reo_limit_count_Z) {
		this.reo_limit_count_Z = reo_limit_count_Z;
	}
	public Integer getReo_limit_time_Z() {
		return reo_limit_time_Z;
	}
	public void setReo_limit_time_Z(Integer reo_limit_time_Z) {
		this.reo_limit_time_Z = reo_limit_time_Z;
	}
	
	
	public static void main(String[] args) {
		PublicnoUserClickDto a=new PublicnoUserClickDto();
		a.setWeixin_name("2");
		a.setOrder_by("attention_time");
		a.setSort_type("ASC");
		String jsonString = JSON.toJSONString(a);
		System.out.println(jsonString);
	}
	
	

}
