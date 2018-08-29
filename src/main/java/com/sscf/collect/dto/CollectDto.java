/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dto;

import java.util.Date;

import com.sscf.education.common.entity.PageInfo;

/**
 * The Class CollectDto.
 *
 * @author lvcn
 */
public class CollectDto extends PageInfo {
    /**
     * The id .
     *
     * @Fields id id
    */
    private Long id;
    /**
     * The create time .
     *
     * @Fields create_time createTime
    */
    private Date create_time;
    /**
     * The update time .
     *
     * @Fields update_time updateTime
    */
    private Date update_time;
    /**
     * The user id .
     *
     * @Fields user_id 用户id
    */
    private Long user_id;
    /**
     * The device .
     *
     * @Fields device 设备类型 1:ios 2:android
    */
    private Long device;
    /**
     * The device id .
     *
     * @Fields device_id 设备唯一id
    */
    private String device_id;
    /**
     * The source .
     *
     * @Fields source 来源 0:app 1:微信
    */
    private Long source;
    /**
     * The version .
     *
     * @Fields version 应用版本号
    */
    private String version;
    /**
     * The category .
     *
     * @Fields category 分类
    */
    private String category;
    /**
     * The event .
     *
     * @Fields event 埋点事件
    */
    private String event;

    /** The event id. */
    private String event_id;
    /**
     * The event name .
     *
     * @Fields event_name 事件名
    */
    private String event_name;
    /**
     * The enter time .
     *
     * @Fields enter_time 页面访问时间
    */
    private Date enter_time;
    /**
     * The leave time .
     *
     * @Fields leave_time 离开时间
    */
    private Date leave_time;
    /**
     * The duration .
     *
     * @Fields duration 页面停留时长
    */
    private Long duration;
    /**
     * The page url .
     *
     * @Fields page_url 页面链接
    */
    private String page_url;
    /**
     * The page title .
     *
     * @Fields page_title 页面标题
    */
    private String page_title;
    /**
     * The course id .
     *
     * @Fields course_id 课程id
    */
    private Long course_id;

    /** The catalog id. */
    private Long catalog_id;
    /**
     * The adviser id .
     *
     * @Fields adviser_id 投顾id
    */
    private Long adviser_id;
    /**
     * The ip .
     *
     * @Fields ip ip地址
    */
    private String ip;
    /**
     * The imei .
     *
     * @Fields imei imei
    */
    private String imei;
    /**
     * The reserve .
     *
     * @Fields reserve 保留字段
    */
    private String reserve;

    /** The start time. */
    private String start_time;

    /** The end time. */
    private String end_time;

    /** The content. */
    private String content;

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
     * Sets the create time .
     *
     * @param create_time the new create time
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * Gets the create time .
     *
     * @return the create time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * Sets the update time .
     *
     * @param update_time the new update time
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * Gets the update time .
     *
     * @return the update time
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * Sets the user id .
     *
     * @param user_id the new user id
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets the user id .
     *
     * @return the user id
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * Sets the device .
     *
     * @param device the new device
     */
    public void setDevice(Long device) {
        this.device = device;
    }

    /**
     * Gets the device .
     *
     * @return the device
     */
    public Long getDevice() {
        return device;
    }

    /**
     * Sets the device id .
     *
     * @param device_id the new device id
     */
    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    /**
     * Gets the device id .
     *
     * @return the device id
     */
    public String getDevice_id() {
        return device_id == null ? null : device_id.trim();
    }

    /**
     * Sets the source .
     *
     * @param source the new source
     */
    public void setSource(Long source) {
        this.source = source;
    }

    /**
     * Gets the source .
     *
     * @return the source
     */
    public Long getSource() {
        return source;
    }

    /**
     * Sets the version .
     *
     * @param version the new version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the version .
     *
     * @return the version
     */
    public String getVersion() {
        return version == null ? null : version.trim();
    }

    /**
     * Sets the category .
     *
     * @param category the new category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets the category .
     *
     * @return the category
     */
    public String getCategory() {
        return category == null ? null : category.trim();
    }

    /**
     * Sets the event .
     *
     * @param event the new event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Gets the event .
     *
     * @return the event
     */
    public String getEvent() {
        return event == null ? null : event.trim();
    }

    /**
     * Sets the event name .
     *
     * @param event_name the new event name
     */
    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    /**
     * Gets the event name .
     *
     * @return the event name
     */
    public String getEvent_name() {
        return event_name == null ? null : event_name.trim();
    }

    /**
     * Sets the enter time .
     *
     * @param enter_time the new enter time
     */
    public void setEnter_time(Date enter_time) {
        this.enter_time = enter_time;
    }

    /**
     * Gets the enter time .
     *
     * @return the enter time
     */
    public Date getEnter_time() {
        return enter_time;
    }

    /**
     * Sets the leave time .
     *
     * @param leave_time the new leave time
     */
    public void setLeave_time(Date leave_time) {
        this.leave_time = leave_time;
    }

    /**
     * Gets the leave time .
     *
     * @return the leave time
     */
    public Date getLeave_time() {
        return leave_time;
    }

    /**
     * Sets the duration .
     *
     * @param duration the new duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Gets the duration .
     *
     * @return the duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the page url .
     *
     * @param page_url the new page url
     */
    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    /**
     * Gets the page url .
     *
     * @return the page url
     */
    public String getPage_url() {
        return page_url == null ? null : page_url.trim();
    }

    /**
     * Sets the page title .
     *
     * @param page_title the new page title
     */
    public void setPage_title(String page_title) {
        this.page_title = page_title;
    }

    /**
     * Gets the page title .
     *
     * @return the page title
     */
    public String getPage_title() {
        return page_title == null ? null : page_title.trim();
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
     * Sets the adviser id .
     *
     * @param adviser_id the new adviser id
     */
    public void setAdviser_id(Long adviser_id) {
        this.adviser_id = adviser_id;
    }

    /**
     * Gets the adviser id .
     *
     * @return the adviser id
     */
    public Long getAdviser_id() {
        return adviser_id;
    }

    /**
     * Sets the ip .
     *
     * @param ip the new ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Gets the ip .
     *
     * @return the ip
     */
    public String getIp() {
        return ip == null ? null : ip.trim();
    }

    /**
     * Sets the imei .
     *
     * @param imei the new imei
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * Gets the imei .
     *
     * @return the imei
     */
    public String getImei() {
        return imei == null ? null : imei.trim();
    }

    /**
     * Sets the reserve .
     *
     * @param reserve the new reserve
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    /**
     * Gets the reserve .
     *
     * @return the reserve
     */
    public String getReserve() {
        return reserve == null ? null : reserve.trim();
    }

    /**
     * Gets the event id.
     *
     * @return the event id
     */
    public String getEvent_id() {
        return event_id;
    }

    /**
     * Sets the event id.
     *
     * @param event_id the new event id
     */
    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    /**
     * Gets the catalog id.
     *
     * @return the catalog id
     */
    public Long getCatalog_id() {
        return catalog_id;
    }

    /**
     * Sets the catalog id.
     *
     * @param catalog_id the new catalog id
     */
    public void setCatalog_id(Long catalog_id) {
        this.catalog_id = catalog_id;
    }

    /**
     * Gets the start time.
     *
     * @return the start time
     */
    public String getStart_time() {
        return start_time;
    }

    /**
     * Sets the start time.
     *
     * @param start_time the new start time
     */
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    /**
     * Gets the end time.
     *
     * @return the end time
     */
    public String getEnd_time() {
        return end_time;
    }

    /**
     * Sets the end time.
     *
     * @param end_time the new end time
     */
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    /**
     * Gets the content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content the new content
     */
    public void setContent(String content) {
        this.content = content;
    }

}
