/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.sscf.education.common.entity.PageInfo;

/**
 * @author lvcn
 */
public class VideoplayDto extends PageInfo {
    /**
     * The id .
     *
     * @Fields id id
    */
    private Long   id;
    /**
     * The course name .
     *
     * @Fields course_name 课程名称
    */
    private String course_name;
    /**
     * The teacher name .
     *
     * @Fields teacher_name 老师姓名
    */
    private String teacher_name;
    /**
     * The course type .
     *
     * @Fields course_type 课程类别
    */
    private String course_type;
    /**
     * The course grade .
     *
     * @Fields course_grade 课程等级
    */
    private String course_grade;
    /**
     * The play day .
     *
     * @Fields play_day 上线天数
    */
    private Long   play_day;
    /**
     * The course prise .
     *
     * @Fields course_prise 价格
    */
    private Double course_prise;
    /**
     * The purchase number .
     *
     * @Fields purchase_number 购买数量
    */
    private Long   purchase_number;
    /**
     * The course click .
     *
     * @Fields course_click 点击数
    */
    private Long   course_click;
    /**
     * The capita min .
     *
     * @Fields capita_min 人均时长（分钟）
    */
    private String capita_min;
    /**
     * The course daily click .
     *
     * @Fields course_daily_click 日均点击
    */
    private Long   course_daily_click;
    /**
     * The course new user .
     *
     * @Fields course_new_user 新增用户
    */
    private String course_new_user;
    /**
     * The course user .
     *
     * @Fields course_user 用户
    */
    private String course_user;
    /**
     * The course aggregate user .
     *
     * @Fields course_aggregate_user 累计用户
    */
    private Long   course_aggregate_user;
    /**
     * The broadcast name .
     *
     * @Fields broadcast_name 直播名称
    */
    private String broadcast_name;
    /**
     * The broadcast type .
     *
     * @Fields broadcast_type 直播类别
    */
    private String broadcast_type;
    /**
     * The broadcast grade .
     *
     * @Fields broadcast_grade 直播等级
    */
    private String broadcast_grade;
    /**
     * The page type .
     *
     * @Fields page_type 0:app,1:微信
    */
    private Long   page_type;
    /**
     * The insert time .
     *
     * @Fields insert_time 数据创建时间
    */
    private String insert_time;
    /**
     * The course id .
     *
     * @Fields course_id 课程id
    */
    private Long   course_id;
    /**
     * The live id .
     *
     * @Fields live_id 直播id
    */
    private Long   live_id;

    private int    days;

    @NotNull
    private Date   start_time;

    @NotNull
    private Date   end_time;

    private String sort_field;

    private String sort_type;

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
     * Sets the course name .
     *
     * @param course_name the new course name
     */
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    /**
     * Gets the course name .
     *
     * @return the course name
     */
    public String getCourse_name() {
        return course_name == null ? null : course_name.trim();
    }

    /**
     * Sets the teacher name .
     *
     * @param teacher_name the new teacher name
     */
    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    /**
     * Gets the teacher name .
     *
     * @return the teacher name
     */
    public String getTeacher_name() {
        return teacher_name == null ? null : teacher_name.trim();
    }

    /**
     * Sets the course type .
     *
     * @param course_type the new course type
     */
    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    /**
     * Gets the course type .
     *
     * @return the course type
     */
    public String getCourse_type() {
        return course_type == null ? null : course_type.trim();
    }

    /**
     * Sets the course grade .
     *
     * @param course_grade the new course grade
     */
    public void setCourse_grade(String course_grade) {
        this.course_grade = course_grade;
    }

    /**
     * Gets the course grade .
     *
     * @return the course grade
     */
    public String getCourse_grade() {
        return course_grade == null ? null : course_grade.trim();
    }

    /**
     * Sets the play day .
     *
     * @param play_day the new play day
     */
    public void setPlay_day(Long play_day) {
        this.play_day = play_day;
    }

    /**
     * Gets the play day .
     *
     * @return the play day
     */
    public Long getPlay_day() {
        return play_day;
    }

    /**
     * Sets the course prise .
     *
     * @param course_prise the new course prise
     */
    public void setCourse_prise(Double course_prise) {
        this.course_prise = course_prise;
    }

    /**
     * Gets the course prise .
     *
     * @return the course prise
     */
    public Double getCourse_prise() {
        return course_prise;
    }

    /**
     * Sets the purchase number .
     *
     * @param purchase_number the new purchase number
     */
    public void setPurchase_number(Long purchase_number) {
        this.purchase_number = purchase_number;
    }

    /**
     * Gets the purchase number .
     *
     * @return the purchase number
     */
    public Long getPurchase_number() {
        return purchase_number;
    }

    /**
     * Sets the course click .
     *
     * @param course_click the new course click
     */
    public void setCourse_click(Long course_click) {
        this.course_click = course_click;
    }

    /**
     * Gets the course click .
     *
     * @return the course click
     */
    public Long getCourse_click() {
        return course_click;
    }

    /**
     * Sets the capita min .
     *
     * @param capita_min the new capita min
     */
    public void setCapita_min(String capita_min) {
        this.capita_min = capita_min;
    }

    /**
     * Gets the capita min .
     *
     * @return the capita min
     */
    public String getCapita_min() {
        return capita_min == null ? null : capita_min.trim();
    }

    /**
     * Sets the course daily click .
     *
     * @param course_daily_click the new course daily click
     */
    public void setCourse_daily_click(Long course_daily_click) {
        this.course_daily_click = course_daily_click;
    }

    /**
     * Gets the course daily click .
     *
     * @return the course daily click
     */
    public Long getCourse_daily_click() {
        return course_daily_click;
    }

    /**
     * Sets the course new user .
     *
     * @param course_new_user the new course new user
     */
    public void setCourse_new_user(String course_new_user) {
        this.course_new_user = course_new_user;
    }

    /**
     * Gets the course new user .
     *
     * @return the course new user
     */
    public String getCourse_new_user() {
        return course_new_user == null ? null : course_new_user.trim();
    }

    /**
     * Sets the course user .
     *
     * @param course_user the new course user
     */
    public void setCourse_user(String course_user) {
        this.course_user = course_user;
    }

    /**
     * Gets the course user .
     *
     * @return the course user
     */
    public String getCourse_user() {
        return course_user == null ? null : course_user.trim();
    }

    /**
     * Sets the course aggregate user .
     *
     * @param course_aggregate_user the new course aggregate user
     */
    public void setCourse_aggregate_user(Long course_aggregate_user) {
        this.course_aggregate_user = course_aggregate_user;
    }

    /**
     * Gets the course aggregate user .
     *
     * @return the course aggregate user
     */
    public Long getCourse_aggregate_user() {
        return course_aggregate_user;
    }

    /**
     * Sets the broadcast name .
     *
     * @param broadcast_name the new broadcast name
     */
    public void setBroadcast_name(String broadcast_name) {
        this.broadcast_name = broadcast_name;
    }

    /**
     * Gets the broadcast name .
     *
     * @return the broadcast name
     */
    public String getBroadcast_name() {
        return broadcast_name == null ? null : broadcast_name.trim();
    }

    /**
     * Sets the broadcast type .
     *
     * @param broadcast_type the new broadcast type
     */
    public void setBroadcast_type(String broadcast_type) {
        this.broadcast_type = broadcast_type;
    }

    /**
     * Gets the broadcast type .
     *
     * @return the broadcast type
     */
    public String getBroadcast_type() {
        return broadcast_type == null ? null : broadcast_type.trim();
    }

    /**
     * Sets the broadcast grade .
     *
     * @param broadcast_grade the new broadcast grade
     */
    public void setBroadcast_grade(String broadcast_grade) {
        this.broadcast_grade = broadcast_grade;
    }

    /**
     * Gets the broadcast grade .
     *
     * @return the broadcast grade
     */
    public String getBroadcast_grade() {
        return broadcast_grade == null ? null : broadcast_grade.trim();
    }

    /**
     * Sets the page type .
     *
     * @param page_type the new page type
     */
    public void setPage_type(Long page_type) {
        this.page_type = page_type;
    }

    /**
     * Gets the page type .
     *
     * @return the page type
     */
    public Long getPage_type() {
        return page_type;
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

    /**
     * Sets the course id .
     *
     * @param course_id the new course id
     */
    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    /**
     * Gets the course id .
     *
     * @return the course id
     */
    public Long getCourse_id() {
        return course_id;
    }

    /**
     * Sets the live id .
     *
     * @param live_id the new live id
     */
    public void setLive_id(Long live_id) {
        this.live_id = live_id;
    }

    /**
     * Gets the live id .
     *
     * @return the live id
     */
    public Long getLive_id() {
        return live_id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getSort_field() {
        return sort_field;
    }

    public void setSort_field(String sort_field) {
        this.sort_field = sort_field;
    }

    public String getSort_type() {
        return sort_type;
    }

    public void setSort_type(String sort_type) {
        this.sort_type = sort_type;
    }

}