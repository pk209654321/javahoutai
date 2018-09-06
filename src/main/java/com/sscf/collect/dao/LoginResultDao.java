package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.LoginResultDto;
import com.sscf.collect.entity.login.LoginResult;

public interface LoginResultDao {
	public List<LoginResult> selectLoginResultList(LoginResultDto loginResultDto);
	
	public int getLoginResultCount(LoginResultDto loginResultDto);
}
