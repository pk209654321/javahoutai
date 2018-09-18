package com.sscf.collect.dao;

import java.util.List;
import java.util.Map;

import com.sscf.collect.dto.AiShareResultDto;
import com.sscf.collect.entity.share.AiShareResult;

public interface AiShareResultDao {
	public List<AiShareResult> selectAiShareResultList(AiShareResultDto dto);
	
	public int selectAiShareResultCount(AiShareResultDto dto);
}
