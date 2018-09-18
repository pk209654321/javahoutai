package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sscf.collect.dao.AiShareResultDao;
import com.sscf.collect.dto.AiShareResultDto;
import com.sscf.collect.dto.CollectDto;
import com.sscf.collect.entity.Collect;
import com.sscf.collect.entity.share.AiShareResult;
import com.sscf.education.common.entity.PageResult;

@Component
public class AiShareResultService {
	
	@Autowired
	AiShareResultDao aiShareResultDao;
	 /**
     * 分页查询 Collect .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
  /*  public PageResult<Collect> qryPageCollect(CollectDto dto) {
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
	
	//分页
	public PageResult<AiShareResult> selectPageAiShareResult(AiShareResultDto dto){
		if(dto==null) {
			dto= new AiShareResultDto();
		}
		int total = aiShareResultDao.selectAiShareResultCount(dto);
		PageResult<AiShareResult> page = new PageResult<>(dto, total);
		if(page.isHasRows()) {
			List<AiShareResult> list = aiShareResultDao.selectAiShareResultList(dto);
			page.setRows(list);
		}
		return page;
	}
	
	

}
