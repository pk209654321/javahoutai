package com.sscf.collect;

import com.alibaba.fastjson.JSON;
import com.sscf.collect.dto.AiShareResultDto;

public class TestApp {
	public static void main(String[] args) {
		AiShareResultDto a=new AiShareResultDto();
		a.setStart_time("2018-09-15");
		a.setEnd_time("2018-09-19");
		a.setRecommend_id(111);
		a.setShare_channel(111);
		a.setShare_scene(111);
		String jsonString = JSON.toJSONString(a);
		System.out.println(jsonString);
	}
}
