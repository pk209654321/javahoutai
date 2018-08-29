/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.SingleuserDto;
import com.sscf.collect.entity.Singleuser;

/**
 * @author lvcn
 */
public interface SingleuserDao {

    /**
     * 查询Singleuser .
     * @param req 请求对象
     * @return
     */
    public List<Singleuser> qrySingleuser(SingleuserDto dto);

    /**
     * 查询Singleuser条数 .
     * @param req 请求对象
     * @return
     */
    public int getSingleuserCount(SingleuserDto dto);

}
