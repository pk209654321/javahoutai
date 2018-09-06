package com.sscf.collect.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sscf.collect.entity.User;

@RestController 
@RequestMapping("/person") 
public class Test {
	
	    @RequestMapping("/getPerson") 
	    public Map<String,Object> getPerson(@RequestBody User user){ 
	        Map<String,Object> param = new HashMap<String, Object>(); 
	        String name = user.getName();
	        System.out.println(name);
	        param.put("person",user); 
	        int a=1;
	        return null; 
	} 
}
