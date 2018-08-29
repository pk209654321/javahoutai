/**
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: 霍尔果斯牛富软件有限公司</p>
 */
package com.sscf.collect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sscf.collect.dao.SpecialistDao;
import com.sscf.collect.dto.SpecialistDto;
import com.sscf.collect.entity.Specialist;
import com.sscf.education.common.entity.PageResult;

/**
 * @author lvcn
 */
@Component
public class SpecialistService {

    /** The specialist dao . */
    @Autowired
    private SpecialistDao specialistDao;

    /**
     * 查询列表 Specialist .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public List<Specialist> qrySpecialist(SpecialistDto dto) {
        return specialistDao.qrySpecialist(dto);
    }

    /**
     * 分页查询 Specialist .
     *
     * @param dto 查询对象
     * @return 响应结果
     */
    public PageResult<Specialist> qryPageSpecialist(SpecialistDto dto) {
        if (dto == null) {
            dto = new SpecialistDto();
        }
        int total = specialistDao.getSpecialistCount(dto);
        PageResult<Specialist> page = new PageResult<>(dto, total);
        if (page.isHasRows()) {
            List<Specialist> list = specialistDao.qrySpecialist(dto);
            page.setRows(list);
        }
        return page;
    }

}