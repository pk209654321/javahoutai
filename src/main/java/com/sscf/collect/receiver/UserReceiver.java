package com.sscf.collect.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.sscf.collect.entity.login.LoginResult;

@Component
public class UserReceiver {
	// 接受者
	/*@RabbitListener(queues = "online-user-trace")
	public void process(LoginResult user) {
		System.out.println("1111111111111111111");
		System.out.println("Consumer 2 : " + user);
	}*/
}
