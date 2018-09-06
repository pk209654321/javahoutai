package com.sscf.collect.receiver;

import java.nio.charset.Charset;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sscf.collect.constant.MqConstant;
import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.login.LoginResult;
import com.sscf.collect.service.LoginResultService;
import com.sscf.education.common.entity.PageResult;

@Component
public class LoginReceive {
	private static final Logger logger = LoggerFactory.getLogger(LoginReceive.class);
	@Autowired
	LoginResultService loginResultService;
	@Autowired
	AmqpTemplate amqpTemplate;

	@RabbitListener(queues = MqConstant.USER_TRACK_QUEUES) // 监听器监听指定的Queue
	public void processC(byte[] data, @Header(AmqpHeaders.REPLY_TO) String replyTo, @Header(AmqpHeaders.CORRELATION_ID) byte[] correlationId) {
		List<LoginResult> selectLoginResultList=null;
		try {
			String message = new String(data, Charset.defaultCharset());
			logger.debug("replyTo----------" + replyTo);
			logger.debug("receive----------" + message);
			logger.debug("correlationId------------" + correlationId);
			LoginResultDto loginResultDto = JSON.parseObject(message, LoginResultDto.class);
			// 转换
			selectLoginResultList = loginResultService.selectLoginResultList(loginResultDto);
			logger.debug(JSON.toJSONString(selectLoginResultList));
			// JSONArray cases =
			// JSONArray.parseArray(JSON.toJSONString(selectLoginResultList));

		} catch (Exception e) {
			logger.error("查询轨迹失败", e);
		}
		reply(replyTo, correlationId, selectLoginResultList);// 回调方法
	}

	private void reply(String replyTo, byte[] correlationId, List<LoginResult> msg) {
		amqpTemplate.convertAndSend(replyTo, JSON.toJSONString(msg), message1 -> {
			message1.getMessageProperties().setCorrelationId(correlationId);
			return message1;
		});
	}
}