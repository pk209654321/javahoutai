/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.entity;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @author lvcn
 */
public class Specialist {
    public interface Api {
    }

    public interface Normal extends Api {
    }

    /**
     * The id .
     *
     * @Fields id id
    */
    @JsonView(Api.class)
    private Long   id;
    /**
     * The expert name .
     *
     * @Fields expert_name 专家名称
    */
    @JsonView(Api.class)
    private String expert_name;
    /**
     * The expert type .
     *
     * @Fields expert_type 专家类别
    */
    @JsonView(Api.class)
    private String expert_type;
    /**
     * The expert number .
     *
     * @Fields expert_number 购买数量
    */
    @JsonView(Api.class)
    private Long   expert_number;
    /**
     * The expert click .
     *
     * @Fields expert_click 点击数
    */
    @JsonView(Api.class)
    private Long   expert_click;
    /**
     * The expert daily click .
     *
     * @Fields expert_daily_click expertDailyClick
    */
    @JsonView(Api.class)
    private String expert_daily_click;
    /**
     * The expert new user .
     *
     * @Fields expert_new_user 新增用户数
    */
    @JsonView(Api.class)
    private Long   expert_new_user;
    /**
     * The expert user .
     *
     * @Fields expert_user 用户数
    */
    @JsonView(Api.class)
    private Long   expert_user;
    /**
     * The expert aggregate user .
     *
     * @Fields expert_aggregate_user 累计用户
    */
    @JsonView(Api.class)
    private Long   expert_aggregate_user;
    /**
     * The ad id .
     *
     * @Fields ad_id 投资顾问id
    */
    @JsonView(Api.class)
    private Long   ad_id;
    /**
     * The insert time .
     *
     * @Fields insert_time 数据时间
    */
    @JsonView(Api.class)
    private String insert_time;

    private Long   page_type;

    /**
     * Sets the id .
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the id .
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the expert name .
     *
     * @param expert_name the new expert name
     */
    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    /**
     * Gets the expert name .
     *
     * @return the expert name
     */
    public String getExpert_name() {
        return expert_name == null ? null : expert_name.trim();
    }

    /**
     * Sets the expert type .
     *
     * @param expert_type the new expert type
     */
    public void setExpert_type(String expert_type) {
        this.expert_type = expert_type;
    }

    /**
     * Gets the expert type .
     *
     * @return the expert type
     */
    public String getExpert_type() {
        return expert_type == null ? null : expert_type.trim();
    }

    /**
     * Sets the expert number .
     *
     * @param expert_number the new expert number
     */
    public void setExpert_number(Long expert_number) {
        this.expert_number = expert_number;
    }

    /**
     * Gets the expert number .
     *
     * @return the expert number
     */
    public Long getExpert_number() {
        return expert_number;
    }

    /**
     * Sets the expert click .
     *
     * @param expert_click the new expert click
     */
    public void setExpert_click(Long expert_click) {
        this.expert_click = expert_click;
    }

    /**
     * Gets the expert click .
     *
     * @return the expert click
     */
    public Long getExpert_click() {
        return expert_click;
    }

    public String getExpert_daily_click() {
        return expert_daily_click;
    }

    public void setExpert_daily_click(String expert_daily_click) {
        this.expert_daily_click = expert_daily_click;
    }

    /**
     * Sets the expert new user .
     *
     * @param expert_new_user the new expert new user
     */
    public void setExpert_new_user(Long expert_new_user) {
        this.expert_new_user = expert_new_user;
    }

    /**
     * Gets the expert new user .
     *
     * @return the expert new user
     */
    public Long getExpert_new_user() {
        return expert_new_user;
    }

    /**
     * Sets the expert user .
     *
     * @param expert_user the new expert user
     */
    public void setExpert_user(Long expert_user) {
        this.expert_user = expert_user;
    }

    /**
     * Gets the expert user .
     *
     * @return the expert user
     */
    public Long getExpert_user() {
        return expert_user;
    }

    /**
     * Sets the expert aggregate user .
     *
     * @param expert_aggregate_user the new expert aggregate user
     */
    public void setExpert_aggregate_user(Long expert_aggregate_user) {
        this.expert_aggregate_user = expert_aggregate_user;
    }

    /**
     * Gets the expert aggregate user .
     *
     * @return the expert aggregate user
     */
    public Long getExpert_aggregate_user() {
        return expert_aggregate_user;
    }

    /**
     * Sets the ad id .
     *
     * @param ad_id the new ad id
     */
    public void setAd_id(Long ad_id) {
        this.ad_id = ad_id;
    }

    /**
     * Gets the ad id .
     *
     * @return the ad id
     */
    public Long getAd_id() {
        return ad_id;
    }

    /**
     * Sets the insert time .
     *
     * @param insert_time the new insert time
     */
    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    /**
     * Gets the insert time .
     *
     * @return the insert time
     */
    public String getInsert_time() {
        return insert_time == null ? null : insert_time.trim();
    }

    public Long getPage_type() {
        return page_type;
    }

    public void setPage_type(Long page_type) {
        this.page_type = page_type;
    }

}