/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.controller;

import java.util.Date;

import javax.validation.Valid;

import org.apache.commons.codec.binary.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.config.RedisUtils;
import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.Collect;
import com.sscf.collect.entity.User;
import com.sscf.collect.entity.login.LoginResult;
import com.sscf.collect.service.LoginResultService;
import com.sscf.education.common.constants.DictConstants;
import com.sscf.education.common.constants.RedisConstants;
import com.sscf.education.common.entity.PageResult;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

/**
 * @author lvcn
 */
@RestController
@RequestMapping(value = "/loginResult")
public class LoginResultController extends BaseController {
	/**
	 * logger.
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(LoginResultController.class);

	/*@Autowired
	private RedisUtils redisUtils;*/
	@Autowired
	LoginResultService loginResult;
	/**
	 * 新增 Collect .
	 *
	 * @param collect 新增对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/select")
	@ResponseBody
	public Result getLoginResult(@RequestBody LoginResultDto dto) {
		PageResult<LoginResult> pageResult = loginResult.selectPageLoginResult(dto);
		return ResultUtil.success(pageResult);
	}


  
	
	public static void main(String[] args) {
		/* User user = new User();
		 user.setAge("20");
		 user.setId("10");
		 user.setName("wangyadong");
		 String jsonString = JSON.toJSONString(user);
		 System.out.println(jsonString);*/
		LoginResultDto lrd=new LoginResultDto();
		lrd.setEnd_time("2018-09-03 14:54:53");
		lrd.setStart_time("2018-09-03 14:54:52");
		lrd.setMobile("18082255559");
		lrd.setUser_id(2);
		String jsonString = JSON.toJSONString(lrd);
		System.out.println(jsonString);
	}


}
