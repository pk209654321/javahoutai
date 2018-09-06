package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.LoginResultDao;
import com.sscf.collect.dto.CollectDto;
import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.Collect;
import com.sscf.collect.entity.login.LoginResult;
import com.sscf.education.common.entity.PageResult;

@Component
public class LoginResultService {
	@Autowired
	LoginResultDao loginResultDao;
	
	public PageResult<LoginResult> selectPageLoginResult(LoginResultDto dto){
		if(dto==null) {
			dto=new LoginResultDto();
		}
		int total = loginResultDao.getLoginResultCount(dto);
		PageResult<LoginResult> page = new PageResult<>(dto, total);
		if(page.isHasRows()) {
			List<LoginResult> list = loginResultDao.selectLoginResultList(dto);
			page.setRows(list);
		}
		return page;
	}
	
	 /*public PageResult<Collect> qryPageCollect(CollectDto dto) {
	        if (dto == null) {
	            dto = new CollectDto();
	        }
	        int total = collectDao.getCollectCount(dto);
	        PageResult<Collect> page = new PageResult<>(dto, total);
	        if (page.isHasRows()) {
	            List<Collect> list = collectDao.qryCollect(dto);
	            page.setRows(list);
	        }
	        return page;
	    }*/
	public List<LoginResult> selectLoginResultList(LoginResultDto dto){
		List<LoginResult> list = loginResultDao.selectLoginResultList(dto);
		return list;
	}
}
