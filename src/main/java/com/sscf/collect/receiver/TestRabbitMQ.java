package com.sscf.collect.receiver;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.CollectApplication;
import com.sscf.collect.dto.LoginResultDto;

@SpringBootTest(classes=CollectApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitMQ {
    
   /* @Autowired
    private HelloSender helloSender;
	*/
	
    @Test
    public void testRabbit() throws IOException, TimeoutException, InterruptedException {
    	LoginResultDto l=new LoginResultDto();
    	//l.setMobile("1848884991");
    	l.setEnd_time("2018-09-03 24:00:00");
    	l.setStart_time("2018-09-03 00:00:00");
    /*	l.setUser_id(46925);
    	l.setUser_name("ZJQ");*/
    	String jsonString = JSON.toJSONString(l);
    	RPCClient2 rpcClient2 = new RPCClient2();
    	rpcClient2.call(jsonString);
    	//RpcClient.execute("121.196.192.154", "admin", "123456", jsonString);
    }
}