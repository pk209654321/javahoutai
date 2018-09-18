package com.sscf.collect.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sscf.collect.dto.AiShareResultDto;
import com.sscf.collect.entity.User;
import com.sscf.collect.entity.share.AiShareResult;


public class Test {
	
	  public static void main(String[] args) {
		  AiShareResultDto a=new AiShareResultDto();
		  a.setStart_time("2018-09-12 00:00:00");
		  a.setEnd_time("2018-09-13 00:00:00");
		  a.setShare_channel(1);
		  a.setShare_scene(1);
		  //a.setSortType();
	}
}
