/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.PublicnoUserClickDto;
import com.sscf.collect.entity.PublicnoUserClick;


/**
 * @author lvcn
 */
public interface PublicnoUserClickDao {

    /**
     * 添加PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public int addPublicnoUserClick(PublicnoUserClick req);

    /**
     * 批量添加PublicnoUserClick .
     * @param list 请求列表
     * @return
     */
    public int addBatchPublicnoUserClick(List<PublicnoUserClick> list);

    /**
     * 获取PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public PublicnoUserClick getPublicnoUserClick(PublicnoUserClickDto dto);

    /**
     * 查询PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public List<PublicnoUserClick> qryPublicnoUserClick(PublicnoUserClickDto dto);

    /**
     * 查询PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public List<PublicnoUserClick> qryApiPublicnoUserClick(PublicnoUserClickDto dto);

    /**
     * 查询PublicnoUserClick条数 .
     * @param req 请求对象
     * @return
     */
    public int getPublicnoUserClickCount(PublicnoUserClickDto dto);

    /**
     * 修改PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public int modPublicnoUserClick(PublicnoUserClick entity);

    /**
     * 批量修改PublicnoUserClick .
     * @param list 请求列表
     * @return
     */
    public int modBatchPublicnoUserClick(List<PublicnoUserClick> list);

    /**
     * 删除PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public int delPublicnoUserClick(Long id);

    /**
     * 查询PublicnoUserClick .
     * @param req 请求对象
     * @return
     */
    public List<PublicnoUserClick> qryPublicnoUserClickForScoreTask(PublicnoUserClickDto dto);

}
