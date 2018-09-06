package com.sscf.collect.receiver;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.entity.login.LoginResult;

@Component
public class HelloSender {
	/*@Autowired
	private AmqpTemplate template;

	public void send() {
		LoginResult loginResult = new LoginResult();
		loginResult.setId(1L);
		loginResult.setInsert_time("2018-08-17 12:44:44");
		loginResult.setLogin_count(11);
		loginResult.setUser_id(2);
		template.convertAndSend("online-user-trace", loginResult);
	}*/
}