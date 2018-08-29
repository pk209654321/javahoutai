/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.entity.PublicnoUserClick;
import com.sscf.education.common.entity.PageResult;
import com.sscf.collect.dao.PublicnoUserClickDao;
import com.sscf.collect.dto.PublicnoUserClickDto;
/**
 * @author lvcn
 */
@Component
public class PublicnoUserClickService {

    /** The PublicnoUserClick dao . */
    @Autowired
    private PublicnoUserClickDao publicnoUserClickDao;

    /**
     * 新增 PublicnoUserClick .
     *
     * @param entity 对象
     */
    public void addPublicnoUserClick(PublicnoUserClick entity) {
    	publicnoUserClickDao.addPublicnoUserClick(entity);
    }

    /**
     * 批量新增 PublicnoUserClick .
     *
     * @param entity 对象
     */
    public void addBatchPublicnoUserClick(List<PublicnoUserClick> list) {
        if (list != null && !list.isEmpty()) {
        	publicnoUserClickDao.addBatchPublicnoUserClick(list);
        }
    }

    /**
     * 删除 PublicnoUserClick .
     *
     * @param id id
     */
    public void delPublicnoUserClick(Long id) {
    	publicnoUserClickDao.delPublicnoUserClick(id);
    }

    /**
     * 更新 PublicnoUserClick .
     *
     * @param entity 对象
     */
    public void modPublicnoUserClick(PublicnoUserClick entity) {
    	publicnoUserClickDao.modPublicnoUserClick(entity);
    }

    /**
     * 批量更新 PublicnoUserClick .
     *
     * @param entity 对象
     */
    public void modBatchPublicnoUserClick(List<PublicnoUserClick> list) {
        if (list != null && !list.isEmpty()) {
        	publicnoUserClickDao.modBatchPublicnoUserClick(list);
        }
    }

    /**
     * 查询单个 PublicnoUserClick .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PublicnoUserClick getPublicnoUserClick(PublicnoUserClickDto dto) {
        return publicnoUserClickDao.getPublicnoUserClick(dto);
    }

    /**
     * 查询列表 PublicnoUserClick .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<PublicnoUserClick> qryPublicnoUserClick(PublicnoUserClickDto dto) {
        return publicnoUserClickDao.qryPublicnoUserClick(dto);
    }

    /**
     * 分页查询 PublicnoUserClick .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PageResult<PublicnoUserClick> qryPagePublicnoUserClick(PublicnoUserClickDto dto) {
        if (dto == null) {
            dto = new PublicnoUserClickDto();
        }
        int total = publicnoUserClickDao.getPublicnoUserClickCount(dto);
        PageResult<PublicnoUserClick> page = new PageResult<>(dto, total);
        if (page.isHasRows()) {
            List<PublicnoUserClick> list = publicnoUserClickDao.qryPublicnoUserClick(dto);
            page.setRows(list);
        }
        return page;
    }

    /**
     * 分页查询 PublicnoUserClick .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<PublicnoUserClick> qryApiPublicnoUserClick(PublicnoUserClickDto dto) {
        if (dto == null) {
            dto = new PublicnoUserClickDto();
        }
        return publicnoUserClickDao.qryApiPublicnoUserClick(dto);
    }

    public List<PublicnoUserClick> qryPublicnoUserClickForScoreTask(PublicnoUserClickDto dto) {
        if (dto == null) {
            dto = new PublicnoUserClickDto();
        }
        return publicnoUserClickDao.qryPublicnoUserClickForScoreTask(dto);
    }
}