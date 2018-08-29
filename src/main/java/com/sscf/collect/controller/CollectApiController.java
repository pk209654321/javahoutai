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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.config.RedisUtils;
import com.sscf.collect.entity.Collect;
import com.sscf.collect.entity.User;
import com.sscf.education.common.constants.DictConstants;
import com.sscf.education.common.constants.RedisConstants;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

/**
 * @author lvcn
 */
@RestController
@RequestMapping(value = "/api")
public class CollectApiController extends BaseController {
	/**
	 * logger.
	 */
	
	private static final Logger logger = LoggerFactory.getLogger(CollectApiController.class);

	@Autowired
	private RedisUtils redisUtils;

	/**
	 * 新增 Collect .
	 *
	 * @param collect 新增对象
	 * @return 响应结果
	 */
	@RequestMapping(value = "/auth/collect")
	public Result collect(@RequestBody @Valid Collect collect) {
//		ThreadUtil.excAsync(() -> {
		redisCollect(collect);
//		}, false);
		return ResultUtil.success();
	}

	/**
	 * 存储埋点数据到redis中.
	 * 
	 * @param collect
	 */
	private void redisCollect(Collect collect) {
		try {
			String eventId = collect.getEvent_id();
			String type = collect.getType();

			Long device = collect.getDevice();
			String enterKey = RedisConstants.HASH_COLLECT_ENTER;
			String leaveKey = RedisConstants.SET_COLLECT_LEAVE;

			if (StringUtils.equals(type, DictConstants.COLLECT_TYPE_ENTER)) {
				// 如果是进入页面事件, 将数据先放redis缓存
				collect.setEnter_time(DateUtil.date());
				redisUtils.hSet(enterKey, eventId, JSON.toJSONString(collect));
				logger.info("redis记录进入事件:{}", eventId);
			} else if (StringUtils.equals(type, DictConstants.COLLECT_TYPE_LEAVE)) {
				if (eventId != null) {
					Collect entity = redisUtils.hGet(enterKey, eventId, Collect.class);
					if (entity != null) {
						Date enterTime = entity.getEnter_time();
						Date leaveTime = DateUtil.date();
						// 停留时长
						long duration = DateUtil.between(enterTime, leaveTime, DateUnit.SECOND);
						entity.setLeave_time(DateUtil.date());
						entity.setDuration(duration);
						redisUtils.sAdd(leaveKey, JSON.toJSONString(entity));
						redisUtils.hDel(enterKey, eventId);
						logger.info("redis记录离开事件:{}", eventId);
					} else {
						logger.info("未查询到匹配的进入事件, 忽略该离开事件:{}", eventId);
					}
				} else {
					logger.info("埋点eventId为null, 跳过处理.");
				}
			} else {
				// 其他埋点类型, 直接记录.
				collect.setEnter_time(new Date());
				redisUtils.sAdd(leaveKey, JSON.toJSONString(collect));
			}
		} catch (Exception e) {
			logger.error("埋点失败, 只打印异常信息, 不影响前端流程.", e);
		}
	}
	
    @RequestMapping(value="/wang")
    public void index(@RequestBody User user) {
    	System.out.println("json------------"+user);
    }
	
    @RequestMapping(value = "/test") 
    String hello(){ 
        return "hello"; 
    } 
	
	public static void main(String[] args) {
		 RestTemplate restTemplate = new RestTemplate();
		 User user = new User();
		 user.setAge("20");
		 user.setId("10");
		 user.setName("wangyadong");
		 String jsonString = JSON.toJSONString(user);
		 System.out.println(jsonString);
		 String json=jsonString;
		 String url="http://127.0.0.1:9090/collect-service/hello";
		 //restTemplate.postForObject(url,json,String.class);
	}


}
