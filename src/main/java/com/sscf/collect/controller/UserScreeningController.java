/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.dto.UserScreeningDto;
import com.sscf.collect.entity.AdviserScreeningObj;
import com.sscf.collect.entity.CourseLiveScreeningObj;
import com.sscf.collect.entity.CourseScreeningObj;
import com.sscf.collect.entity.ScreeningObj;
import com.sscf.collect.entity.UserScreening;
import com.sscf.collect.entity.UserScreeningObj;
import com.sscf.collect.service.UserScreeningService;
import com.sscf.education.common.entity.PageResult;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;

/**
 * @author songyong
 */
@RestController
@RequestMapping(value = "/admin-api")
public class UserScreeningController extends BaseController {
	/**
	 * logger.
	 */
	private static final Logger logger = LoggerFactory.getLogger(UserScreeningController.class);

	/** The user screening service . */
	@Autowired
	private UserScreeningService userScreeningService;

	/**
	 * 查询UserScreening .
	 *
	 * @param dto 查询对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/qryUserScreening")
	@ResponseBody
	public Result qryUserScreening(@RequestBody(required = false) UserScreeningDto dto) {
		Result result = null;
		List<ScreeningObj> screeningList = new ArrayList<ScreeningObj>();
		// 如果没分配角色, 直接返回空
		// if (StringUtils.isNotBlank(role)) {
		List<ScreeningObj> list1 = new ArrayList<ScreeningObj>();
		// dto.setMngr_user_id(userId);
		// dto.setMngr_role(role);
		logger.debug("qryUserScreening参数:" + JSON.toJSONString(dto));
		PageResult<UserScreeningObj> page = userScreeningService.qryPageUserScreening(dto);
		PageResult<ScreeningObj> page1 = new PageResult<>(dto, page.getTotal());
		List<UserScreeningObj> list = page.getRows();
		for (UserScreeningObj userScreeningObj : list) {
			ScreeningObj screeningObj = new ScreeningObj();
			UserScreening userScreening = new UserScreening();
			userScreening.setUserScreningObj(userScreeningObj);
			dto.setUser_id(userScreeningObj.getUser_id());
			AdviserScreeningObj adviserScreeningObj = userScreeningService.getAdviserScreening(dto);
			userScreening.setAdviserScreeningObj(adviserScreeningObj);
			CourseScreeningObj courseScreeningObj = userScreeningService.getCourseScreening(dto);
			userScreening.setCourseScreeningObj(courseScreeningObj);
			CourseLiveScreeningObj courseLiveScreeningObj = userScreeningService.getCourseLiveScreening(dto);
			userScreening.setCourseLiveScreeningObj(courseLiveScreeningObj);
			screeningObj.setScreening(userScreening);
			list1.add(screeningObj);
		}
		screeningList.addAll(list1);
		page1.setRows(screeningList);
		result = ResultUtil.success(page1);
		// }else {
		// result = ResultUtil.success();
		// }
		return result;
	}

	/**
	 * 查询AdviserScreening .
	 *
	 * @param dto 查询对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/qryAdviserScreening")
	@ResponseBody
	public Result qryAdviserScreening(@RequestBody(required = false) UserScreeningDto dto) {
		List<AdviserScreeningObj> list = userScreeningService.qryAdviserScreening(dto);
		return ResultUtil.success(list);

	}

	/**
	 * 查询CourseScreening .
	 *
	 * @param dto 查询对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/qryCourseScreening")
	@ResponseBody
	public Result qryCourseScreening(@RequestBody(required = false) UserScreeningDto dto) {
		List<CourseScreeningObj> list = userScreeningService.qryCourseScreening(dto);
		return ResultUtil.success(list);
	}

	/**
	 * 查询CourseScreening .
	 *
	 * @param dto 查询对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/qryCourseLiveScreening")
	@ResponseBody
	public Result qryCourseLiveScreening(@RequestBody(required = false) UserScreeningDto dto) {
		List<CourseLiveScreeningObj> list = userScreeningService.qryCourseLiveScreening(dto);
		return ResultUtil.success(list);
	}

}
