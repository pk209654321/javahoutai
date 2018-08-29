/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.CollectDao;
import com.sscf.collect.dto.CollectDto;
import com.sscf.collect.entity.Collect;
import com.sscf.education.common.entity.PageResult;

/**
 * @author lvcn
 */
@Component
public class CollectService {

    /** The collect dao . */
    @Autowired
    private CollectDao collectDao;

    /**
     * 新增 Collect .
     *
     * @param entity 对象
     */
    public void addCollect(Collect entity) {
        collectDao.addCollect(entity);
    }

    /**
     * 批量新增 Collect .
     *
     * @param entity 对象
     */
    public void addBatchCollect(List<Collect> list) {
        if (list != null && !list.isEmpty()) {
            collectDao.addBatchCollect(list);
        }
    }

    /**
     * 删除 Collect .
     *
     * @param id id
     */
    public void delCollect(Long id) {
        collectDao.delCollect(id);
    }

    /**
     * 更新 Collect .
     *
     * @param entity 对象
     */
    public void modCollect(Collect entity) {
        collectDao.modCollect(entity);
    }

    /**
     * 批量更新 Collect .
     *
     * @param entity 对象
     */
    public void modBatchCollect(List<Collect> list) {
        if (list != null && !list.isEmpty()) {
            collectDao.modBatchCollect(list);
        }
    }

    /**
     * 查询单个 Collect .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public Collect getCollect(CollectDto dto) {
        return collectDao.getCollect(dto);
    }

    /**
     * 查询列表 Collect .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<Collect> qryCollect(CollectDto dto) {
        return collectDao.qryCollect(dto);
    }

    /**
     * 分页查询 Collect .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PageResult<Collect> qryPageCollect(CollectDto dto) {
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
    }

    /**
     * 分页查询 Collect .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<Collect> qryApiCollect(CollectDto dto) {
        if (dto == null) {
            dto = new CollectDto();
        }
        return collectDao.qryApiCollect(dto);
    }

    public List<Collect> qryCollectForScoreTask(CollectDto dto) {
        if (dto == null) {
            dto = new CollectDto();
        }
        return collectDao.qryCollectForScoreTask(dto);
    }
}