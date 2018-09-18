package com.sscf.collect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.dto.AiShareResultDto;
import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.Specialist;
import com.sscf.collect.entity.share.AiShareResult;
import com.sscf.collect.service.AiShareResultService;
import com.sscf.education.common.entity.PageResult;
import com.sscf.education.common.entity.Result;
import com.sscf.education.common.util.ResultUtil;

@RestController
@RequestMapping("/share")
public class AiShareResultController {
	private static final Logger logger = LoggerFactory.getLogger(AiShareResultController.class);
	
	@Autowired
	AiShareResultService aiShare;
	
	@RequestMapping(value = "/selectAiShareResult")
	@ResponseBody
	public Result selectAiShareResult(@RequestBody AiShareResultDto dto ) {
		logger.debug("接受到的参数dto:"+JSON.toJSONString(dto));
		PageResult<AiShareResult> selectPageAiShareResult = aiShare.selectPageAiShareResult(dto);
		logger.debug("查询结果:"+JSON.toJSONString(selectPageAiShareResult));
		return ResultUtil.success(selectPageAiShareResult);
	}
}
