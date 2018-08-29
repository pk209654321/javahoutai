/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.VideoplayDao;
import com.sscf.collect.dto.VideoplayDto;
import com.sscf.collect.entity.Videoplay;
import com.sscf.education.common.entity.PageResult;

/**
 * @author lvcn
 */
@Component
public class VideoplayService {

    /** The videoplay dao . */
    @Autowired
    private VideoplayDao videoplayDao;

    /**
     * 查询列表 Videoplay .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<Videoplay> qryVideoplay(VideoplayDto dto) {
        return videoplayDao.qryVideoplay(dto);
    }

    /**
     * 分页查询 Videoplay .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PageResult<Videoplay> qryPageVideoplay(VideoplayDto dto) {
        if (dto == null) {
            dto = new VideoplayDto();
        }
        int total = videoplayDao.getVideoplayCount(dto);
        PageResult<Videoplay> page = new PageResult<>(dto, total);
        if (page.isHasRows()) {
            List<Videoplay> list = videoplayDao.qryVideoplay(dto);
            page.setRows(list);
        }
        return page;
    }

}