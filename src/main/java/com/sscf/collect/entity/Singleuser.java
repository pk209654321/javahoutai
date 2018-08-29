/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.entity;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @author lvcn
 */
public class Singleuser {
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
    private Long    id;
    /**
     * The single user id .
     *
     * @Fields single_user_id 用户ID
    */
    @JsonView(Api.class)
    private Long    single_user_id;
    /**
     * The single user name .
     *
     * @Fields single_user_name 用户名称
    */
    @JsonView(Api.class)
    private String  single_user_name;
    /**
     * The single user phone .
     *
     * @Fields single_user_phone 手机号
    */
    @JsonView(Api.class)
    private String  single_user_phone;
    /**
     * The single desire .
     *
     * @Fields single_desire 机型
    */
    @JsonView(Api.class)
    private String  single_desire;
    /**
     * The single region .
     *
     * @Fields single_region 地区
    */
    @JsonView(Api.class)
    private String  single_region;
    /**
     * The single employ time .
     *
     * @Fields single_employ_time 使用时长（分钟）
    */
    @JsonView(Api.class)
    private Long    single_employ_time;
    /**
     * The single click .
     *
     * @Fields single_click 点击数
    */
    @JsonView(Api.class)
    private Long    single_click;
    /**
     * The single reflux day .
     *
     * @Fields single_reflux_day 回流天数
    */
    @JsonView(Api.class)
    private Long    single_reflux_day;
    /**
     * The single record date .
     *
     * @Fields single_record_date 注册日期
    */
    @JsonView(Api.class)
    private String  single_record_date;
    /**
     * The single buy .
     *
     * @Fields single_buy 是否购买
    */
    @JsonView(Api.class)
    private String  single_buy;
    /**
     * The quantum reflux day .
     *
     * @Fields quantum_reflux_day 日均使用时长
    */
    @JsonView(Api.class)
    private Long    quantum_reflux_day;
    /**
     * The quantum buy .
     *
     * @Fields quantum_buy 日均点击数
    */
    @JsonView(Api.class)
    private Long    quantum_buy;
    /**
     * The average day .
     *
     * @Fields average_day 点击天数
    */
    @JsonView(Api.class)
    private Long    average_day;
    /**
     * The insert time .
     *
     * @Fields insert_time 数据创建时间
    */
    @JsonView(Api.class)
    private String  insert_time;

    /**
     * The last time .
     *
     * @Fields last_time 最后登录时间
    */
    @JsonView(Api.class)
    private String  last_time;

    /**
     * The title .
     *
     * @Fields title 课程标题
    */
    @JsonView(Api.class)
    private String  title;

    /**
     * The name .
     *
     * @Fields name 老师姓名
    */
    @JsonView(Api.class)
    private String  name;

    private Integer ad_id;

    private Long    page_type;

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
     * Sets the single user id .
     *
     * @param single_user_id the new single user id
     */
    public void setSingle_user_id(Long single_user_id) {
        this.single_user_id = single_user_id;
    }

    /**
     * Gets the single user id .
     *
     * @return the single user id
     */
    public Long getSingle_user_id() {
        return single_user_id;
    }

    /**
     * Sets the single user name .
     *
     * @param single_user_name the new single user name
     */
    public void setSingle_user_name(String single_user_name) {
        this.single_user_name = single_user_name;
    }

    /**
     * Gets the single user name .
     *
     * @return the single user name
     */
    public String getSingle_user_name() {
        return single_user_name == null ? null : single_user_name.trim();
    }

    /**
     * Sets the single user phone .
     *
     * @param single_user_phone the new single user phone
     */
    public void setSingle_user_phone(String single_user_phone) {
        this.single_user_phone = single_user_phone;
    }

    /**
     * Gets the single user phone .
     *
     * @return the single user phone
     */
    public String getSingle_user_phone() {
        return single_user_phone == null ? null : single_user_phone.trim();
    }

    /**
     * Sets the single desire .
     *
     * @param single_desire the new single desire
     */
    public void setSingle_desire(String single_desire) {
        this.single_desire = single_desire;
    }

    /**
     * Gets the single desire .
     *
     * @return the single desire
     */
    public String getSingle_desire() {
        return single_desire == null ? null : single_desire.trim();
    }

    /**
     * Sets the single region .
     *
     * @param single_region the new single region
     */
    public void setSingle_region(String single_region) {
        this.single_region = single_region;
    }

    /**
     * Gets the single region .
     *
     * @return the single region
     */
    public String getSingle_region() {
        return single_region == null ? null : single_region.trim();
    }

    /**
     * Sets the single employ time .
     *
     * @param single_employ_time the new single employ time
     */
    public void setSingle_employ_time(Long single_employ_time) {
        this.single_employ_time = single_employ_time;
    }

    /**
     * Gets the single employ time .
     *
     * @return the single employ time
     */
    public Long getSingle_employ_time() {
        return single_employ_time;
    }

    /**
     * Sets the single click .
     *
     * @param single_click the new single click
     */
    public void setSingle_click(Long single_click) {
        this.single_click = single_click;
    }

    /**
     * Gets the single click .
     *
     * @return the single click
     */
    public Long getSingle_click() {
        return single_click;
    }

    /**
     * Sets the single reflux day .
     *
     * @param single_reflux_day the new single reflux day
     */
    public void setSingle_reflux_day(Long single_reflux_day) {
        this.single_reflux_day = single_reflux_day;
    }

    /**
     * Gets the single reflux day .
     *
     * @return the single reflux day
     */
    public Long getSingle_reflux_day() {
        return single_reflux_day;
    }

    /**
     * Sets the single record date .
     *
     * @param single_record_date the new single record date
     */
    public void setSingle_record_date(String single_record_date) {
        this.single_record_date = single_record_date;
    }

    /**
     * Gets the single record date .
     *
     * @return the single record date
     */
    public String getSingle_record_date() {
        return single_record_date == null ? null : single_record_date.trim();
    }

    /**
     * Sets the single buy .
     *
     * @param single_buy the new single buy
     */
    public void setSingle_buy(String single_buy) {
        this.single_buy = single_buy;
    }

    /**
     * Gets the single buy .
     *
     * @return the single buy
     */
    public String getSingle_buy() {
        return single_buy == null ? null : single_buy.trim();
    }

    /**
     * Sets the quantum reflux day .
     *
     * @param quantum_reflux_day the new quantum reflux day
     */
    public void setQuantum_reflux_day(Long quantum_reflux_day) {
        this.quantum_reflux_day = quantum_reflux_day;
    }

    /**
     * Gets the quantum reflux day .
     *
     * @return the quantum reflux day
     */
    public Long getQuantum_reflux_day() {
        return quantum_reflux_day;
    }

    /**
     * Sets the quantum buy .
     *
     * @param quantum_buy the new quantum buy
     */
    public void setQuantum_buy(Long quantum_buy) {
        this.quantum_buy = quantum_buy;
    }

    /**
     * Gets the quantum buy .
     *
     * @return the quantum buy
     */
    public Long getQuantum_buy() {
        return quantum_buy;
    }

    /**
     * Sets the average day .
     *
     * @param average_day the new average day
     */
    public void setAverage_day(Long average_day) {
        this.average_day = average_day;
    }

    /**
     * Gets the average day .
     *
     * @return the average day
     */
    public Long getAverage_day() {
        return average_day;
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

    public String getLast_time() {
        return last_time == null ? null : last_time.trim();
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    public String getTitle() {
        return title == null ? null : title.trim();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name == null ? null : name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAd_id() {
        return ad_id;
    }

    public void setAd_id(Integer ad_id) {
        this.ad_id = ad_id;
    }

    public Long getPage_type() {
        return page_type;
    }

    public void setPage_type(Long page_type) {
        this.page_type = page_type;
    }

}