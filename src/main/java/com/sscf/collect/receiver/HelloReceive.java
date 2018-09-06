package com.sscf.collect.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.sscf.collect.controller.BaseController;
import com.sscf.collect.entity.login.LoginResult;

@Component
public class HelloReceive {
	private static final Logger logger = LoggerFactory.getLogger(HelloReceive.class);
   /* @RabbitListener(queues="online-user-trace")    //监听器监听指定的Queue
    public void processC(LoginResult str) {
        System.out.println("Receive:"+str);
    }*/

}