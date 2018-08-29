/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.UserScreeningDao;
import com.sscf.collect.dto.UserScreeningDto;
import com.sscf.collect.entity.AdviserScreeningObj;
import com.sscf.collect.entity.CourseLiveScreeningObj;
import com.sscf.collect.entity.CourseScreeningObj;
import com.sscf.collect.entity.UserScreening;
import com.sscf.collect.entity.UserScreeningObj;
import com.sscf.education.common.entity.PageResult;

/**
 * @author songyong
 */
@Component
public class UserScreeningService {
	
	/** The customer dao . */    
    @Autowired
    private UserScreeningDao userScreeningDao;
    
 
    /** 
     * 获取UserScreening .
     * @param req 请求对象
     * @return 
     */
    public UserScreening getUserScreeningByUserId(UserScreeningDto dto) {
    	
    	return userScreeningDao.getUserScreeningByUserId(dto);
    }

    /** 
     * 查询AdviserScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<AdviserScreeningObj> qryAdviserScreening(UserScreeningDto dto){
    	
    	return  userScreeningDao.qryAdviserScreening(dto);
    }
    
    /** 
     * 查询CourseScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<CourseScreeningObj> qryCourseScreening(UserScreeningDto dto){
    	
    	return  userScreeningDao.qryCourseScreening(dto);
    }
    
    /** 
     * 查询CourseLiveScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<CourseLiveScreeningObj> qryCourseLiveScreening(UserScreeningDto dto){
    	
    	return  userScreeningDao.qryCourseLiveScreening(dto);
    }
    
    /** 
     * 查询UserScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<UserScreeningObj> qryUserScreening(UserScreeningDto dto){
    	
    	return userScreeningDao.qryUserScreening(dto);
    }
    
    /**
     * 分页查询 UserScreening .
     *
     * @param dto 查询对象
     * @return 响应结果
     */ 
    public PageResult<UserScreeningObj> qryPageUserScreening(UserScreeningDto dto){
        int total = userScreeningDao.getUserScreeningCount(dto);
        PageResult<UserScreeningObj> page = new PageResult<>(dto, total);
        if (page.isHasRows()) {
            List<UserScreeningObj> list = userScreeningDao.qryUserScreening(dto);
            page.setRows(list);
        }
        return page;
    }
    
     
    /** 
     * 查询UserScreening条数
     * @param req 请求对象
     * @return 
     */
    public int getUserScreeningCount(UserScreeningDto dto) {
    	
    	return userScreeningDao.getUserScreeningCount(dto);
    	
    }
    
    
    /** 
     * 获取AdviserScreeningObj.
     * @param req 请求对象
     * @return 
     */
    public AdviserScreeningObj getAdviserScreening(UserScreeningDto dto) {
    	
    	return userScreeningDao.getAdviserScreening(dto);
    }
    
    
    /** 
     * 获取CourseScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public CourseScreeningObj getCourseScreening(UserScreeningDto dto) {
    	
    	return userScreeningDao.getCourseScreening(dto);
    	
    }
    
    
    /** 
     * 获取CourseLiveScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public CourseLiveScreeningObj getCourseLiveScreening(UserScreeningDto dto) {
    	
    	return userScreeningDao.getCourseLiveScreening(dto);
    	
    }
    
}
