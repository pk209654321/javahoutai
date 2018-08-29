/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.dao;

import java.util.List;

import com.sscf.collect.dto.SpecialistDto;
import com.sscf.collect.entity.Specialist;

/**
 * @author lvcn
 */
public interface SpecialistDao {

    /**
     * 查询Specialist .
     * @param req 请求对象
     * @return
     */
    public List<Specialist> qrySpecialist(SpecialistDto dto);

    /**
     * 查询Specialist条数 .
     * @param req 请求对象
     * @return
     */
    public int getSpecialistCount(SpecialistDto dto);

}
