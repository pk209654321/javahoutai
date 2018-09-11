package com.sscf.collect.receiver;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.CollectApplication;
import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.PubAttributeLogin;
import com.sscf.collect.entity.login.LoginResult;
import com.sscf.collect.service.LoginResultService;
@SpringBootTest(classes=CollectApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {
    
    @Autowired
    private HelloSender helloSender;
	
    @Autowired
    LoginResultService loginResultService;
    
	
    //@Test
    public void testRabbit() throws IOException, TimeoutException, InterruptedException {
    	PubAttributeLogin pubAttributeLogin = new PubAttributeLogin();
    	pubAttributeLogin.setApi("user-trace");
    	pubAttributeLogin.setTimestamp(new Date().getTime());
    	pubAttributeLogin.setVersion(1);
    	LoginResultDto l=new LoginResultDto();
    	//l.setMobile("17719502671");
    	l.setEnd_time("2018-09-03 24:00:00");
    	l.setStart_time("2018-09-03 00:00:00");
    	//l.setUser_id(46923);
    	pubAttributeLogin.setData(l);
    	String jsonString = JSON.toJSONString(pubAttributeLogin);
    	RPCClient2 rpcClient2 = new RPCClient2();
    	rpcClient2.call(jsonString);
    	//RpcClient.execute("121.196.192.154", "admin", "123456", jsonString);
    }
    @Test
    public void testResult() {
    	LoginResultDto l=new LoginResultDto();
    	l.setStart_time("2018-09-03 00:00:00");
    	l.setEnd_time("2018-09-11 24:00:00");
    	l.setMobile("13073333333");
    	List<LoginResult> selectLoginResultList = loginResultService.selectLoginResultList(l);
    	System.out.println(selectLoginResultList);
    }
}