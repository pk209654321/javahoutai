/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.CollectDto;
import com.sscf.collect.entity.Collect;

/**
 * @author lvcn
 */
public interface CollectDao {

    /**
     * 添加Collect .
     * @param req 请求对象
     * @return
     */
    public int addCollect(Collect req);

    /**
     * 批量添加Collect .
     * @param list 请求列表
     * @return
     */
    public int addBatchCollect(List<Collect> list);

    /**
     * 获取Collect .
     * @param req 请求对象
     * @return
     */
    public Collect getCollect(CollectDto dto);

    /**
     * 查询Collect .
     * @param req 请求对象
     * @return
     */
    public List<Collect> qryCollect(CollectDto dto);

    /**
     * 查询Collect .
     * @param req 请求对象
     * @return
     */
    public List<Collect> qryApiCollect(CollectDto dto);

    /**
     * 查询Collect条数 .
     * @param req 请求对象
     * @return
     */
    public int getCollectCount(CollectDto dto);

    /**
     * 修改Collect .
     * @param req 请求对象
     * @return
     */
    public int modCollect(Collect entity);

    /**
     * 批量修改Collect .
     * @param list 请求列表
     * @return
     */
    public int modBatchCollect(List<Collect> list);

    /**
     * 删除Collect .
     * @param req 请求对象
     * @return
     */
    public int delCollect(Long id);

    /**
     * 查询Collect .
     * @param req 请求对象
     * @return
     */
    public List<Collect> qryCollectForScoreTask(CollectDto dto);

}
