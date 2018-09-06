package com.sscf.collect.receiver;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.entity.login.LoginResult;

@Component
public class TopicSender {
	@Autowired
	private AmqpTemplate rabbitTemplate;
 
	/**
	 * Exchanges中创建topic
	 * 
	 * @param user
	 */
	public void send(LoginResult user) {
		String msg1 = "I am topic.mesaage msg======";
		System.out.println("sender1 : " + msg1);
		this.rabbitTemplate.convertAndSend("online-user-trace", user);
	}
	
}