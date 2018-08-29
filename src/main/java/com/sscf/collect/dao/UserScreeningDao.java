/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.UserScreeningDto;
import com.sscf.collect.entity.AdviserScreeningObj;
import com.sscf.collect.entity.CourseLiveScreeningObj;
import com.sscf.collect.entity.CourseScreeningObj;
import com.sscf.collect.entity.UserScreening;
import com.sscf.collect.entity.UserScreeningObj;

/**
 * @author songyong
 */
public interface UserScreeningDao {
    
 
    /** 
     * 获取UserScreening .
     * @param req 请求对象
     * @return 
     */
    public UserScreening getUserScreeningByUserId(UserScreeningDto dto);
    
    /** 
     * 获取AdviserScreeningObj.
     * @param req 请求对象
     * @return 
     */
    public AdviserScreeningObj getAdviserScreening(UserScreeningDto dto);
    
    
    /** 
     * 获取CourseScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public CourseScreeningObj getCourseScreening(UserScreeningDto dto);
    
    
    /** 
     * 获取CourseLiveScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public CourseLiveScreeningObj getCourseLiveScreening(UserScreeningDto dto);

    /** 
     * 查询AdviserScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<AdviserScreeningObj> qryAdviserScreening(UserScreeningDto dto);
    
    /** 
     * 查询CourseScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<CourseScreeningObj> qryCourseScreening(UserScreeningDto dto);
    
    /** 
     * 查询CourseLiveScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<CourseLiveScreeningObj> qryCourseLiveScreening(UserScreeningDto dto);
    
    /** 
     * 查询UserScreeningObj .
     * @param req 请求对象
     * @return 
     */
    public List<UserScreeningObj> qryUserScreening(UserScreeningDto dto);
    
     
    /** 
     * 查询UserScreening条数
     * @param req 请求对象
     * @return 
     */
    public int getUserScreeningCount(UserScreeningDto dto);
    
}
