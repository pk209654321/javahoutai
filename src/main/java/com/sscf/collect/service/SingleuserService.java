/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.SingleuserDao;
import com.sscf.collect.dto.SingleuserDto;
import com.sscf.collect.entity.Singleuser;
import com.sscf.education.common.entity.PageResult;

/**
 * @author songyong
 */
@Component
public class SingleuserService {

    /** The singleuser dao . */
    @Autowired
    private SingleuserDao singleuserDao;

    /**
     * 查询列表 Singleuser .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<Singleuser> qrySingleuser(SingleuserDto dto) {
        return singleuserDao.qrySingleuser(dto);
    }

    /**
     * 分页查询 Singleuser .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PageResult<Singleuser> qryPageSingleuser(SingleuserDto dto) {
        int total = singleuserDao.getSingleuserCount(dto);
        PageResult<Singleuser> page = new PageResult<>(dto, total);
        if (page.isHasRows()) {
            List<Singleuser> list = singleuserDao.qrySingleuser(dto);
            page.setRows(list);
        }
        return page;
    }

    /**
     * 查询Singleuser条数 .
     * @param req 请求对象
     * @return
     */
    public int getSingleuserCount(SingleuserDto dto) {

        return singleuserDao.getSingleuserCount(dto);
    }
}